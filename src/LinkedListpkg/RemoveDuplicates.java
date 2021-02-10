package LinkedListpkg;
import java.util.HashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		LL linkedlist1=new LL();
		linkedlist1.addfirst(10);
		linkedlist1.addlast(20);
		linkedlist1.addlast(30);
		linkedlist1.addlast(30);
		linkedlist1.addfirst(10);
		linkedlist1.addlast(20);
		removeDuplicate(linkedlist1);
		linkedlist1.show();
}

	private static void removeDuplicate(LL linkedlist1) {
		// TODO Auto-generated method stub
		if(linkedlist1.head!=null) {
			HashSet<Integer> visited=new HashSet<Integer>();
			Node prev=null;
			Node current=linkedlist1.head;
			while(current!=null) {
				int value=current.getdata();
				if(visited.contains(value)) {
					prev.setnext(current.getnext());
				}
				else
				{
					visited.add(value);
					prev=current;
				}
				current=current.getnext();
			}
		}
		else
			System.out.println("No list Found");
	}	
}
