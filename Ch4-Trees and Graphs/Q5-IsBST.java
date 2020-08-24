public class Ch4Trees_Graphs {
    static int index=0;
   
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
    
  }