// Solution to LeetCode 572: Subtree of Another Tree
// Category: Tree
// Difficulty: Easy

public class LC572 {
	    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null)
        {
            return false;
        }
        if (isSameTree(root, subRoot))
        {
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        
    }
    public boolean isSameTree(TreeNode p, TreeNode q)
    {
        if (p == null && q == null)
        {
            return true;
        }
        if (p != null && q != null)
        {
            return ((p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
        }
        return false;   
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
