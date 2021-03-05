package GenericTree;

import java.util.ArrayList;

import java.util.Stack;
public class GenericTree {
	class Node{
		int data;
		ArrayList<Node> children= new ArrayList<>();
	}
	private Node root;
	private int size;
	public  GenericTree(int arr[]) {
		Stack<Node> stack= new Stack<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==-1) {
				stack.pop();
			}
			else {
				Node node= new Node();
				node.data=arr[i];
				this.size++;
				if(stack.size()>0) {
					stack.peek().children.add(node);
				}
				else
				{
					root=node;
				}
				stack.push(node);		
			}
		}
	}
	
	public int sizedirect() {
		return this.size;
	}
	public void display() {
		display(root);
	}
	private void display(Node root) {
		// TODO Auto-generated method stub
		String S= root.data +"-->";
		for(Node child:root.children) {
			S+=child.data+"  ";
		}
		S+=" . ";
		System.out.println(S);
		for(Node child:root.children) {
			display(child);
		}
	}
	public ArrayList<Integer>BFS(){
		ArrayList<Integer> res= new ArrayList<Integer>();
		 BFS(this.root, res);
		 return res;
	}

	private void BFS(Node root, ArrayList<Integer> res) {
		// TODO Auto-generated method stub
		if(root!=null)
			res.add(root.data);
		for(Node child:root.children) {
			BFS(child,res);
		}
		
	}

	public int size() {
		if(root==null)
			return 0;
		return size(root);
	}
	private int size(Node root) {
		int size=0;
		for(Node child: root.children ) {
			int csize=size(child);
			size+=csize;
		}
		return size+1 ;

}
	public int Max() {
		return Max(root);
	}
	private int Max(Node root) {
		int max=Integer.MIN_VALUE;
		max= Math.max(root.data, max);
		for(Node child:root.children) {
			max=Math.max(max, Max(child));
		}
		return max;
	}
	public int Min() {
		return Min(root);
	}
	private int Min(Node root) {
		int min=Integer.MAX_VALUE;
		min= Math.max(root.data, min);
		for(Node child:root.children) {
			min=Math.min(min, Max(child));
		}
		return min;
	}
	
	public int Height() {
		return Height(root);
	}
	private int Height(Node root) {
		int ht=0;
		
		for(Node child:root.children) {
			ht=Math.max(ht, Height(child));
		}
		return ht+1;
	}
	
	public ArrayList<Integer> NodeToRootPath(int d){
		return NodeToRoot(root,d);
	}
	private ArrayList<Integer>  NodeToRoot(Node root,int d) {
		// TODO Auto-generated method stub
		if(root.data==d) {
			ArrayList<Integer> br=new ArrayList<Integer>();
			br.add(d);
			return br;
		}
		ArrayList<Integer>mrs= new ArrayList<Integer>();
		for(Node child:root.children) {
			ArrayList<Integer> rrs= NodeToRoot(child,d);
			if(rrs.size()>0) {
				mrs=rrs;
				mrs.add(root.data);
				return mrs;
			}
		
		}
		return new ArrayList<>();
		
	}
	public boolean find(int d) {
		return find(root,d);
	}
	private boolean find(Node root, int d) {
		// TODO Auto-generated method stub\
		if(root.data==d) {
			return true;
		}
		for(Node child:root.children) {
			boolean cres=find(child,d);
			if(cres==true)
				return true;
		}
		
		return false;
	}
	public void removeleafs() {
		removeleafs(root);
	}
	
	private void removeleafs(Node root) {
		
		for(int i=root.children.size()-1;i>=0;i--){
			Node Child= root.children.get(i);
			if(Child.children.size()>0) {
				removeleafs(Child);
			}
			else
				root.children.remove(Child);
		}
	}
	public void mirror() {
		mirror(root);
	}
	private void mirror(Node root) {
		if(root.children.size()>1) {
			for(int i=0;i<root.children.size()/2;i++) {
				Node temp=root.children.get(i);
				root.children.set(i, root.children.get(root.children.size()-1-i));
				root.children.set(root.children.size()-1-i,temp);
			}
		}
		for(Node child:root.children) {
			mirror(child);
		}
	}
	public void linearise() {
		ArrayList<Node> res=new ArrayList<Node>();
		linearise(root,res);
		Node curr= root;
		for(Node c:res) {
			curr.children.clear();
			curr.children.add(c);
			curr=curr.children.get(0);
		}	
		
		
	}
	private void linearise(Node root, ArrayList<Node> res) {
		res.add(root);
		for(Node child: root.children) {
			linearise(child,res);	
		}
		
	}
	public void linearise2() {
		this.linearise2(root);
	}
	private void linearise2(Node root) {
		
		for(Node child:root.children) {
			this.linearise2(child);
		}
		
		while(root.children.size()>1) {
			Node last=root.children.remove(root.children.size()-1);
			Node currlast=root.children.get(root.children.size()-1);
			while(currlast.children.size()>=1) {
				currlast=currlast.children.get(0);
			}
			currlast.children.add(last);
		}
	}
    static boolean aresimilarshaped(GenericTree gt1, GenericTree gt2) {
		return aresimilarshaped(gt1.root,gt2.root);
	}
	private static boolean aresimilarshaped(Node root1, Node root2) {
		// TODO Auto-generated method stub
		if(root1.children.size()!=root2.children.size())
			return false;
		for(int i=0;i<root1.children.size();i++) {
			if(aresimilarshaped(root1.children.get(i),root2.children.get(i))==false)
				return false;
		}
		
		return true;
	}
	public int LowestCommonAncestor(int d1,int d2) {
		return LowestCommonAncestor(root,  d1,d2);
	}
	private int LowestCommonAncestor(Node root, int d1, int d2) {
		// TODO Auto-generated method stub
		ArrayList<Integer> path1= this.NodeToRoot(root, d1);
		ArrayList<Integer> path2= this.NodeToRoot(root, d2);
		int i=path1.size()-1;
		int j=path2.size()-1;
		while(i>=0&&j>=0&&path1.get(i)==path2.get(j)) {
			i--;
			j--;
		}
		return path1.get(i+1);
	}
	public int DistanceBWnode(int d1, int d2) {
		return DistanceBWnode(root, d1,d2);
	}
	private int DistanceBWnode(Node root, int d1, int d2) {
		// TODO Auto-generated method stub
		ArrayList<Integer> path1= this.NodeToRoot(root, d1);
		ArrayList<Integer> path2=this.NodeToRoot(root, d2)	;
		int i=path1.size()-1;
		int j=path2.size()-1;
		while(i>=0&&j>=0&&path1.get(i)==path2.get(j)) {
			i--;
			j--;
		}
		i++;
		j++;
		
		return i+j;
	}
	public static boolean isMirror(GenericTree GT1,GenericTree GT2) {
		return isMirror(GT1.root,GT2.root);
	}
	private static boolean isMirror(Node root1, Node root2) {
		if(root1==null&&root2==null)
			return true;
		if(root1==null||root2==null)
			return false;
		if(root1.children.size()!=root2.children.size()) {
			return false;
		}
		for(int i=0;i<root1.children.size();i++) {
			int j=root2.children.size()-i-1;
			if(isMirror(root1.children.get(i),root2.children.get(j))==false){
				return false;
			}
		}
		return true;
	}
	public static boolean isSymmetric(GenericTree GT1) {
		return isMirror(GT1.root,GT1.root);
	}
	public void PredSuccNode(int d) {
		PredSuccNode(this.root,d);
	}

	private void PredSuccNode(Node root, int d) {
		// TODO Auto-generated method stub
		ArrayList<Integer> path= this.BFS();
		if(path.get(0)==d) {
			System.out.println("Predessor: NOt Found the given Data is Root" );
			System.out.println("Succesoor: "+ path.get(1));
			return;
		}
		if(path.get(path.size()-1)==d) {
			
			System.out.println("Predessor "+ path.get(path.size()-2));
			System.out.println("successor: Not Found the given Data is last leaf NOde " );
			return;
		}
		int i=1;
		for(;i<path.size()-1;i++) {
			if(path.get(i)==d) {
				System.out.println("Predessor : " + path.get(i-1));
				System.out.println("Successsor:  "+ path.get(i+1));
				return;
			}
		}
		if(i==path.size()-1) {
			System.out.println("Element NOt Found!!! Try Agian!!");
		}
	}
	
	
	
}
