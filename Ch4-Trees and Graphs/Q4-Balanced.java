public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4,5,6,7,8,9,10};
    TreeNode root = TreeNode.CreateBinaryTree(arr);
       getHeight(root);
        System.out.println(isBalanced(root)); 
    }
     
    public static int getHeight(TreeNode root){
        if(root==null) return -1;
        return Math.max(getHeight(root.left),getHeight(root.right))+1;
    }
    
    public static boolean isBalanced(TreeNode root) {
		if (root == null) {
			return true;
		}
		int heightDiff = getHeight(root.left) - getHeight(root.right);
		if (Math.abs(heightDiff) > 1) {
			return false;
		}
		else {
			return isBalanced(root.left) && isBalanced(root.right);
		}
	}

  }