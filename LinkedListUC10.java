package practise;
import java.util.List;
import java.util.LinkedList;
public class LinkedListUC10 {
	class Node{
		int data;
		Node next;
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	public Node head = null;
	public Node tail = null;
	public void addNode(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	public void sortList() {
		Node current = head,index = null;
		int temp;
		if(head == null) {
			return;
		}
		else {
			while(current !=null) {
				if(current.data > index.data) {
					temp = current.data;
					current.data = index.data;
					index.data = temp;
				}
				index =index.next;
			}
			current = current.next;
		}
	}
	public void display() {
		Node current = head;
		 
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
 
        System.out.println();
	}
	
	public static void main(String[] args) {
		SortList sList = new SortList();
		 
        sList.addNode(56);
        sList.addNode(30);
        sList.addNode(40);
        sList.addNode(70);
        
        System.out.println("Original list:");
        sList.display();
        sList.SortList();
        System.out.println("Sorted List:");
        sList.display();

	}

}
