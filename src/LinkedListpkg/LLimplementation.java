package LinkedListpkg;
 

// main or driver class for the linked list class 
class LLimplementation{
	public static void main(String[] args) {
	LL linkedlist=new LL ();
	linkedlist.addlast(1);
	linkedlist.addlast(2);
	linkedlist.addlast(2);
	linkedlist.addlast(3);
	linkedlist.addlast(3);
	linkedlist.addlast(3);
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
//	System.out.println(linkedlist.size);
//  System.out.println( linkedlist.kthNodeFromLast(6).getdata());
//	System.out.println(linkedlist.getsize()+1);
//	linkedlist.tail.setnext(linkedlist.head.getnext());
//	linkedlist.DetectandRemoveLoopLL();
//	linkedlist.DetectandRemoveLoopLL();
//	linkedlist.reversePRec();
//	linkedlist.show();
//	System.out.println();
//	linkedlist.DeleteNodesWhichHaveaGreaterValueonrightSide();
//	linkedlist.show();
//	System.out.println(""+linkedlist.head.data + linkedlist.size +linkedlist.tail.data);
	linkedlist.removeDuplicateSorted();
	System.out.println(" hsg");
	linkedlist.show();
	}
}

