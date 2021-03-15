package trees;

import java.util.ArrayList;

public class BST {
	Node root;
	public BST() {
		this.root=null;
	}
	
	public void addViaArray(int arr[]) {
		for(int a:arr) {
			this.root=add(root,a);
		}
	}


	private Node  add(Node root, int a) {
		// TODO Auto-generated method stub
		if(root==null) {
			root=new Node(a);
			
			return root;
			
		}
		 if(a<root.data) {
			root.left= add(root.left,a);
		}
		 else
			 root.right= add(root.right,a);
		 return root;
		
	}
	public void addNode(int a)
	{
		addNode(root,a);
	}
	private Node addNode(Node root, int a) {
		// TODO Auto-generated method stub
		if(root==null) {
			Node node= new Node(a);
			root=node;
			return root;
		}
		else if(root.data>a) {
			root.left=add(root.left,a);
		}
		else 
			root.right= add(root.right,a);
		return root;
	}

	public void display2() {
		display2(root);
	}
	private void display2(Node root) {
		if(root!=null) {
			
			String str1=root.left!=null?root.left.data+"-->":"...-->";
			String str2=root.right!=null?"<--"+root.right.data:"<--...";
			System.out.println(str1+root.data+str2);
		
		display2(root.left);
		display2(root.right);
		}
	}
	public void display() {
		System.out.println(Result(this.root));
	}
	public ArrayList<Integer> Result(Node root){
		ArrayList<Integer> res= new ArrayList<Integer>();
		 Inorder(this.root, res);
//		 Postorder(this.root,res);
		 return res;
	}
	
	private ArrayList<Integer> Inorder(Node root,ArrayList<Integer> res) {
		// TODO Auto-generated method stub
		if(root== null)
			return res;
		Inorder(root.left,res);
		res.add(root.data);
		Inorder(root.right,res);
	return res;
	}
	
	private ArrayList<Integer> Preorder(Node root, ArrayList<Integer> res){
		
		if(root== null)
			return res;
		res.add(root.data);
		Preorder(root.left,res);
		Preorder(root.right,res);
		return res;
	}
	private ArrayList<Integer> Postorder(Node root, ArrayList<Integer>res){
		if (root==null)
		return res;
		Postorder(root.left,res);
		Postorder(root.right,res);
		res.add(root.data);
		return res;
	}
	public int max() {
		return max(root);
	}
	private int max(Node root) {
		if(root.right==null)
			return root.data;
		return max(root.right);
	}
	public int min() {
		return min(root);
	}
	private int min(Node root) {
		if(root.left==null)
			return root.data;
		return max(root.left);
	}
	public void pir(int low, int high) {
		pir( root, low,high);
	}

	private void pir(Node root, int low, int high) {
		// TODO Auto-generated method stub
		if(root==null)
			return;
		if(root.data>high)
			pir(root.left, low,high);
		else if(root.data>=low&&root.data<=high)
		{
			System.out.println(root.data);
			pir(root.left,low,high);
			pir(root.right,low,high);
		}
		else if(root.data<low) {
			pir(root.right,low,high);
		}
	}
	public void targetSumPair(int sum) {
		targetSumPair(root,sum);
	}

	private void targetSumPair(Node root, int sum) {
		// TODO Auto-generated method stub
		if(root==null)
			return;
		if(find(sum-root.data)) {
			if(root.data<sum-root.data)
			System.out.println(root.data+ "  " + (sum-root.data));
		}
		this.targetSumPair(root.left,sum);
		this.targetSumPair(root.right,sum);
	}
	public boolean find(int d) {
		return find(root,d);
	}
	private boolean find(Node root,int d) {
		if(root==null)
			return false;
		if(root.data==d)
			return true;
		if(d<root.data)
			return find(root.left,d);
		else
			return find(root.right,d);
	}
	public int LCA(int d1,int d2) {
		return LCA(root,d1,d2);
	}

	private int LCA(Node root, int d1,int d2) {
		// TODO Auto-generated method stub
		if(d1>root.data&&d2>root.data)
			return LCA(root.right,d1,d2);
		else if(d1<root.data&&d2<root.data)
			return LCA(root.left,d1,d2);
		else
		return root.data;
	}
	private int sum;
	public void replacewithlargersumNode() {
		sum=0;
		replacewithlargersumNode(root);
		display();
	}

	private void replacewithlargersumNode(Node root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return;
		}
		replacewithlargersumNode(root.right);
		int nodedataold=root.data;
		root.data=sum;
		sum+=nodedataold;
		replacewithlargersumNode(root.left);
	}
	public Node removeNode(int a) {
		return removeNode(root,a);
	}

	private Node removeNode(Node root, int a) {
		// TODO Auto-generated method stub
		if(a<root.data)
			root.left=removeNode(root.left,a);
		else if(a>root.data)
			root.right=removeNode(root.right,a);
		else {
			//no child
			if(root.left==null&& root.right==null)
			{	return null;
			}
			else if(root.left==null) {
				return root.right;
			}
			else if(root.right==null) {
				return root.left;
			}
			else
			{
				int lmax=this.max(root.left);
				root.data=lmax;
				root.left=removeNode(root.left,lmax);
				return root;
			}
			
			
		}
		return root;
	}
	
}
