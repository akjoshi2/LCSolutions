// Solution to LeetCode 226: Invert Binary Tree
// Category: Tree
// Difficulty: Easy

public class LC226 {
	public TreeNode invertTree(TreeNode root) {
        if (root == null)
        {
            return null;
        }
        if (root.left == null && root.right == null)
        {
            return root;
        }
        else if (root.left == null && root.right != null)
        {
            root.left = invertTree(root.right);
            root.right = null;
        }
        else if (root.left != null && root.right == null)
        {
            root.right = invertTree(root.left);
            root.left = null;
        }
        else if (root.left != null && root.right != null)
        {
            TreeNode temp = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(temp);
        }
        return root;
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
