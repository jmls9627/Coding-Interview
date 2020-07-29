public static void main(String[] args) {  
    int [][] arr={{0,1,1,1,1},{1,1,1,1,1},{1,1,0,1,1},{1,1,1,1,1},{1,1,1,1,0}};
    
      Zero_Matrix(arr);
}

 public static void Zero_Matrix(int[][]arr){ 
     int[] arRaw=new int[arr[0].length];
     int[] arCol=new int[arr.length];
     int cont=0;
     
   for(int i=0; i<arr.length;i++){          //saving the indices of the elements that are = 0
     for(int j=0; j<arr[i].length;j++){     
       if(arr[i][j]==0){
       arRaw[cont]=i;
       arCol[cont]=j;
       cont++;
       }
     }
   }
   
   for(int i=0;i<cont;i++){              //going through the number of zeros that the matrix has
       for(int j=0;j<arr.length;j++){   //changing the column values ​​to 0
          arr[j][arCol[i]]=0;  
       }
       for(int j=0;j<arr[i].length;j++){ //changing the raw values ​​to 0
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