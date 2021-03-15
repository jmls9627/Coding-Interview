public static void main(String[] args) {  
    int [][] arr={{0,1,1,1,1},{1,1,1,1,1},{1,1,0,1,1},{1,1,1,1,1}};
    
      Zero_Matrix(arr);
}

 public static void Zero_Matrix(int[][]arr){ 
     int[] arCol =new int[arr[0].length];
     int[] arRaw=new int[arr.length];
     
   for(int i=0; i<arr.length;i++){          //saving the indices of the elements that are = 0
     for(int j=0; j<arr[i].length;j++){     
       if(arr[i][j]==0){
       arRaw[i]=i;
       arCol[j]=j;
       }
     }
   }    //If the matriz were MXM intead of MXN I would use just ONE for
   for(int i=0;i<arCol.length;i++){  
    for(int j=0;j<arr.length;j++){   //changing the column values ​​to 0
       arr[j][arCol[i]]=0;  
    }
   }
  
   for(int i=0;i<arRaw.length;i++){       
    for(int j=0;j<arr[0].length;j++){ //changing the raw values ​​to 0
        arr[arRaw[i]][j]=0; 
    }
   }
        
   /*    for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[i].length;j++){
               System.out.print(arr[i][j]+" ");
           }
           System.out.println();
       }*/
 
    
 }