import java.util.*;  // ✅ Correct import (not java.utils)

class TreeNode<T> {
    T data;  // ✅ Correct syntax for declaring a field
    ArrayList<TreeNode<T>> children;

    // ✅ Constructor with proper syntax
    public TreeNode(T data) {
        this.data = data;
        this.children = new ArrayList<>();
    }
}

public class Main {
    public static void main(String[] args) {
        // ✅ Use 'new' keyword when creating new objects
        TreeNode<Integer> n1 = new TreeNode<>(5);
        TreeNode<Integer> n2 = new TreeNode<>(3);
        TreeNode<Integer> n3 = new TreeNode<>(4);

        // ✅ Add children properly
        n1.children.add(n2);
        n1.children.add(n3);

        System.out.println("Root Node: " + n1.data);
        System.out.println("Children of root:");
        for (TreeNode<Integer> child : n1.children) {
            System.out.println(child.data);
        }
    }
}
