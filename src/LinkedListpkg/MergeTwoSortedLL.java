package LinkedListpkg;

public class MergeTwoSortedLL {

	public static void main(String[] args) {
		LL linkedlist1=new LL();
//		LL linkedlist2=new LL();
		linkedlist1.addfirst(10);
		linkedlist1.addlast(2);
		linkedlist1.addlast(7);
		linkedlist1.addlast(1);
		linkedlist1.addlast(6);
		linkedlist1.addlast(5);
		linkedlist1.addlast(3);
		linkedlist1.addlast(4);
		linkedlist1.addlast(8);
		
		LL mergedll=MergeSort(linkedlist1.head,linkedlist1.tail);
		mergedll.show();
		System.out.println(mergedll.head.data);
		System.out.println(mergedll.tail.data);
	}

	private static LL mergetwosortedll(LL linkedlist1, LL linkedlist2) {
		// TODO Auto-generated method stub
		LL resulted = new LL();
		Node curr1=linkedlist1.head;
		Node curr2=linkedlist2.head;
		while(curr1!=null && curr2!=null)
		{
			if(curr1.getdata()<curr2.getdata())
			{
				resulted.addlast(curr1.getdata());
				curr1=curr1.getnext();
			}
			else
			{	
				resulted.addlast(curr2.getdata());
			    curr2=curr2.getnext();
			}
		}
		  while(curr1!=null) {
				resulted.addlast(curr1.getdata());
				curr1=curr1.getnext();
			}
			while(curr2!=null) {
				resulted.addlast(curr2.getdata());
				curr2=curr2.getnext();
			}
		
		return resulted;
	}
	public static Node midofLL(Node head, Node tail) {
		
		Node s=head;
		Node f=head;
		while(f!=tail&f.next!=tail) {
			s=s.getnext();
			f=f.getnext().getnext();
		}
		return s;
	}
	private static LL MergeSort(Node head, Node Tail) {
		if(head==Tail) {
			LL br=new LL();
			br.addlast(head.data);
			return br;
		}
		Node mid=midofLL(head,Tail);
		LL leftLL=MergeSort(head,mid);
		 LL rightLL=MergeSort(mid.next,Tail);
		LL mergedLL=mergetwosortedll(leftLL, rightLL);
		
		return mergedLL;
	}

}
