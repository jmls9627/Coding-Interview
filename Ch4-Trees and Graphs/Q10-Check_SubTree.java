public static void main(String [] args) {          
    //TreeNode node = TreeNode.CreateBinaryTree(array);  
    // t2 is a subtree of t1
int[] array1 = {1,2,3};
int[] array2 = {1, 2, 3};

TreeNode t1 =  TreeNode.CreateBinaryTree(array1);
TreeNode t2 =  TreeNode.CreateBinaryTree(array2);

if (containsTree(t1, t2)) {
  System.out.println("t2 is a subtree of t1");
} else {
  System.out.println("t2 is not a subtree of t1");
}

// t4 is not a subtree of t3
int[] array3 = {1, 3, 2};
TreeNode t3 =  TreeNode.CreateBinaryTree(array1);
TreeNode t4 = TreeNode.CreateBinaryTree(array3);

if (containsTree(t3, t4)) {
  System.out.println("t4 is a subtree of t3");
} else {
  System.out.println("t4 is not a subtree of t3");
}

}

///////////////////////////////////////////////////////////////////////////
public static boolean containsTree(TreeNode t1, TreeNode t2) {
StringBuilder string1 = new StringBuilder();
StringBuilder string2 = new StringBuilder();

getOrderString(t1, string1);
getOrderString(t2, string2);

return string1.indexOf(string2.toString()) != -1;
}

public static void getOrderString(TreeNode node, StringBuilder sb) {
if (node == null) {
  sb.append("X");             // Add null indicator
  return;
}
sb.append(node.data);           // Add root 
getOrderString(node.left, sb);  // Add left
getOrderString(node.right, sb); // Add right
}


}
