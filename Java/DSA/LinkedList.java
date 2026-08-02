package DSA;

public class LinkedList {
		Node head;
		int count=0;
		public void add(Object ele) {
			
			Node n = new Node(ele);
			if(head==null) {
				head=n;
				count++;
				return;
				
			}
			Node temp=head;
			while(temp.next!=null)
				temp=temp.next;
			temp.next=n;
			count++;
			
		}
		public int size() {
			return count;
		}
		public boolean isEmpty() {
			return count==0;
		}
		public void display() {
			Node temp = head;
			while(temp!=null) {
				System.out.println(temp.ele);
				temp=temp.next;
			}
		}
	}
