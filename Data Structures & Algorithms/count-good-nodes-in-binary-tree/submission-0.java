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

    class Pair {
    TreeNode node;
    int max;

    Pair(TreeNode node, int max) {
        this.node = node;
        this.max = max;
    }
}
    public int goodNodes(TreeNode root) {
        int cnt = 0;
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root,root.val));

        while(!st.isEmpty()){
            Pair p = st.pop();
            TreeNode node = p.node;
            int max = p.max;

            if(node.val >= max){
                cnt++;
            }

            int maxb = Math.max(max,node.val);

            if(node.left != null){
                st.push(new Pair(node.left,maxb));
            }

            if(node.right != null){
                st.push(new Pair(node.right,maxb));
            }

        }

        return cnt;
    }
}
