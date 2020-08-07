public class CH2Linked {
   
    public static void main(String[] args) {
        // TODO code application logic here
     
     int [] arr={1,2,3,4,5,6,7,8,9,10};  
     LinkedListNode head= LinkedListNode.C_LinkedList(arr);
     head.last.setNext(head);
     System.out.println(HasLoop(head).data);

}
      
     public static LinkedListNode HasLoop(LinkedListNode head){
       HashSet<LinkedListNode> set= new HashSet();
       LinkedListNode p1 =head;
     while(p1!=null){
         if(set.contains(p1)){
             return p1;
         }else{
             set.add(p1);
         }
         p1=p1.next;
     } 
      return null;
     }    
   
  }
