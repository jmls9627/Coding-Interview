ODO code application logic here
        int [] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
        int var=3;
        Stack <Integer> pila=new Stack<>();
        ThreeInOne(arr, var);
   
    }
    public static boolean ThreeInOne(int[]arr, int var){ 
        if(arr.length<3){
            return false;
        }
                int div=arr.length/var;
                int cont=div;
       
      Stack <Integer> Pila1 =new Stack<>();  
      Stack <Integer> Pila2 =new Stack<>();
      Stack <Integer> Pila3 =new Stack<>();
      
      for(int i=0;i<arr.length;i++){
          if(cont==-1)               //Pila 3
              Pila3.push(arr[i]); 
 
          if(i<div && cont>0){        //Pila 1
              Pila1.push(arr[i]);
              cont--;
                if (cont==0)
                cont=div; 
          }

          if(i>=div && cont>0){         //Pila 2
             Pila2.push(arr[i]);
              cont--;
              if (cont==0)
                  cont=-1;
          }  
      }
       
       
  /* while(!Pila2.empty()){
              System.out.println(Pila2.pop());
          }*/
        
      return true;
    }
    