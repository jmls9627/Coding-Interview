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
    while (node != null) {                  //     3,5,8,5,10,2,1
        LinkedListNode next = node.next;    //(0)next=5   (1)next=8  (2)next=5    (3)next=10     (4)next=2   (5)next=1      (6)next=null
        if (node.data < x) {                //(0) 3<5     (1)5<5         8<5          5<5            10<5       2<5               1<5
            /* Insert node at head. */          
            node.next = head;              //(0)5=3                                                             1=3             =1 
             head = node;                  //(0) =3                                                              =2             =1
        } else {
                  /* Insert node at tail. */
            tail.next = node;                            //(1)5=5       8=8           5=5         10=10
            tail = node;                                 //(1) =5       =8             =5          =10
        }	
        node = next;                       //(0)3=5        (1)5=8       8=5           5=10        10=2         2=1
    }
    tail.next = null;
    
    return head;
}
}
	