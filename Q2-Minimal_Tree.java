public static void main(String[] args) {
    int [] arr={1,2,3,4,5,6,7,8,9,10};
       CreateBinaryTree(arr); 
   }
  
   public static TreeNode CreateBinaryTree(int [] arr){
           return CreateBinaryTree(arr,0,arr.length-1);
       }
        
   public static TreeNode CreateBinaryTree(int[]arr,int start, int end){
             if(start>end) return null;
     
           int mid=(start+end)/2;           
           TreeNode root=new TreeNode(arr[mid]);
            System.out.println(root.data);
           
        root.left=CreateBinaryTree(arr, start, mid-1);
           
         root.right=CreateBinaryTree(arr, mid+1, end);
           return root;
   
   }