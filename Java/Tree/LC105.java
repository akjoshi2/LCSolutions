public class LC105 {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, Integer.MIN_VALUE);
    }
    private int i = 0;
    private int p = 0;
    private TreeNode build(int[] preorder, int[] inorder, int fin) {
        if (p >= preorder.length) {
            return null;
        }
        if (inorder[i] == fin) {
            i++;
            return null;
        }
        TreeNode node = new TreeNode(preorder[p]);
        p++;
        node.left = build(preorder, inorder, node.val);
        node.right = build(preorder, inorder, fin);
        return node;
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