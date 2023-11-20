// Solution to LeetCode 230: Kth Smallest Element in a BST
// Category: Tree
// Difficulty: Medium

import java.util.ArrayList;
import java.util.List;

public class LC230 {
	    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        return list.get(k-1);
    }
    public void inorder(TreeNode root, List<Integer> list)
    {
        if (root == null)
        {
            return;
        }
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
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
