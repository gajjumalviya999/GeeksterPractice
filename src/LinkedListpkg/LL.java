package LinkedListpkg;
class LL{
	Node head;
	int size;
	Node tail;
	
	public LL() {
		head=null;
		size=-1;
		tail=null;
	}
	public void addfirst(int data) {
		Node node=new Node(data);
		addfirst(node);
	}
	private void addfirst(Node node) {
		if(size==-1) {
			node.setnext(null);
			this.head=node;
			this.tail=node;
			this.size++;
		}
		else
		{
			node.setnext(head);
			this.head=node;
			this.size++;
		}
	}
	public void addlast(int data) {
		Node node=new Node(data);
		addlast(node);
	}
	private void addlast(Node node) {
		if(size==-1) {
			node.setnext(null);
			this.head=node;
			this.tail=node;
			this.size++;
		}
		else
		{ 
		node.setnext(null);
		this.tail.setnext(node);
		tail=node;
		this.size++;
		
		}
	}
	public void addAtpos(int data,int pos) {
		addAtpos(new Node(data),pos);
	}
	private void addAtpos(Node node,int pos) {
		if(pos<=0&& pos>size) {
			System.out.println("cant add at position");
		}
		else if(pos==0)
			addfirst(node);
		else if(pos==size)
			addlast(node);
		else {
			Node current=this.head;
			int count=1;
			while(count<pos-1) {
				current=current.getnext();
				count++;
			}
			node.setnext(current.getnext());
			current.setnext(node);
			this.size++;
		}
					
	}
	public Node getNodeAt(int pos) {
		if(pos<=0|| this.size<0|| pos>size ) {
			return null;
		}
		else { Node current=head;
			int count=1;
			while(count<pos) {
				current=current.getnext();
				count++;
			}
			return current;
			
		}
	}
	
	public int poplast() {
		if(this.size==-1) {
			System.out.println("cant pop list is empty");
			return -1;
			
		}
		else
			if(this.size==0) {
				int element=head.getdata();
				this.head=null;
				this.tail=null;
				this.size--;
				return element;
			}
			else
			{ Node current=this.head;
				while(current.getnext().getnext()!=null) {
					current=current.getnext();
				}
				int element=current.getnext().getdata();
				current.setnext(null);
				this.tail=current;
				this.size--;
				return element;
			}
	}
	public int removehead() {
		if(this.size<0) {
			System.out.println("CAnt remove size <0");
			return -1;
		}
		else if(this.size==0) {
			int ele=head.getdata();
			this.head=null;
			this.tail=null;
			this.size=0;
			return ele;	
		}
		else {
			int ele=head.getdata();
			this.head=head.getnext();
			this.size--;
			return ele;			
		}
		
	}
	public void reverseData() {
		if(this.size==0) {
			System.out.println(" cant reverse");
		}
		else {
			int l=1;
			int r=size;
			while(l<r) {
				Node lnode=this.getNodeAt(l);
				Node rnode=this.getNodeAt(r);
				//Swapping data
				int temp= lnode.getdata();
				lnode.setdata(rnode.getdata());
				rnode.setdata(temp);
				
				l++;
				r--;
			}
		}
	}
	public void reversepointer() {
		if(this.size==0) {
			System.out.println(" cant reverse");
		}
		else {
			Node current= head;
			Node prev=null;
			while(current!=null) {
				Node temp=current.getnext();
				current.setnext(prev);
				prev=current;
				current=temp;
			}
			Node temp = this.head;
			this.head = this.tail;
			this.tail = temp;
		}
	}
	//global variable;
	private Node left;
	public boolean ispalindrome() {
		left=this.head;
		return ispalindrome(this.head);
	}
	private boolean ispalindrome(Node right) {
		if(right==null) {
			return true;
		}
		boolean flag=ispalindrome(right.getnext());
		if(!flag)
			return flag;
		else {
			if(left.getdata()!=right.getdata())
				return false;
			
			left=left.getnext();
			return true;
			
		}
	}
	
	public void show() {
		Node current=this.head;
		System.out.print("List   ");
		while(current!=null) {
			System.out.print(current.getdata()+ " ->");
			current=current.getnext();
		}
		System.out.println("");
		
	}
	public void deletewithoutheadwithNodePtr(int pos) {
		deletewithoutheadwithNodePtr(this.getNodeAt(pos));
	}
	public void deletewithoutheadwithNodePtr(Node nodeptr){
		if(size>0 && nodeptr.getnext()!=null) {
		Node temp=nodeptr.getnext();
		nodeptr.setdata(temp.getdata()); 
		nodeptr.setnext(temp.getnext()); 
		temp=null;
		this.size--;
		}
		if(nodeptr.getnext()==null) {
			nodeptr=null;
		}
		
	}
	public Node NthNodeFromLast(int n) {
		if(n>-1&& n<size) {
			Node left=head;
			Node right=head;
			while(n!=1) {
				right=right.getnext();
				n--;
			}
			while(right.getnext()!=null) {
				left=left.getnext();
				right=right.getnext();
			}
			return left;
		}
		return null;
		
	}
	public int getsize() {
		return this.size;
	}
	public void DetectandRemoveLoopLL() {
		Node slow=this.head;
		Node fast=this.head;
		if(this.tail.getnext()==null) {
			System.out.println("Loop not found");
			return ;
			}
		while( slow!=null && fast!=null&& fast.getnext()!=null) {
			slow=slow.getnext();
			fast=fast.getnext().getnext();
			if(slow==fast) {
				break;
			}
		}
		// detect starting of loop
		slow=this.head;
		while(slow!=fast && slow.getnext()!=null && fast.getnext()!=null) {
			slow=slow.getnext();
			fast=fast.getnext();
			
		}
		System.out.println(" Starting of the loop  " +slow.getdata());
		// now slow is the starting of loop
       while(fast.getnext()!=slow) {
    	   fast=fast.getnext();
       }
       fast.setnext(null);
       System.out.println("Loop removed");
	}
}