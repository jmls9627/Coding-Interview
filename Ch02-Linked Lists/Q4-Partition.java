public class CH2Linked {
   
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arr={3,5,8,5,10,2,1};
        LinkedListNode first = new LinkedListNode(arr[0],null,null);
        LinkedListNode head = first;
        LinkedListNode second =first;
      

        for(int i=1;i<arr.length;i++){
            second=new LinkedListNode(arr[i],null,null);
            first.setNext(second);
            second.setPrevious(first);
            first=second;
        } 
   
     System.out.println(Partition(head, 5).printForward());  
}

     public static LinkedListNode Partition(LinkedListNode head,int x){
         boolean
         LinkedListNode pointer=head;
         int cant=0;
         while(pointer!=null){
             cant++;
             pointer=pointer.next;            
         }
         pointer=head;
    int[] arr= new int[cant];
    for(int i=0;i<arr.length;i++){
        arr[i]=pointer.data;
        pointer=pointer.next;
    }
        java.util.Arrays.sort(arr);
     
        pointer=head;
      for(int i=0;i<arr.length;i++){
       pointer.data=(arr[i]);
       pointer=pointer.next;
    }
       
     return head;
  }
  ////////////////////////////////////////////////////////////////////////////
  public static LinkedListNode Partition1(LinkedListNode node, int x) {
    LinkedListNode head = node;
    LinkedListNode tail = node;
    
    /* Partition list */
    while (node != null) {                  
        LinkedListNode next = node.next;                       
        if (node.data < x) {                            
            /* Insert node at head. */
            node.next = head;
            head = node;                           
        } else {
                  /* Insert node at tail. */
            tail.next = node;
            tail = node;                          
        }	
        node = next;                      
    }
    tail.next = null;
    
    return head;
}
}
	