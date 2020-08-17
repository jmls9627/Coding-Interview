public static void main(String[] args) {
    Graph g= createNewGraph();
     Node [] node =g.getNodes();
     Node start= node[0];
     Node end =node[8];
       System.out.println(RouteBetweenNodes( g, start, end)); 
      // visit(start);
   

     //System.out.println(node[3].getAdjacent());
   }
   public static Graph createNewGraph(){
       Graph g = new Graph();        
       Node[] temp = new Node[9];
                 
       temp[0] = new Node("a", 3);
       temp[1] = new Node("b", 0);
       temp[2] = new Node("c", 0);
       temp[3] = new Node("d", 1);
       temp[4] = new Node("e", 3);
       temp[5] = new Node("f", 0);
       temp[6] = new Node("g", 1);
       temp[7] = new Node("h", 0);
       temp[8] = new Node("I", 0);

       temp[0].addAdjacent(temp[1]);  //a
       temp[0].addAdjacent(temp[2]);
       temp[0].addAdjacent(temp[3]);
               
       temp[3].addAdjacent(temp[4]); //d
               
       temp[4].addAdjacent(temp[5]); //e
               temp[4].addAdjacent(temp[6]);
               temp[4].addAdjacent(temp[7]);
               
               temp[6].addAdjacent(temp[8]);

       for (int i = 0; i < 9; i++){
           g.addNode(temp[i]);
       }
       return g;
   }
   
   
   
   public static boolean RouteBetweenNodes(Graph g, Node start, Node end){
    LinkedList<Node> q = new LinkedList<>();
    if (start==null || end == null)
        return false;
    
    start.visited=true;
    q.add(start);
       Node node;
       while(!q.isEmpty()){
           node=q.removeFirst();
           //System.out.println(node.getVertex());
           if(node!=null){
               for (Node x : node.getAdjacent()){
               if(x.visited==false){
                   if(x==end){
                       System.out.println(x.getVertex()+" == " + end.getVertex());
                       return true;
                   }else{
                       System.out.println(node.getVertex()+"=>"+x.getVertex());
                       x.visited=true;
                       q.add(x);
                   }
               }
           }
        }
           
       }
       
       return false;
   }  
   
   public static void visit(Node node) {
       if (node != null) {
           System.out.println(node.getVertex());
       }
   }
 }