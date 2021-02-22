package trees;

import java.util.ArrayList;

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
public ArrayList<Integer> printnodetoRoot(Node root, int num) {
	if(root==null) {
		ArrayList <Integer>br=new ArrayList<>();
		return br;
	}
	if(root.data==num) {
		ArrayList<Integer> mr=new ArrayList<>();
		mr.add(num);
		return mr;
	}
	ArrayList<Integer>mrl=printnodetoRoot(root.left,num);
	if(mrl.size()>0) {
		mrl.add(root.data);
		return mrl;
	}
	
	ArrayList<Integer> mrr=printnodetoRoot(root.right,num);
	if( mrr.size()>0) {
		mrr.add(root.data);
		return mrr;
	}
	
	ArrayList <Integer>br=new ArrayList<>();
	return br;
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

public  void removeLeafs(Node parent, Node child) {

	if (child == null) {
		return;
	}
	if (child.left == null && child.right == null) {
		if (parent.left == child) {
			parent.left = null;
		} else {
			parent.right = null;
		}
		return;
	}

	removeLeafs(child, child.left);
	removeLeafs(child, child.right);
}
}
