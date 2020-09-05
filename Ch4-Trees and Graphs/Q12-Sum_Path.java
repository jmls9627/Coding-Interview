public static void main(String [] args) {          

      
    TreeNode root = new TreeNode(0);         //      0
    root.left = new TreeNode(0);             //     / \ 
    root.right = new TreeNode(0);            //    0   0
    root.right.left = new TreeNode(0);       //       / \
    root.right.right = new TreeNode(0);      //      0   0
    root.right.left.right = new TreeNode(4);     //   \
                                                   //  4
    System.out.println(countPathsWithSum(root, 0));//11
    System.out.println(countPathsWithSum(root, 4));//4
}

public static int countPathsWithSum(TreeNode root, int targetSum) {
    if (root == null) return 0;
    
    /* Count paths with sum starting from the root. */
    int pathsFromRoot = countPathsWithSumFromNode(root, targetSum, 0);
    
    /* Try the nodes on the left and right. */
    int pathsOnLeft = countPathsWithSum(root.left, targetSum);
    int pathsOnRight = countPathsWithSum(root.right, targetSum);
    
    return pathsFromRoot + pathsOnLeft + pathsOnRight;
}

/* Returns the number of paths with this sum starting from this node. */
public static int countPathsWithSumFromNode(TreeNode node, int targetSum, int currentSum) {
    if (node == null) return 0;

    currentSum += node.data;
    
    int totalPaths = 0;
    if (currentSum == targetSum) { // Found a path from the root
        totalPaths++;
    }
    
    totalPaths += countPathsWithSumFromNode(node.left, targetSum, currentSum); // Go left
    totalPaths += countPathsWithSumFromNode(node.right, targetSum, currentSum); // Go right
    
    return totalPaths;
}	

/////////////////////////////////////////////////////////////////////////

public static int countPathsWithSum(TreeNode root, int targetSum) {
    return countPathsWithSum(root, targetSum, 0, new HashMap<Integer, Integer>());
}

public static int countPathsWithSum(TreeNode node, int targetSum, int runningSum, HashMap<Integer, Integer> pathCount) {
    if (node == null) return 0; // Base case
    
    runningSum += node.data;
    
    /* Count paths with sum ending at the current node. */
    int sum = runningSum - targetSum;
    int totalPaths = pathCount.getOrDefault(sum, 0);
    
    /* If runningSum equals targetSum, then one additional path starts at root. Add in this path.*/
    if (runningSum == targetSum) {
        totalPaths++;
    }

    /* Add runningSum to pathCounts. */
    incrementHashTable(pathCount, runningSum, 1);
    
    /* Count paths with sum on the left and right. */
    totalPaths += countPathsWithSum(node.left, targetSum, runningSum, pathCount);
    totalPaths += countPathsWithSum(node.right, targetSum, runningSum, pathCount);
    
    incrementHashTable(pathCount, runningSum, -1); // Remove runningSum
    return totalPaths;
}

public static void incrementHashTable(HashMap<Integer, Integer> hashTable, int key, int delta) {
    int newCount = hashTable.getOrDefault(key, 0) + delta;
    if (newCount == 0) { // Remove when zero to reduce space usage
        hashTable.remove(key);
    } else {
        hashTable.put(key, newCount);
    }
}