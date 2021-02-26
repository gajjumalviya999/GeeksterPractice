package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
int printedlevel=0;
public void leftViewRecursive(Node root, int level) {
	if(root==null)
		return;
	if(printedlevel<level) {
		System.out.print(root.data+"\t");
		printedlevel=level;
	}
	leftViewRecursive(root.left,level+1);
	leftViewRecursive(root.right,level+1);
	
}
int rprintedlevel=0;
public void rightViewRecursive(Node root,int level) {
	if(root==null)
		return;
	if(rprintedlevel<level) {
		System.out.print(root.data+"\t");
		rprintedlevel=level;
	}
	rightViewRecursive(root.right,level+1);
	rightViewRecursive(root.left,level+1);
	
}
public int LowestCommonAncestor(Node root, int x,int y) {
	ArrayList<Node> pathx= this.pathnodetoRoot(root, x);
	ArrayList<Node> pathy=this.pathnodetoRoot(root, y);
//	System.out.println(pathx);
//	System.out.println(pathy);
	int i=pathx.size()-1;
	int j=pathy.size()-1;
	while(pathx.get(i)==pathy.get(j)) {
		i-=1;
		j-=1;
	}
	
	return pathx.get(i+1).data;
}

static class Pair{
	Node node;
	int wc;
	public Pair(Node node,int wc) {
		this.node=node;
		this.wc=0;
	}
}
public void itterativepreorder(Node root) {
	System.out.println("PreOrder");
	Stack <Pair> stack= new Stack<Pair>();
	Pair tpair=new Pair(root,0);
	stack.push(tpair);
	while(!stack.isEmpty()) {
		Pair tp=stack.peek();
		if(tp.wc==0) {
			System.out.print(tp.node.data+"\t");
			tp.wc++;
		}
		else if(tp.wc==1) {
		  if(tp.node.left!=null)	
		  {  Pair leftN= new Pair	(tp.node.left,0);
			stack.push(leftN);
		  }
		  tp.wc++;
		}
		else if(tp.wc==2) {
			  if(tp.node.left!=null)	
			  {  Pair rightN= new Pair	(tp.node.right,0);
				stack.push(rightN);
			  }
			  tp.wc++;
			}
		else
			stack.pop();
		
	}
	System.out.println();
}

public void itterativeinorder(Node root) {
	System.out.println("Inorder");
	Stack<Pair> stack= new Stack<>();
	Pair pair= new Pair(root,0);
	stack.push(pair);
	while(!stack.isEmpty()) {
		Pair tpair=stack.peek();
		if(tpair.wc==0) {
			if(tpair.node.left!=null)
			{	Pair leftN = new Pair(tpair.node.left,0);
				stack.push(leftN);
				
			}
			tpair.wc++;
		}
		else if(tpair.wc==1) {
			System.out.print(tpair.node.data+"\t");
			tpair.wc++;
		}
		else if(tpair.wc==2) {
			if(tpair.node.right!=null)
				{Pair rightN=new Pair(tpair.node.right,0);
				stack.push(rightN);	
				}
			tpair.wc++;
		}
		else
			stack.pop();
		
		}
	System.out.println();
	
}
public void itterativepostorder(Node root) {
	System.out.println("PostOrder");
	Stack<Pair> stack= new Stack<Pair>();
	if(root!=null)
		{Pair pair=new Pair(root,0);
			stack.push(pair);
		}
	while(!stack.isEmpty()) {
		Pair tpair=stack.peek();
		if(tpair.wc==0) {
			if(tpair.node.left!=null) {
				Pair leftN=new Pair(tpair.node.left,0);
				stack.push(leftN);
			}
			tpair.wc++;
		}
		else if(tpair.wc==1) {
			if(tpair.node.right!=null) {
				Pair rightN=new Pair(tpair.node.right,0);
				stack.push(rightN);
			}
			tpair.wc++;
		}
		else if(tpair.wc==2) {
			System.out.print(tpair.node.data+"\t");
			tpair.wc++;
		}
		else
			stack.pop();
	}
	System.out.println();
	
}


public boolean isbalanced(Node root) {
	if (root==null) {
		return true;
	}
	if(isbalanced(root.left)==false)
		return false;
	if(isbalanced(root.right)==false)
		return false;
	int lh=this.heightoftree(root.left);
	int rh=this.heightoftree(root.right);
	if(Math.abs(lh-rh)>1)
		return false;
	return true;
		
}
class Pair1{
	int height;
	boolean balance;
	
	public Pair1(int h,boolean b) {
		this.height=h;
		this.balance=b;
	}
}

public boolean isbalancedImprove(Node root) {
	return isbalancedImprovehelper(root).balance;
}




private Pair1 isbalancedImprovehelper(Node root) {
	if(root==null) {
		return new Pair1(0,true);
	}
	Pair1 leftN=isbalancedImprovehelper(root.left);
	Pair1 rightN=isbalancedImprovehelper(root.right);
	
	if(leftN.balance==false||rightN.balance==false) {
		return new Pair1(Math.max(leftN.height, rightN.height)+1,false);
	}
	if(Math.abs(leftN.height-rightN.height)>1)
		return new Pair1(Math.max(leftN.height, rightN.height)+1,false);
	else
		return new Pair1(Math.max(leftN.height, rightN.height)+1,true);
}
public int DiametertreeR(Node root,int max) {
	if(root==null)
		return 0;
	int lh=this.heightoftree(root.left);
	int rh=this.heightoftree(root.right);
	max= Math.max(lh+rh,max);
	return max;
}
class Pair2{
	int height;
	int diameter;
	public Pair2(int h,int d) {
		this.height=h;
		this.diameter=d;
	}
}
public int DiameterImporved(Node root) {
	return DiameterImprovedhelper(root).diameter;
}
private Pair2 DiameterImprovedhelper(Node root) {
	if(root==null) {
		return new Pair2(0,0);
	}
	Pair2 leftN=DiameterImprovedhelper(root.left);
	Pair2 rightN=DiameterImprovedhelper(root.right);
	int mydiameter=leftN.height+rightN.height;
	
	return new Pair2(Math.max(leftN.height, rightN.height)+1,Math.max(mydiameter, Math.max(leftN.diameter, rightN.diameter)));
}
class Pair3{
	int max;
	int min;
	boolean balance;
	
}
public boolean isBSt(Node root) {
	return isBSthelper(root).balance;
}
private Pair3 isBSthelper(Node root) {
	// TODO Auto-generated method stub
	if(root==null) {
		Pair3 P= new Pair3();
		P.max=Integer.MIN_VALUE;
		P.min=Integer.MAX_VALUE;
		P.balance=true;
		return P;
	}
	Pair3 leftN=isBSthelper(root.left);
	Pair3 rightN=isBSthelper(root.right);
	if(leftN.balance==false||rightN.balance==false) {
		Pair3 P=new Pair3();
		P.balance=false;
		return P;
	}
	
	Pair3 P= new Pair3();
	P.max=Math.max(root.data, Math.max(rightN.max,leftN.max));
	P.min=Math.min(root.data, Math.min(rightN.min,leftN.min));
	if(root.data>leftN.max&& root.data<rightN.min )
	   P.balance=true;
	return P;
}

}

