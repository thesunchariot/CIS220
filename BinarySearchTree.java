// Zia Anderson
// Chpt7 PA

class BinarySearchTree {
	private Node root;
   
	public BinarySearchTree() {
		root = null;
	}
   
	public Node getRoot() {
		return root;
	}
   
	public Node search(int desiredKey) {
		System.out.println("\nSearching for node " + desiredKey);
		Node currentNode = root;
		while (currentNode != null) {
			// Return the node if the key matches
			if (currentNode.key == desiredKey) {
				return currentNode;
			}
 			// Navigate to the left if the search key is 
			// less than the node's key.
			else if (desiredKey < currentNode.key) {
				System.out.print("\nDid not find node, navigating to node " + currentNode.key + "'s left child");   
				currentNode = currentNode.left;
			}
			// Navigate to the right if the search key is 
			// greater than the node's key.
			else {
				System.out.print("\nDid not find node, navigating to node " + currentNode.key + "'s right child");         
				currentNode = currentNode.right;
			}
		}
		// The key was not found in the tree.
		return null;
	}
   
	public void insert(Node node) {
		System.out.println("Inserting node " + node.key);
		// Check if tree is empty
		if (root == null) {
			root = node;
			System.out.println("Inserted node " + node.key + " as the root node.\n");
		} else {
			Node currentNode = root;
			while (currentNode != null) {
				if (node.key < currentNode.key) {
					// If no left child exists, add the new node
					// here; otherwise repeat from the left child.
					System.out.println("Checking node " + currentNode.key + " for left child.");
					if (currentNode.left == null) {
						System.out.println("Inserting node " + node.key + " as left child of node " + currentNode.key +".\n");
						currentNode.left = node;
						currentNode = null;
					} else {
						currentNode = currentNode.left;
						System.out.println("Traversed to left child node " + currentNode.key +".");
					}
				} else {
					// If no right child exists, add the new node
					// here; otherwise repeat from the right child.
					System.out.println("Checking node " + currentNode.key + " for right child.");
					if (currentNode.right == null) {
						System.out.println("Inserting node " + node.key + " as right child of node " + currentNode.key +".\n");  
						currentNode.right = node;
						currentNode = null;
					} else {
						currentNode = currentNode.right;
						System.out.println("Traversed to right child node " + currentNode.key +".");
					}
				}
			}
		}
	}
   
	public boolean remove(int key) {
		Node par = null;
		Node currentNode = root;
		
		// search for node
		while (currentNode != null) {
			// node found 
			if (currentNode.key == key) {
				// remove leaf
				if ((currentNode.left == null) && (currentNode.right == null)) {
					// node is root 
					if (par == null) {
						root = null;
					}
					else if (par.left == currentNode) {
						par.left = null;
					}
					else {
						par.right = null;
					}
					System.out.println("Leaf node " + key + " was removed.");
				}
				
				// remove node with only left child 
				else if (currentNode.right == null) {
					// node is root
					if (par == null) {
						root = currentNode.left;
					}
					else if (par.left == currentNode) {
						par.left = currentNode.left;
					}
					else {
						par.right = currentNode.left;
					}
					System.out.println("Node " + key + " with only left child was removed.");
				}
				
				// remove node with only right child 
				else if (currentNode.left == null) {
					// node is root
					if (par == null) {
						root = currentNode.right;
					}
					else if (par.left == currentNode) {
						 par.left = currentNode.right;
					}
					else {
						par.right = currentNode.right;
					}
					System.out.println("Node " + key + " with only right child was removed.");
				}
				
				// remove node with two children 
				else {
					// find successor
					Node suc = currentNode.right;
					while (suc.left != null) {
						suc = suc.left;
					}
					Node sucData = currentNode.left;
					// remove successor 
					remove(suc.key);						// unable to find issue on why it is removing 27 instead of 20
					currentNode = sucData;
					System.out.println("Node " + key + " with a right and left child was removed.");
				}
				// node found and returned 
				return true; 
			}
			
			// search right 
			else if (currentNode.key < key) {
				par = currentNode;
				currentNode = currentNode.right;
			}
			// search left
			else {
				par = currentNode;
				currentNode = currentNode.left;
			}
		}
		
		// node not found 
		System.out.println("Node " + key + " was not removed.\n");
		return false;
					
	}
}
