

public class mainClass {
	
	Node head;
	public class Node {
		
		String sen;
		
		
		
		Node next;
		
		

		public Node(String sen) {
			super();
			this.sen = sen;
			this.next = null;
		}

		public String getSen() {
			return sen;
		}

		public void setSen(String sen) {
			this.sen = sen;
		}
	}
		
		
		
		public void addFirst(String sen) {
			
			Node newNode = new Node(sen);
			
			if(head == null) {
				
				head = newNode;
				return;
				
			}
			
			newNode.next = head;
			head = newNode;
			
		}
		
		
		public void addLast(String sen) {
			
			Node newNode = new Node(sen);
			
			if(head == null) {
				
				head = newNode;
				return;
				
			}
			
			Node currNode = head;
			
			while(currNode.next!=null) {
				
				currNode = currNode.next;
				
			}
			
			currNode.next = newNode;
		}
		
		public void printList() {
			
			if(head==null) {
				System.out.println("List is empty");
			}
			
			Node currNode = head;
			while(currNode != null) {
				System.out.print(currNode.sen + " ");
				currNode = currNode.next;
			}
			
		}
		
		public void reverse() {
			
			if(head==null || head.next==null) {
				return;
			}
			
			Node prevNode = head;
			Node currNode = head.next;
			
			while(currNode != null) {
				Node nextNode = currNode.next;
				currNode.next = prevNode;
				
				prevNode = currNode;
				currNode = nextNode;
				
			}
			
			head.next = null;
			head = prevNode;
		}
	
	public static void main(String[] args)
	{
		mainClass list = new mainClass();
//		LinkedList<String> list = new LinkedList<String>();
		list.addFirst("is");
		list.addFirst("This");
		list.printList();
//		System.out.println(list);
		list.addLast("a");
		list.printList();
//		System.out.println(list);
		list.addLast("List");
		list.printList();
//		System.out.println(list);
		list.reverse();
		list.printList();
//		System.out.println(list);
		
	}
	
}
