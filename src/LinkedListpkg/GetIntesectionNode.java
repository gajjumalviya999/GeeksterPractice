package LinkedListpkg;

public class GetIntesectionNode {
	public static void main(String[] args) {
		LL linkedlist1=new LL();
		LL linkedlist2=new LL();
		linkedlist1.addfirst(10);
		linkedlist1.addlast(20);
		linkedlist1.addlast(30);
		linkedlist1.addlast(40);
		linkedlist2.addfirst(12);
		linkedlist2.addlast(25);
		linkedlist2.tail.setnext(linkedlist1.head.getnext().getnext());
		linkedlist1.show();
		linkedlist2.show();
		System.out.println("The intesection node of uper two list is  "+getIntersection(linkedlist1,linkedlist2).getdata());
	}

	private static Node getIntersection(LL linkedlist1, LL linkedlist2) {
	
		// absolute differnecre between nomber of nodes
		Node current1=linkedlist1.head;
		Node current2=linkedlist2.head;
		int s1=0;
		int s2=0;
		while(current1!=null)
			{s1++;
			current1=current1.getnext();
			}
		while(current2!=null)
			{s2++;
			current2=current2.getnext();
			}
		int d=Math.abs(s1-s2);
		//System.out.println(""+ s1 + s2 +d);
		 current1=linkedlist1.head;
		 current2=linkedlist2.head;
		int count=0;
		if(s1<s2) {
			while(count<d) {
				current2=current2.getnext();
				count++;
			}
		}
		else
			while(count<d) {
				current1=current1.getnext();
				count++;
			}
		while(current1.getdata()!=current2.getdata()) {
			current1=current1.getnext();
			current2=current2.getnext();
		}
		return current1;
	}

}
