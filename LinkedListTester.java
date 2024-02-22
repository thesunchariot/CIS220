// Zia Anderson
// Chpt4 PA

public class LinkedListTester {
	public static void main(String[] args) {
	
	// declare linked list
	LinkedList linkedList = new LinkedList();
	
	// declare and append node1
	Node node1 = new Node(1);
	linkedList.listAppend(node1);   
	
	// declare and append node2
	Node node2 = new Node(2);
	linkedList.listAppend(node2);
	
	// declare and prepend node3
	Node node3 = new Node(3);
	linkedList.listPrepend(node3);
	
	// declare node4 and insert after head node
	Node node4 = new Node(4);
	linkedList.listInsertAfter(linkedList.getHead(), node4);
	
	// declare node5 and insert at the end of linked list
	Node node5 = new Node(5);
	linkedList.listInsertAfter(linkedList.getTail(), node5);
	
	// declare node6 and insert after node4
	Node node6 = new Node(6);
	linkedList.listInsertAfter(node4, node6);
	
	// declare node7 and insert after node2
	Node node7 = new Node(7);
	linkedList.listInsertAfter(node2, node7);
	
	// display list
	linkedList.listTraverse();
	
	// remove head node from linked list
	linkedList.listRemoveNodeAfter(null);
	
	// remove node after node7
	linkedList.listRemoveNodeAfter(node7);
	
	// display list
	linkedList.listTraverse();
	
	// search for node5 and display if found or not
	if (linkedList.listSearch(node5.getData()) == null) {
		System.out.println("Node with data " + node5.getData() + " was not found.");
	}
	else {
		System.out.println("Node with data " + node5.getData() + " was found.");
	}
	
	// search for node2 and display if found or not
	if (linkedList.listSearch(node2.getData()) == null) {
		System.out.println("Node with data " + node2.getData() + " was not found.");
	}
	else {
		System.out.println("Node with data " + node2.getData() + " was found.");
	}
	
	// output sum of all data values using sumDataValues method
	System.out.println("The sum of the Linked List data values is " + linkedList.sumDataValues());
	
	
	
	}
}
