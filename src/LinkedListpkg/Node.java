package LinkedListpkg;

class Node {
	
		int data;
		Node next;

		public  Node (int data) {
			this.data=data;
			this.next=null;
		}
		public int getdata() {
			return this.data;
		}
		public Node getnext() {
			return this.next;
		}
		public void setdata(int data) {
			this.data=data;
		}
		public void setnext(Node next) {
			this.next=next;
		}
		
}
