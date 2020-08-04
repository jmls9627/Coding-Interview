public static void main(String[] args) {
    // TODO code application logic here
    int [] arr={1,2,3,4,5,6,7,8,9};
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
    System.out.println(KthtoLast(head, 2).printForward());  
     // System.out.println(head.printForward());

}  
public static LinkedListNode KthtoLast(LinkedListNode head, int k){
    int cont=0;
    LinkedListNode n=head;
    while(n!=null){  //n.data working with an element
        if(cont==k){  //n.data
            head=n;
            return head;
        }
        cont++;              //
        n=n.next;
}
    return head;
    
}


}
