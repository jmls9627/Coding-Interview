public static void main(String [] args) {          

    int[] array1 = {1,2,3,4,5,6,7,8,9,10};
    TreeNode root =  TreeNode.CreateBinaryTree(array1);
    Random random =new Random();
            int i = random.nextInt(root.size());
            TreeNode randomNode = root.getIthNode(i);
            System.out.println(randomNode.data);

}


public static TreeNode getRandomNode(TreeNode root) {
    if (root == null) return null;
    
    Random random = new Random();
    int i = random.nextInt(root.size());

            return getIthNode(i, root);
}

 public static TreeNode getIthNode(int i, TreeNode root) {
    int leftSize = root.left == null ? 0 : root.left.size();
    if (i < leftSize) {
        return getIthNode(i, root.left);
    } else if (i == leftSize) {
        return root;
    } else {
        return getIthNode(i - (leftSize + 1),root.right);
    }
}


}