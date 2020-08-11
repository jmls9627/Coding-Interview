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
  ////////////////////////////////////////////////////////////////////////////

  public static void main(String[] args) {
    // TODO code application logic here
    int [] arr={2,3,4,5,6,1,7,8,9,10};      
    StackWithMin pilaMin=new StackWithMin();
    for(int i=0;i<arr.length;i++){
        pilaMin.push(arr[i]);
    }
         
    while(!pilaMin.empty()){
        System.out.println("Top " + pilaMin.peek()); 
        System.out.println("Min " +pilaMin.min()); 
         System.out.println();
        pilaMin.pop();
    }
    
}
  public class StackWithMin extends Stack<Integer> {
	Stack<Integer> p2;
	
	public StackWithMin() {
		p2 = new Stack<Integer>();		
	}
	
	public void push(int value){
		if (value <= min()) {
			p2.push(value);
		}
		super.push(value);
	}
	
	public Integer pop() {
		int value = super.pop();
		if (value == min()) {
			p2.pop();			
		}
		return value;
	}
	
	public int min() {
		if (p2.isEmpty()) {
			return Integer.MAX_VALUE;
		} else {
			return p2.peek();
		}
	}
}