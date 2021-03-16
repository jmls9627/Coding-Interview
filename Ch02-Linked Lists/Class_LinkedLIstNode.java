public class LinkedListNode {
    public LinkedListNode next, prev, last;
    public int data;
    public int size;
    
    public LinkedListNode(int d, LinkedListNode n, LinkedListNode p){
        data=d;
        setNext(n);
        setPrevious(p);
    }
    public LinkedListNode (int d){       
        data=d;
    }
    public LinkedListNode(){}

    public void setNext(LinkedListNode n) { 
       
        next=n;
       if(this==last){
          last=n;
     }
      if(n!=null && n.prev!=this){
          n.setPrevious(this);
           
      }
    }

    public void setPrevious(LinkedListNode p){
        prev=p;
        
        if(p != null && p.next!=this){
        p.setNext(this);
     }
    }
    
    public LinkedListNode clone(){
        LinkedListNode next2=null;
        if(next!=null){
            next2=next.clone();
        }
        LinkedListNode head2=new LinkedListNode(data, next2, null);
        return head2;
    }
     public String printForward() {
            if (next != null) {
                return data + " -> " + next.printForward();
            }
            return String.valueOf(data);
        }
     public static LinkedListNode C_LinkedList(int[]arr){
       
         LinkedListNode first = new LinkedListNode(arr[0],null,null);
         LinkedListNode head = first;
         LinkedListNode second =first;
         head.size=arr.length;
         head.last =second;
         
        for(int i=1;i<arr.length;i++){
            second=new LinkedListNode(arr[i],null,null);
            first.setNext(second);
            second.setPrevious(first);
            first=second;
            head.last =second;
         
        } 
        return head;
     }

   
}
