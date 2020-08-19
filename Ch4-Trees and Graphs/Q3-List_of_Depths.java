public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    TreeNode root = TreeNode.CreateBinaryTree(arr);
    ArrayList<LinkedList<TreeNode>> list = createLevelLinkedList(root);
    printResult(list);
    }
   
    public static ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root) {
		ArrayList<LinkedList<TreeNode>> lists = new ArrayList<>();
		createLevelLinkedList(root, lists, 0);
		return lists;
	}	
    
      public static void createLevelLinkedList(TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level) {
		if (root == null) return;
		LinkedList<TreeNode> list = null;
		if (lists.size() == level) { // Level not contained in list
			list = new LinkedList<>();
			/* Levels are always traversed in order. So, if this is the first time we've visited level i,
			 * we must have seen levels 0 through i - 1. We can therefore safely add the level at the end. */
			lists.add(list);  
		} else {
			list = lists.get(level);
		}
		list.add(root);
		createLevelLinkedList(root.left, lists, level + 1);
		createLevelLinkedList(root.right, lists, level + 1);
	}
       
      
      public static void printResult(ArrayList<LinkedList<TreeNode>> result){
		
		for(int i=0; i<result.size();i++) {
			Iterator<TreeNode> ite = result.get(i).listIterator();
			System.out.print("Link list at depth " + i + ":");
			while(ite.hasNext()){
				System.out.print(" " + ite.next().data);
			}
			System.out.println();
			
		}
	}
    
   
  }