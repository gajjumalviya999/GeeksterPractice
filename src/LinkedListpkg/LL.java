package LinkedListpkg;
class LL{
	Node head;
	int size;
	Node tail;
	
	public LL() {
		head=null;
		size=0;
		tail=null;
	}
	public void addfirst(int data) {
		Node node=new Node(data);
		addfirst(node);
	}
	private void addfirst(Node node) {
		if(size==0) {
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
		if(size==0) {
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
	
	public void poplast() {
		if(this.size==-1) {
			System.out.println("cant pop list is empty");
			return ;
			
		}
		else
			if(this.size==0) {
				
				this.head=null;
				this.tail=null;
				this.size--;
				return;
			}
			else
			{ Node current=this.head;
				while(current.getnext().getnext()!=null) {
					current=current.getnext();
				}
				
				current.setnext(null);
				this.tail=current;
				this.size--;
				return;
			}
	}
	public void removehead() {
		if(this.size==0) {
			System.out.println("CAnt remove size <0");
			return;
		}
		else if(this.size==1) {
			this.head=null;
			this.tail=null;
			this.size=0;
			return ;	
		}
		else {
			
			this.head=head.getnext();
			this.size--;
			return ;		
		}
		
	}
	public void removenode(Node node) {
		if(this.head==node) {
			removehead();
			return;
		}
		if(this.tail==node) {
			poplast();
			return;
		}
		deletewithoutheadwithNodePtr(node);
		return;
		
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
	public Node kthNodeFromLast(int k) {
		if(k>-1&& k<=size) {
			Node left=head;
			Node right=head;
			while(k!=0) {
				right=right.getnext();
				k--;
			}
			while(right!=null) {
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
		while(true) {
			slow=slow.getnext();
			fast=fast.getnext().getnext();
			if(slow==fast) {
				break;
			}
			if(slow==null|| fast==null)
			{
				System.out.println(" Loop not found");
				return ;
			}
			
		}
		// detect starting of loop
		slow=this.head;
		while(slow!=fast) {
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
	public void  foldingall() {
		// TODO Auto-generated method stub
		left=this.head;
		Node right=this.head;
		foldingall(right,0);
		
	}
	private void  foldingall(Node right,int floor) {
		// TODO Auto-generated method stub
		if(right==null) {
			return;
		}
	
			foldingall(right.getnext(),floor+1);
		
		if(floor>this.getsize()/2) {
			Node temp=left.getnext();
			left.setnext(right);
			right.setnext(temp);
			left=temp;
		}
		if(floor==this.getsize()/2) {
			right.setnext(null);
			this.tail=right;
		}
	
	}
	public void reverseDRec() {
		left=this.head;
		Node right=this.head;
		reverseDRec(right ,0);
		
	}
	private void reverseDRec(Node right, int i) {
		// TODO Auto-generated method stub
		if(right==null)
			return;
		reverseDRec(right.getnext(),i+1);
		if(i>=this.getsize()/2) {
			int temp=right.getdata();
			right.setdata(left.getdata());
			left.setdata(temp);
			left=left.getnext();
		}
	}
	public void reversePRec() {
		reversePRec(this.head);
		Node temp=this.head;
		this.head=this.tail;
		this.tail=temp;
		this.tail.setnext(null);
	}
	private void reversePRec(Node node) {
		// TODO Auto-generated method stub
		if(node.getnext()==null)
			return;
		reversePRec(node.getnext());
		node.getnext().setnext(node);
		
	}
	public void DeleteNodesWhichHaveaGreaterValueonrightSide() {
		this.reverseDRec();
		this.show();
		int tempmax=this.head.getdata();
		System.out.println(tempmax);
		Node currnode=this.head;
		while(currnode!=null &&currnode.getnext()!=null) {
			if(currnode.next.getdata()<tempmax) {
					Node temp = currnode.getnext();
		                currnode.next = temp.next;
		                this.size--;
		                if(currnode.next==null)
		                	this.tail=currnode;
		                temp = null;
			}
			else
				{tempmax=currnode.getdata();
					currnode=currnode.getnext();
					 if(currnode.next==null)
		                	this.tail=currnode;
				}
		}
		this.reverseDRec();
	}
	public void removeDuplicateSorted() {
		System.out.println("hhgsh");
		Node curr=this.head;
		while(curr!=null&&curr.getnext()!=null) {
			if(curr.getdata()==curr.getnext().getdata()) {
				curr.setnext(curr.getnext().getnext());
				curr=curr.getnext();
			}
		}
		
	}
	
}