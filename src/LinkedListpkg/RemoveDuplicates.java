package LinkedListpkg;
import java.util.HashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		LL linkedlist1=new LL();
		linkedlist1.addfirst(10);
		linkedlist1.addlast(20);
		linkedlist1.addlast(20);
		linkedlist1.addlast(30);
		linkedlist1.addlast(30);
		linkedlist1.addlast(40);
		linkedlist1.addlast(40);
		removeDuplicate(linkedlist1);
		removeduplicatesorted(linkedlist1);
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
	private static void removeduplicatesorted(LL linkedlist) {
	if(linkedlist.head!=null) {
		Node currnode=linkedlist.head;
		while(currnode!=null&&currnode.getnext()!=null) {
			while(currnode.getnext()!=null &&currnode.getdata()==currnode.getnext().getdata() ) {
				currnode.setnext(currnode.getnext().getnext());
			}
			currnode=currnode.getnext();
		}
	}
	else 
		return;
	}
}
