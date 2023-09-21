// Solution to LeetCode 102: Binary Tree Level Order Traversal
// Category: Tree
// Difficulty: Medium

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC102 {
	   public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null)
        {
            return ans;
        }
        q.add(root);
        while (!q.isEmpty())
        {
            int len = q.size();
            List<Integer> currList = new ArrayList<>();
            for (int i = 0; i < len; i++)
            {
                TreeNode curr = q.poll();
                currList.add(curr.val);
                if (curr.left != null)
                {
                    q.add(curr.left);
                }
                if (curr.right != null)
                {
                    q.add(curr.right);
                }
            }
            ans.add(currList);
        }
        return ans;
    }
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) { this.val = val; }
		TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
		}
	}
}
