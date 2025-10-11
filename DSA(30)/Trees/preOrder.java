import java.util.*;

class TreeNode<T> {
    T data;
    ArrayList<TreeNode<T>> children;

    public TreeNode(T data) {
        this.data = data;
        this.children = new ArrayList<>();
    }
}

public class preOrder {

    // ✅ Recursive function to take tree input
    public static TreeNode<Integer> takeInput(Scanner sc) {
        System.out.print("Enter node data: ");
        int data = sc.nextInt();
        TreeNode<Integer> node = new TreeNode<>(data);

        System.out.print("Enter number of children for " + data + ": ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            TreeNode<Integer> child = takeInput(sc);
            node.children.add(child);
        }
        return node;
    }

    // ✅ Preorder traversal function
    public static void preOrder(TreeNode<Integer> root) {
        if (root == null) return;

        // Step 1: Visit the current node
        System.out.print(root.data + " ");

        // Step 2: Recur for all children
        for (int i = 0; i < root.children.size(); i++) {
            preOrder(root.children.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode<Integer> root = takeInput(sc);

        System.out.println("\nPreorder Traversal:");
        preOrder(root);
    }
}
