package trees;

public class BinarySearchTree {

	// root Node of the tree
	private Node root;

	// insert a Node
	public void insert(int key, String value) {
		// create a new Node
		Node newNode = new Node(key, value);

		if(root == null) {
			root = newNode;
		} else {
			Node currentNode = root;
			Node parentNode = root;

			// insert into the end of the tree
			while(currentNode != null) {
				parentNode = currentNode;
				if(key < currentNode.getKey()) {
					// traverse to the left
					currentNode = currentNode.getLeftChild();

					if(currentNode == null) {
						// insert Node as a child of the parent Node
						parentNode.setLeftChild(newNode);
					}
				} else {
					// traverse to the right
					currentNode = currentNode.getRightChild();

					if(currentNode == null) {
						// insert Node as a child of the parent Node
						parentNode.setRightChild(newNode);
					}
				}
			}
		}
	}

	// delete a Node
	public boolean remove(int key) {
		Node currentNode = root;
		Node parentNode = root;

		// if the Node we are deleting is a left child
		boolean isLeftChild = false;

		// traverse the tree to find the Node to delete
		while(currentNode.getKey() != key && currentNode != null) {
			parentNode = currentNode;
			if(key < currentNode.getKey()) {
				// the Node to delete is a left child
				isLeftChild = true;
				currentNode = currentNode.getLeftChild();
			} else {
				// the Node to delete is a right child
				currentNode = currentNode.getRightChild();
				isLeftChild = false;
			}
		}

		// return false if we couldn't find the Node to delete
		if(currentNode == null) {
			return false;
		}

		// create a delete variable for readability
		Node deleteNode = currentNode;

		// if delete Node is a leaf, delete it
		if(deleteNode.getLeftChild() == null && deleteNode.getRightChild() == null) {
			if(deleteNode == root) {
				root = null;
			} else if(isLeftChild) {
				// unlink the delete Node
				parentNode.setLeftChild(null);
			} else {
				// unlink the delete Node
				parentNode.setRightChild(null);
			}
			return true;
		}

		// if delete Node has one child, set the parent Node's children to the delete Node's children
		if(deleteNode.getRightChild() == null) {
			// delete Node does not have a right Child
			if(deleteNode == root) {
				root = deleteNode.getLeftChild();
			} else if(isLeftChild) {
				// replace delete Node to its left child
				parentNode.setLeftChild(deleteNode.getLeftChild());
			} else {
				// replace delete Node to its left child
				parentNode.setRightChild(deleteNode.getLeftChild());
			}
			return true;
		} else if(deleteNode.getLeftChild() == null) {
			// delete Node does not have a left child
			if(deleteNode == root) {
				root = deleteNode.getRightChild();
			} else if(isLeftChild) {
				// replace delete Node to its right child
				parentNode.setLeftChild(deleteNode.getRightChild());
			} else {
				// replace delete Node to its right child
				parentNode.setRightChild(deleteNode.getRightChild());
			}
			return true;
		}

		// if Node has two children (tricky), set the delete Node to the successor
		Node successorNode = getSuccessor(deleteNode);
		if(deleteNode == root) {
			root = successorNode;
		} else if(isLeftChild) {
			// replace delete Node to its successor
			parentNode.setLeftChild(successorNode);
		} else {
			// replace delete Node to its successor
			parentNode.setRightChild(successorNode);
		}
		// the successor's left child becomes the delete Node's left child
		successorNode.setLeftChild(deleteNode.getLeftChild());

		return true;
	}

	// return the successor of delete Node: the delete Node's right child's left-most Node
	private Node getSuccessor(Node deleteNode) {
		Node successorParent = deleteNode;
		Node successorNode = deleteNode;

		// the delete Node's right child
		Node currentNode = deleteNode.getRightChild();

		// traverse the left children of currentNode to get the left-most Node
		while(currentNode != null) {
			successorParent = successorNode;
			successorNode = currentNode;
			currentNode = currentNode.getLeftChild();
		}

		// if the delete Node's right child has left children
		if(successorNode != deleteNode.getRightChild()) {
			// replace the successor's old location to its right child
			successorParent.setLeftChild(successorNode.getRightChild());

			// the successor's right child becomes the delete Node's right child
			successorNode.setRightChild(deleteNode.getRightChild());
		}
		return successorNode;
	}

	// return the minimum Node: the left-most leaf Node
	public Node findMin() {
		Node currentNode = root;
		Node lastNode = root;

		// traverse the left-side of the BST
		while(currentNode != null) {
			lastNode = currentNode;
			currentNode = currentNode.getLeftChild();
		}
		return lastNode;
	}

	// return the maximum Node: the right-most leaf Node
	public Node findMax() {
		Node currentNode = root;
		Node lastNode = root;

		// traverse the left-side of the BST
		while(currentNode != null) {
			lastNode = currentNode;
			currentNode = currentNode.getRightChild();
		}
		return lastNode;
	}
}
