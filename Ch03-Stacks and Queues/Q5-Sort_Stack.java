public static void main(String[] args) {
    // TODO code application logic here
    int [] arr={8,3,7,5,6,1,10,2,9,4};      
   Stack<Integer> pila=new Stack<>();
    for(int i=0;i<arr.length;i++){
        pila.push(arr[i]);
    }
    while(!Sort_Stack(pila).empty()){
        System.out.println(Sort_Stack(pila).pop());
    }

}
public static Stack<Integer> Sort_Stack(Stack <Integer> pila){ 
   Stack <Integer> pila1=new Stack<>();        
   while(!pila.empty()){
        int temp=pila.pop();
        while(!pila1.empty() && pila1.peek()>temp){
         pila.push(pila1.pop());
        }
        pila1.push(temp);
   }
   
   while(!pila1.empty()){
       pila.push(pila1.pop());
   }
    //System.out.println(pila.peek());
 return pila;
  }