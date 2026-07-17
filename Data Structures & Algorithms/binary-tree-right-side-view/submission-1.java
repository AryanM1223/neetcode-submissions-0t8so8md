/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    ArrayList<Integer> lst = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null)return lst;


        helper(root,0);

        
        return lst;

    }

    public void helper(TreeNode root , int lvl){
        if(root == null)return;
        if(lst.size() == lvl){
            lst.add(root.val);
        }
        helper(root.right , lvl + 1);
        helper(root.left,lvl + 1);
        

    }
}
