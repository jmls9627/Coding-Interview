public class TreeNode {
    public int data;
    public TreeNode left,right,parent;
    private int size;
    
    public TreeNode(int d){
        data=d;
        size=1;
    }
    
    public void InsertInOrder(int d){
        if(d <= data){
            if(left==null){
                setLeftChild(new TreeNode(d));
            } else {
                left.InsertInOrder(d);
               }
      } else {
            if(right==null){
                setRightChild(new TreeNode(d));
            } else {
                right.InsertInOrder(d);
             }
         }
          size++;
    }
    
    public int size(){
        return size;
    }
    public TreeNode find(int d){
        if(d==data){
            return this;
        } else if (d <= data){
            return left != null ? left.find(d) : null;
        } else if (d > data){
            return right != null ? right.find(d): null;
        }
            return null;
        }
   
     public void setLeftChild(TreeNode left){
         this.left=left;
         if(left!=null){
             left.parent=this;
         }
     }
      
     public void setRightChild(TreeNode right){
         this.right=right;
         if(right!=null){
             right.parent=this;
         }
     }



     public static TreeNode CreateBinaryTree(int [] arr){
        TreeNode root=CreateBinaryTree(arr,0,arr.length-1);
        root.size=arr.length;
        return root; 
    }
     
public static TreeNode CreateBinaryTree(int[]arr,int start, int end){
          if(start>end) return null;
  
        int mid=(start+end)/2;           
        TreeNode root=new TreeNode(arr[mid]);
        // System.out.println(root.data);
    
     root.setLeftChild(CreateBinaryTree(arr, start, mid-1));
     
     root.setRightChild(CreateBinaryTree(arr, mid+1, end));
    
      
        return root;

}

public TreeNode getRandomNode() {
    int leftSize = left == null ? 0 : left.size();
    Random random = new Random();
    int index = random.nextInt(size);
    if (index < leftSize) {
        return left.getRandomNode();
    } else if (index == leftSize) {
        return this;
    } else {
        return right.getRandomNode();
    }
}
}
