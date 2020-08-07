public class CH2Linked {
   
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arr={1,2,1,0,1,2,1};
        LinkedListNode first = new LinkedListNode(arr[0],null,null);
        LinkedListNode head = first;
        LinkedListNode second =first;
         LinkedListNode last =first;
      
        for(int i=1;i<arr.length;i++){
            second=new LinkedListNode(arr[i],null,null);
            first.setNext(second);
            second.setPrevious(first);
            first=second;
            last.last =second;
        } 
      
     System.out.println(Palindrome(head)); 
}
      
     public static boolean Palindrome (LinkedListNode head){
     
       LinkedListNode p1 =head;
       LinkedListNode p2 =head.last;
  
        while(p1!=null && p2!=null){
            
             if(p2.data!=p1.data){
         System.out.println(p1.data+" != "+p2.data); 
                return false;
            }
         System.out.println(p1.data+" = "+p2.data);  
            p1=p1.next;
            p2=p2.prev;
        }

      return true ;
  }  
         
}