public class CH2Linked {
   
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arr={6,1,7};
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

          int [] arr1={2,9,5};
        LinkedListNode first1 = new LinkedListNode(arr1[0],null,null);
        LinkedListNode head1 = first1;
        LinkedListNode second1 =first1;
        LinkedListNode last1 =first;
      
        for(int i=1;i<arr1.length;i++){
            second1=new LinkedListNode(arr1[i],null,null);
            first1.setNext(second1);
            second1.setPrevious(first1);
            first1=second1;
            last1.last =second1;
        } 
   
        SumForward(head, head1);
        SumBackward(head, head1);
}
      /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     public static LinkedListNode SumForward (LinkedListNode head, LinkedListNode head1){
       String val="";
       String val1="";
       LinkedListNode p1 =head;
       LinkedListNode p2 =head1;
  
        while(p1!=null){
            val+=p1.data;
            p1=p1.next;
        }
 
        while(p2!=null){
            val1+=p2.data;
            p2=p2.next;
        }
        
        int sum=Integer.parseInt(val)+ Integer.parseInt(val1);
        System.out.println(val+" + "+ val1 +" = "+sum); 
        String suma=Integer.toString(sum);   
        int x=Integer.parseInt(String.valueOf(suma.charAt(0)));

       LinkedListNode first=new LinkedListNode(x);
       LinkedListNode head2 = first;
       LinkedListNode second =first;
         
        for(int i=1;i<suma.length();i++){
            second=new LinkedListNode(Integer.parseInt(String.valueOf(suma.charAt(i))));
            first.setNext(second);
            first=second;
         }
      System.out.println( head2.printForward());  

      return head2 ;
  }  
  ///////////////////////////////////////////////////////////////////////////////////////////////////

  public static LinkedListNode SumBackward (LinkedListNode head, LinkedListNode head1){
    String val="";
    String val1="";
    LinkedListNode p1 =head.last;
    LinkedListNode p2 =head1.last;
 
     while(p1!=null){
         val+=p1.data;
         p1=p1.prev;
     }

     while(p2!=null){
         val1+=p2.data;
         p2=p2.prev;
     }   
     int sum=Integer.parseInt(val)+ Integer.parseInt(val1);
     System.out.println(val+" + "+ val1 +" = "+sum); 
     String suma=Integer.toString(sum);   
     int x=Integer.parseInt(String.valueOf(suma.charAt(suma.length()-1)));

    LinkedListNode first=new LinkedListNode(x);
    LinkedListNode head2 = first;
    LinkedListNode second =first;
      
     for(int i=suma.length()-2;i>=0;i--){
         second=new LinkedListNode(Integer.parseInt(String.valueOf(suma.charAt(i))));
         first.setNext(second);
         first=second;
      }
   System.out.println( head2.printForward());  

   return head2 ;
}  
}