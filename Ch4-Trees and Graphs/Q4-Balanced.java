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
    //////////////////////////////////////////////////////////////////////////////////////////

    public static int checkHeight(TreeNode root) {
		if (root == null) {
			return -1;
		}
		int leftHeight = checkHeight(root.left);
		if (leftHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE; // Propagate error up
		
		int rightHeight = checkHeight(root.right);
		if (rightHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE; // Propagate error up
		
		int heightDiff = leftHeight - rightHeight;
		if (Math.abs(heightDiff) > 1) {
			return Integer.MIN_VALUE; // Found error -> pass it back
		} else {
			return Math.max(leftHeight, rightHeight) + 1;
		}
	}
	
	public static boolean isBalanced2(TreeNode root) {
		return checkHeight(root) != Integer.MIN_VALUE;
	}

  }