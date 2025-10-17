// BinaryTreeNode.java
public class BinaryTreeNode<T> {
    T data;                          // To store data
    BinaryTreeNode<T> left;          // Reference to left child
    BinaryTreeNode<T> right;         // Reference to right child

    // Constructor
    public BinaryTreeNode(T data) {
        this.data = data;
        this.left = null;            // Initialize left pointer to null
        this.right = null;           // Initialize right pointer to null
    }
}

// PrintBinaryTree.java
public class PrintBinaryTree {

    // Function to print tree in the required format
    public static void printTree(BinaryTreeNode<Integer> root) {
        if (root == null) {   // Base case
            return;
        }

        // Print the data of the current node
        System.out.print(root.data + ":");

        // If left child exists, print it
        if (root.left != null) {
            System.out.print("L" + root.left.data + " ");
        }

        // If right child exists, print it
        if (root.right != null) {
            System.out.print("R" + root.right.data);
        }

        System.out.println();

        // Recursively print left and right subtrees
        printTree(root.left);
        printTree(root.right);
    }

    // Main method to test
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        root.left = new BinaryTreeNode<>(2);
        root.right = new BinaryTreeNode<>(3);
        root.left.left = new BinaryTreeNode<>(4);
        root.left.right = new BinaryTreeNode<>(5);

        printTree(root);
    }
}
