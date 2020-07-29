public static void main(String[] args) {  
    int [][] arr={{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
    
System.out.println(Rotate_Matrix(arr));
}

 public static boolean Rotate_Matrix(int[][]arr){ 
   int temp=0;
   int pos=arr.length-1;        
   int mov=arr.length-1;
    if(arr.length==0||arr[0].length!=arr.length) return false; 
   
   for(int i=0; i<arr.length-1;i++){
       temp=arr[0][i];           //saving the [0][i] element
       arr[0][i]=arr[mov][0];    // moving left column to up
       arr[mov][0]=arr[pos][mov];// moving bottom row to the left column
       arr[pos][mov]=arr[i][mov];// moving right column to the bottom
       arr[i][pos]=temp; //moving the top row to the right column 
       mov--; // moving trought the elments
   }
           
       for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[i].length;j++){
               System.out.print(arr[i][j]+" ");
           }
           System.out.println();
       }
 
    return true;
 }    
 