package LinkedListpkg;

public class MergeTwoSortedLL {

	public static void main(String[] args) {
		LL linkedlist1=new LL();
		LL linkedlist2=new LL();
		linkedlist1.addfirst(10);
		linkedlist1.addlast(20);
		linkedlist1.addlast(30);
		linkedlist1.addlast(40);
		linkedlist2.addfirst(15);
		linkedlist2.addlast(26);
		linkedlist2.addlast(37);
		linkedlist2.addlast(42);
	     mergetwosortedll(linkedlist1,linkedlist2).show();
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

}
