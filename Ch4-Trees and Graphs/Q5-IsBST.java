public class Ch4Trees_Graphs {
    static int index=0;
    public static Integer lastPrinted = null;
   
    public static void main(String [] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    TreeNode root = TreeNode.CreateBinaryTree(arr);
      
    System.out.println(CheckBST(root)); 
    }
    
     public static boolean CheckBST(TreeNode root){
          int[]arr=new int[root.size()];
          IsBST(root,arr);     
          for(int i=1; i<arr.length;i++){
              if(arr[i]<=arr[i-1]) return false;
             
           }
          return true;
    }
     
    public static void IsBST(TreeNode root, int[]arr){ //In-Order
        if(root==null) return ;
        IsBST(root.left, arr);
        arr[index]=root.data;
        index++;
        IsBST(root.right, arr);       
    }
    /////////////////////////////////////////////////////////////////////////

    public static boolean checkBST1(TreeNode n) {
		if (n == null) 
			return true;
		
		// Check / recurse left
		if (!checkBST1(n.left)) 
			return false;
		
		// Check current
		if (lastPrinted != null && n.data <= lastPrinted) 
			return false;
	
		lastPrinted = n.data;
		
		// Check / recurse right
		if (!checkBST1(n.right)) 
			return false;
		
		return true;
    }
    ///////////////////////////////////////////////////////////////////////////////

    public static boolean checkBST2(TreeNode n) {
        return checkBST2( n, null, null);
      }
      
       public static boolean checkBST2(TreeNode n,Integer min, Integer max) {
        if(n==null) {
           return true;
        }
        if((min!=null && n.data<=min)||(max!=null && max<=n.data)){
            return false;
        }
        if( !checkBST2(n.left, min, n.data) || !checkBST2(n.right, n.data, max)){
            return false;
        }
        return true;
      }

   
  }