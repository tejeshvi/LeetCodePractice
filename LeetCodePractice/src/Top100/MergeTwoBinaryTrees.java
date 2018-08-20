package Top100;

public class MergeTwoBinaryTrees {

	static void inorder(TreeNode node)
    {
        if (node == null)
            return;
      
        /* first recur on left child */
        inorder(node.left);
      
        /* then print the data of node */
        System.out.printf("%d ", node.val);
      
        /* now recur on right child */
        inorder(node.right);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Let us construct the first Binary Tree
        1
      /   \
     2     3
    / \     \
   4   5     6
		 */
		TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);
        root1.right.right = new TreeNode(6);
	    
	    /* Let us construct the second Binary Tree
        4
      /   \
     1     7
    /     /  \
   3     2    6   */
        TreeNode root2 = new TreeNode(4);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(7);
        root2.left.left = new TreeNode(3);
        root2.right.left = new TreeNode(2);
        root2.right.right = new TreeNode(6);
	    
        TreeNode resultRoot = mergeTrees(root1, root2);
        inorder(resultRoot);
	}
	
	public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		TreeNode resultRoot;
		if(t1==null)
			return t2;
		if(t2==null)
			return t1;
		resultRoot=new TreeNode(t1.val+t2.val);
		resultRoot.left= mergeTrees(t1.left, t2.left);
		resultRoot.right=mergeTrees(t1.right, t2.right);		
		return resultRoot;
    }

}
