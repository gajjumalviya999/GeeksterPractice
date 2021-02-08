package LinkedListpkg;
 

// main or driver class for the linked list class 
class LLimplementation{
	public static void main(String[] args) {
	LL linkedlist=new LL();
	linkedlist.addlast(1);
	linkedlist.addlast(2);
	linkedlist.addlast(3);
	linkedlist.addlast(4);
	linkedlist.addlast(5);
	linkedlist.addlast(6);
	linkedlist.show();
//	System.out.println("poped element from last "+linkedlist.poplast());
//	linkedlist.show();
//	linkedlist.addAtpos(36,2);
//	linkedlist.show();
//	System.out.println("removed head "+ linkedlist.removehead());
//	linkedlist.reverseData();
//	linkedlist.show();
//	linkedlist.reversepointer();
//	linkedlist.show();
//	System.out.println(linkedlist.ispalindrome());
	
//  linkedlist.deletewithoutheadwithNodePtr(2);
//	linkedlist.show();
//  System.out.println( linkedlist.NthNodeFromLast(2).getdata());
//	System.out.println(linkedlist.getsize()+1);
	linkedlist.tail.setnext(linkedlist.head.getnext().getnext());
	linkedlist.DetectandRemoveLoopLL();
	linkedlist.DetectandRemoveLoopLL();
	}
}

