public static void main(String[] args) {
    // TODO code application logic here
    int [] arr={2,3,4,5,6,1,7,8,9,10};
    
    Stack <Integer> pila=new Stack<>();
    for(int i=0;i<arr.length;i++){
        pila.push(arr[i]);
    }
    System.out.println(MinValue(pila)); 

}
public static int MinValue(Stack <Integer> pila){ 
   int val= pila.peek();
   Stack <Integer> Pila1 =new Stack<>();  
   while(!pila.empty()){
       if(val>pila.peek()){
           val=pila.peek();
       }
      Pila1.push(pila.pop());
   } 
 return val;
  }