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
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        if(root == null)return list;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            ArrayList<Integer> lvl = new ArrayList<>();
            int size = q.size();

            for(int i = 0; i < size; i++){
                TreeNode num = q.poll();
                lvl.add(num.val);

                if(num.left != null){
                    q.offer(num.left);
                }
                if(num.right != null){
                    q.offer(num.right);
                }
            }

            list.add(lvl);
        }

        return list;
    }
}
