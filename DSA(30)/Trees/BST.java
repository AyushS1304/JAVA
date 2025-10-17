/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { data = val; left = null, right = null }
 * }
 **/

class Solution {
    public List<Integer> floorCeilOfBST(TreeNode root, int key) {
        int floor = findFloor(root, key);
        int ceil = findCeil(root, key);
        return Arrays.asList(floor, ceil);
        
    }
    private int findCeil(TreeNode root, int key){
        int ceil=-1;
        while(root!=null){
        if(root.data==key){
            ceil=root.data;
            return ceil;
        }
        if(key>root.data){
            root=root.right;
        }
        else{
            ceil=root.data;
            root=root.left;
        }
        }
        return ceil;
    }
    private int findFloor(TreeNode root, int key) {
    int floor = -1;
    while (root != null) {
        if (root.data == key) {
            floor = root.data;
            return floor;
        }
        if (key < root.data) {
            root = root.left;
        } else { 
            floor = root.data;  
            root = root.right;
        }
    }
    return floor;
}

}