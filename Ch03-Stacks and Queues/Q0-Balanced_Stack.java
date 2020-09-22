
 public static void main(String[] args) {
    // TODO code application logic here
    char [] arr={'"','(','{','(',')','}',')','"'};      
    Stack pila=new Stack();
    
    for(int i=0;i<arr.length;i++){
        pila.push(arr[i]); 
    }
    
    System.out.println(BalacedStack(pila));
}

public static boolean BalacedStack(Stack pila){
    if(pila.size()%2!=0) 
        return false;
     
    Stack pila1=new Stack();
    int cont=pila.size()/2;
    
    while(!pila.empty() && cont>0){
        pila1.push(pila.pop());
        cont--;   
    }
  
    while(!pila.empty() && !pila1.empty()){
        boolean var=Comparison((char)pila.pop(),(char)pila1.pop());  
           if(!var) 
               return false;
    }
    return true;
}

public static boolean Comparison(char x, char y){
    return ((x=='{' && y=='}')||(x=='(' && y==')')||
           (x=='[' && y==']')||(x=='"' && y=='"'));
}
