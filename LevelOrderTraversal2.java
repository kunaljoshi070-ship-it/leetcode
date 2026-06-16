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
import java.util.*;
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null){
            return Collections.emptyList();
        }

        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> nested = new ArrayList<>();
        List<Integer> l = new ArrayList<>();

        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            if(curr == null){
                nested.add(l);

                if(q.isEmpty()){
                    break;
                } else{
                    q.add(null);
                    l = new ArrayList<>();
                }
            } else{
                l.add(curr.val);

                if(curr.left != null){
                    q.add(curr.left);
                }

                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }

        Collections.reverse(nested);

        return nested;
    }
}