package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TreeImp {
	Node root;
    public TreeImp(Node root) {
		// TODO Auto-generated constructor stub
	 this.root=root;
	 
	 }
     public void add(Node Newnode,int  atwhich,Node root, char pos) {
	 if(root==null) {
		 this.root=Newnode;
	 }
	 else {
		 Node current=find(atwhich,root);
		 if(pos=='L'&& current.left==null) {
			 current.left=Newnode;
			 return;
		 }
		 if(pos=='R'&&current.right==null) {
			 current.right=Newnode;
			 return;
		 }
		 else
			 throw new RuntimeException("Already Present");
	 }
 }
 public Node find(int  number, Node root) {
	 if(root==null)
		 return null;
	 if(root.data==number) 
	   return root;
	 
	 Node fromleft=find(number,root.left);
	 Node fromright=find(number,root.right);
	  
	 return fromleft!=null?fromleft:fromright;
 }
public void display(Node root) {
	// TODO Auto-generated method stub
	if(root==null) 
		return;
	String str1=root.left!=null?root.left.data+"-->":"..-- >";
	String str2=root.right!=null?"<--"+root.right.data:"<--..";
	System.out.println(str1+ root.data+ str2);
	display(root.left);
	display(root.right);
	
}
public void inorder(Node root) {
	if(root==null)
		return;
	inorder(root.left);
	System.out.print(root.data +"\t");
	inorder(root.right);
	
}
public void preorder(Node root) {
	if(root==null)
		return;
	System.out.print(root.data+"\t");
	preorder( root.left);
	preorder(root.right);
	return;
}
public void postorder(Node root) {
	if(root==null) 
		return;
	postorder(root.left);
	postorder(root.right);
	System.out.print(root.data+"\t");
	return;
}
public int sizeoftree(Node root) {
	if(root==null)
		return 0;
	int leftsize=sizeoftree(root.left);
	int rightsize=sizeoftree(root.right);
	return leftsize+rightsize+1;	
}
public int heightoftree(Node root) {
	if(root==null)
		return 0;
	int lH=heightoftree(root.left);
	int rH=heightoftree(root.right);
	int h=Math.max(lH, rH);
	return h+1;// now including root self
}
public void printAllPathRoottoLeaf(Node root, String str) {
	if(root.left==null&& root.right==null) {
		str+=root.data;
		System.out.println(str);
		return;
	}
	printAllPathRoottoLeaf(root.left ,str+root.data);
	printAllPathRoottoLeaf(root.right ,str+root.data);
}
public void printnodetoRoot(Node root, int num) {
	ArrayList<Node> result=pathnodetoRoot(root,num);
	for(Node N:result) {
		System.out.println(N.data+"  ");
	}
}
public ArrayList<Node> pathnodetoRoot(Node root, int num) {
	if(root==null) {
		ArrayList <Node>br=new ArrayList<>();
		return br;
	}
	if(root.data==num) {
		ArrayList<Node> mr=new ArrayList<>();
		mr.add(root);
		return mr;
	}
	ArrayList<Node>mrl=pathnodetoRoot(root.left,num);
	if(mrl.size()>0) {
		mrl.add(root);
		return mrl;
	}
	
	ArrayList<Node> mrr=pathnodetoRoot(root.right,num);
	if( mrr.size()>0) {
		mrr.add(root);
		return mrr;
	}
	
	
	return new ArrayList<>();
}
public int max(Node root) {
	if(root ==null) {
		return Integer.MIN_VALUE;
	}
	int lmax=max(root.left);
	int rmax=max(root.right);
	int maxlr=Math.max(lmax, rmax);
	return Math.max(maxlr, root.data);
}
public int min(Node root) {
	if(root ==null) {
		return Integer.MAX_VALUE;
	}
	int lmin=min(root.left);
	int rmin=min(root.right);
	int minlr=Math.min(lmin, rmin);
	return Math.min(minlr, root.data);
}

public void levelorder(Node root) {
   Queue<Node> queue=new LinkedList<>();
   System.out.println("LevelOrder traversal");
   if(root!=null)
     queue.add(root);
   while(queue.size()!=0) {
	   if(root.left!=null)
		   queue.add(root.left);
	   if(root.right!=null)
		   queue.add(root.right);
	   System.out.print(queue.poll().data+ " ");
	   root=queue.peek();
   }
}

public void removeleaf(Node parent, Node child) {
	if(child==null) {
		return;
	}
	if(child.left==null&& child.right==null) {
		if(parent.left==child)
			parent.left=null;
		else parent.right=null;
	}
	removeleaf(child,child.left);
	removeleaf(child,child.right);
}

public void printsinglechild(Node root) {
	if (root==null) {
		return;
	}
	if(root.left!=null && root.right==null) {
		System.out.print(root.left.data+"\t");
	}
	else if(root.right!=null&& root.left==null) {
		System.out.print(root.right.data+"\t");
	}
	printsinglechild(root.left);
	printsinglechild(root.right);
}
public void printPathLowHigh(Node root,int low,int high, int sum, String str) {
	if (root ==null)
		return;
	if(root.left==null&&root.right==null) {
		sum+=root.data;
		str+= root.data+" ";
		if(sum<high&&sum>low)
			System.out.println(str);
		return;
	}
	
	printPathLowHigh(root.left,low,high,sum+root.data,str+root.data+"  ");
	printPathLowHigh(root.right,low,high,sum+root.data,str+root.data+"  ");
}
public void printKDown(Node root,int k, Node Blocker) {
	if(k<0||root==null|| root==Blocker) {
		return;
	}
	if(k==0)
		System.out.println(root.data);
	printKDown(root.left,k-1,Blocker);
	printKDown(root.right,k-1,Blocker);
}
public void printKaway(Node root,int num,int k) {
	ArrayList<Node> path= this.pathnodetoRoot(root, num);
	this.printKDown(path.get(0),k,null);
	for(int i=1;i<path.size()&&i<k;i++) {
		this.printKDown(path.get(i),k-i,path.get(i-1));
	}
}
public void printrightview(Node root) {
	Queue <Node> queue=new LinkedList<Node>();
	ArrayList<Integer> res=new ArrayList<Integer>();
	queue.add(root);
	queue.add(null);
	while(!queue.isEmpty()) {
		Node curr =queue.peek();
		if(curr!=null) {
			if(curr.left!=null)
				queue.add(curr.left);
				queue.add(curr.right);
		}
		else
			queue.add(queue.poll());
		Node element=queue.poll();
		curr=queue.peek();
		if(curr==null) {
			if(element!=null)
				res.add(element.data);
		}
	}
	System.out.println(res);
	
	
}
public void printleftview(Node root) {
	Queue<Node>queue= new LinkedList<Node>();
	ArrayList<Integer>res =new ArrayList<Integer>();
	queue.add(root);
	queue.add(null);
	if(root!=null)
		res.add(root.data);
	while(!queue.isEmpty()) {
		Node curr=queue.poll();
		if(curr==null) {
			if(queue.peek()!=null)
				{res.add(queue.peek().data);
			    queue.add(curr);
		}}
		
		else {
			if(curr.left!=null)
				queue.add(curr.left);
			if(curr.right!=null)
				queue.add(curr.right);	
		}
	}
	
	System.out.println(res);
	
}
public void leftViewRecursive() {
	
}
}
