public static void main(String[] args) {
    // TODO code application logic here
    int [] arr={1,2,1,3,4,4,4,5,5};
    String[]arr1={};
    LinkedListNode first = new LinkedListNode(arr[0],null,null);
    LinkedListNode head = first;
    LinkedListNode second =first;
    
    for(int i=1;i<arr.length;i++){
        second=new LinkedListNode(arr[i],null,null);
        first.setNext(second);
        second.setPrevious(first);
        first=second;
    } 
   
    System.out.println(head.printForward());
     Remove_Dups2(head);
      System.out.println(head.printForward());
       
    
    LinkedList<String> paises =new LinkedList<>();
     paises.add("Espana");
     paises.add("Espana");
     paises.add("Espana");
     paises.add("Espana");
     paises.add("Cuba");       
     paises.add("Italia");
     paises.add("EEUU");
     paises.add("Cuba");
     paises.add("Cuba");
   
     //Remove_Dups1(paises);   
}
public static void Remove_Dups1(LinkedList <String> p){

  for(int j=0;j<p.size();j++){
      int cont=0;
    
   for(int i=0; i<p.size();i++){           
     if(p.get(i).equals(p.get(j))){
         cont++;        
         if(cont>1)
         p.remove(i);            
     }            
   }                
  }

System.out.println(p); 

}
////////////////////////////////////////////////////////////////////////////////////////////////
 public static void Remove_Dups2(LinkedListNode n){
 HashSet<Integer> set=new HashSet<Integer>();
 LinkedListNode pre=null;
 
 while(head!=null){
     if(set.contains(head.data))
        pre.next=head.next;
     else{
         set.add(head.data);
         pre=head;
     }
     head=head.next;
 }

}
////////////////////////////////////////////////////////////////////////////////////////// {1,2,1,3,4,4,4,5,5};
public static void Remove_Dups3(LinkedListNode head) {
    LinkedListNode current = head;
    while (current != null) {
        /* Remove all future nodes that have the same value */
        LinkedListNode runner = current;
        while (runner.next != null) { 
            if (runner.next.data == current.data) {
                runner.next = runner.next.next;
            } else {
                runner = runner.next;
            }
        }
        current = current.next;
    }
}	