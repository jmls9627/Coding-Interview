public class CH2Linked {
   
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arr={1,2,3,4,5,6,7,8,9};
        LinkedListNode first = new LinkedListNode(arr[0],null,null);
        LinkedListNode head = first;
        LinkedListNode second =first;
        
        for(int i=1;i<arr.length;i++){ //LinkedList
            second=new LinkedListNode(arr[i],null,null);
            first.setNext(second);
            second.setPrevious(first);
            first=second;
        } 

        for (int i = 0; i <arr.length; i++) {
	    LinkedListNode var=KthtoLast( head, i);  
        System.out.println("pos: "+ i +" = "+var.data+"  "+var.printForward());  
	 
		}
    }  
  
     public static LinkedListNode  KthtoLast(LinkedListNode head, int k){//k is an element  
        if(k==0||k==1) {
            while(head.next!=null){
            head=head.next;
        }
            return head;
        }
            LinkedListNode p1 = head;
            LinkedListNode p2 = head;
        
         for (int i=0; i<k; i++){
             if(p1==null) return null;
             p1=p1.next;
         }
         
        while(p1!=null){
            p1=p1.next;
            p2=p2.next;
    } 
        return p2;   
    }





}