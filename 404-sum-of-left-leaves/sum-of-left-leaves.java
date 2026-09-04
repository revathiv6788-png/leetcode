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
    public int sumOfLeftLeaves(TreeNode root) {
        //List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
        {
            return 0;
        }
        q.add(root);
        int ans=0;
        while(!q.isEmpty())
        {
                TreeNode temp=q.poll();
                if(temp.left!=null)
                {
                 if(temp.left.left==null&&temp.left.right==null)
                 {
                    ans+=temp.left.val;
                 }
                 else
                 {
                    q.add(temp.left);
                 }
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
            
        }
        return ans;
    }
}