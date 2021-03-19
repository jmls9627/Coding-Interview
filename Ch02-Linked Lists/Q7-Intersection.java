public class CH2Linked {
   
    public static void main(String[] args) {
        // TODO code application logic here
     int [] arr={2,2,3};
     int [] arr1={4,4,1,3,2,3,2};
     int [] inter={7,2,1};
     LinkedListNode head= LinkedListNode.C_LinkedList(arr);
     LinkedListNode head1= LinkedListNode.C_LinkedList(arr1);
     LinkedListNode inters= LinkedListNode.C_LinkedList(inter);
     head.last.setNext(inters);
     head1.last.setNext(inters);
     System.out.println(Intersection (head, head1).printForward());

}
      
     public static LinkedListNode Intersection (LinkedListNode head,LinkedListNode head1){
     
      if(head==null || head1==null)
       return null;
      if(head.last!=head.last)//if the tails are diferent there's no intersection
       return null;
      
       int c=0;
       LinkedListNode node=null;
       LinkedListNode p1 =head;
       LinkedListNode p2 =head1;
       
       
       if(p1.size == p2.size)// same size
         node = NodeIntersection(p1, p2, c);
       
         if(p1.size > p2.size){ //p1.size is bigger than p2
           c=p1.size-p2.size;
            node = NodeIntersection(p1, p2, c);
       }
          if(p1.size < p2.size){//p2.size is bigger than p1
           c=p2.size-p1.size;
            node = NodeIntersection(p2, p1, c);
       }
          return node;
     }    
     
     public static LinkedListNode NodeIntersection(LinkedListNode p1,  LinkedListNode p2, int c){
         int cont=0;
         while(p1!=null && p2!=null){
           if(cont>=c ){     //iterate throuhg the bigger list untill i get the same size on both of them    
              if(p1==p2)
                 return p1;               
              else
                 p2=p2.next;          
             }
       cont++;
       p1=p1.next;
       }
     return null;
     }   
  }
