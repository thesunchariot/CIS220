// Zia Anderson
// Chpt7 PA

class BST_Demo {
	public static void main(String[] args) {
		
		// declare binary search tree object
		BinarySearchTree bst = new BinarySearchTree();
		
		// insert node 20
		Node node20 = new Node(20);
		bst.insert(node20);
		
		// insert node 35
		Node node35 = new Node(35);
		bst.insert(node35);
		
		// insert node 13
		Node node13 = new Node(13);
		bst.insert(node13);
		
		// insert node 6
		Node node6 = new Node(6);
		bst.insert(node6);
		
		// insert node 24
		Node node24 = new Node(24);
		bst.insert(node24);
		
		// insert node 18
		Node node18 = new Node(18);
		bst.insert(node18);
		
		// insert node 48
		Node node48 = new Node(48);
		bst.insert(node48);
		
		// insert node 1
		Node node1 = new Node(1);
		bst.insert(node1);
		
		// insert node 27
		Node node27 = new Node(27);
		bst.insert(node27);
		
		// call to print 2D method 
		for (int i = 0; i < 40; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println("Initial Binary Search Tree:");
		BSTPrint.print2DUtil(bst.getRoot(), 0);
		
		// remove nodes 18 and 48
		bst.remove(18);
		bst.remove(48);
		
		// call to print 2D method 
		for (int i = 0; i < 40; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println("Binary Search Tree after removing nodes 18 and 48:");
		BSTPrint.print2DUtil(bst.getRoot(), 0);
		
		// insert node 16
		Node node16 = new Node(16);
		bst.insert(node16);
		
		// insert node 45 
		Node node45 = new Node(45);
		bst.insert(node45);
		
		// call to print 2D method 
		for (int i = 0; i < 40; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println("Binary Search Tree after inserting nodes 16 and 45:");
		BSTPrint.print2DUtil(bst.getRoot(), 0);
		
		// remove nodes 6 and 24
		bst.remove(6);
		bst.remove(24);
		System.out.println();
		
		// call to print 2D method 
		for (int i = 0; i < 40; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println("Binary Search Tree after removing nodes 6 and 24:");
		BSTPrint.print2DUtil(bst.getRoot(), 0);
		
		// remove nodes 20 and 38 UNRESOLVED ISSUE HERE
		bst.remove(20);
		bst.remove(38);
		
		// call to print 2D method 
		for (int i = 0; i < 40; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println("Binary Search Tree after removing nodes 20 and 38:");
		BSTPrint.print2DUtil(bst.getRoot(), 0);
		
	}
}