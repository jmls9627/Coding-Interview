public static void main(String[] args) {
 
    int [] arr={1,2,3,4,5,6,7,8,9,10};
    LinkedListNode first = new LinkedListNode(arr[0],null,null);
    LinkedListNode head = first;
    LinkedListNode second =first;
    
    for(int i=1;i<arr.length;i++){
        second=new LinkedListNode(arr[i],null,null);
        first.setNext(second);
        second.setPrevious(first);
        first=second;
    } 

System.out.println(Delete_Middle_node(head).printForward());
}
  

 public static LinkedListNode Delete_Middle_node(LinkedListNode head){
        LinkedListNode p1 = head;
        int cont=0;
        int half=0;
       
    while(p1!=null){ //how many elements i have  //10 or 9 example
     cont++;
     p1=p1.next;     
     }  

   p1=head; //pinting head
   if(cont%2==0){     // if is even 10
       half=(cont/2) -1;  //half=4       5-1
   }else{
       half=cont/2;   //  half=4
   }
   cont=1;   //reset

 while(p1!=null){   //modify the next element
        if(cont==half){              
            p1.next=p1.next.next;            
            return head;
        }
          cont++;
        p1=p1.next;
}
 return head;
}