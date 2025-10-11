public static void printAtLevelK(TreeNode<Integer> root, int k) {
    // Base case
    if (root == null) {
        return;
    }

    // If we’ve reached the desired level
    if (k == 0) {
        System.out.println(root.data);
        return;
    }

    // Recur for all children with level reduced by 1
    for (int i = 0; i < root.children.size(); i++) {
        printAtLevelK(root.children.get(i), k - 1);
    }
}
