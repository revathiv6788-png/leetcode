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
/*class Solution {
    List<List<Integer>> result=new ArrayList<>();
    static void traversal(TreeNode root)
    {
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
        {
            return;
        }
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer> level=new ArrayList<>();
            TreeNode cur=q.poll();
            //level.add(cur);
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                 TreeNode data=q.poll();
                 level.add(data.val);
                 if(cur.left!=null)
            {
                q.add(cur.left);
            }
             if(cur.right!=null)
            {
                q.add(cur.right);
            }
            result.add(level);
            }
            return result;
        }
    }
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        traversal(root);
        return result;
    }
}*/



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
        List<List<Integer>> result = new ArrayList<>();
         if(root==null){
            return result;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
             List<Integer> level = new ArrayList<>();
             for(int i=0;i<size;i++){
              TreeNode cur=q.poll();
            level.add(cur.val);
             
            if(cur.left!=null){
                q.add(cur.left);
            }
            if(cur.right!=null){
                q.add(cur.right);
            }
             }
            result.add(level);
        }
    return result;
    }
}