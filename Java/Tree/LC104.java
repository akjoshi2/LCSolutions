// Solution to LeetCode 104: Maximum Depth of Binary Tree 
// Category: Tree
// Difficulty: Easy

public class LC104 {
	public int maxDepth(TreeNode root) {
        int ans = 0;
        if (root == null)
        {
            return 0;
        }
        if (root.left == null && root.right == null)
        {
            ans += 1;
        }
        else if (root.left == null && root.right != null)
        {
            ans += 1;
            ans += maxDepth(root.right);
        }
        else if (root.left != null && root.right == null)
        {
            ans += 1;
            ans += maxDepth(root.left);
        }
        else
        {
            ans += 1;
            ans += Math.max(maxDepth(root.left),maxDepth(root.right));
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
