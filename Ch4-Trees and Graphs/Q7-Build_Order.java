public static void main(String [] args) {
    char [] projects = {'a','b','d','f','c','e'};
     char [][] depen1 = {{'a','d'},{'f','b'},{'b','d'},{'f','a'},{'d','c'}};
   // TreeNode root = TreeNode.CreateBinaryTree(arr);
     
      for(int i=0;i<depen1.length;i++){
      System.out.println(depen1[i][0] +" -> "+ depen1[i][1]);  
    }
   
 }
    //it's not finished
   public static Graph createNewGraph(){
       Graph g = new Graph();        
       Node[] temp = new Node[6];
                 
       temp[0] = new Node("a", 1);
       temp[1] = new Node("b", 1);
       temp[2] = new Node("c", 0);
       temp[3] = new Node("d", 1);
       temp[4] = new Node("e", 0);
       temp[5] = new Node("f", 2);
      

       temp[0].addAdjacent(temp[3]);  //a-d       
       temp[1].addAdjacent(temp[3]);   //b-d        
       temp[4].addAdjacent(temp[2]);   //d-c
       temp[5].addAdjacent(temp[1]);  //f-b
       temp[5].addAdjacent(temp[0]);  //f-a
              

       for (int i = 0; i < 6; i++){
           g.addNode(temp[i]);
       }
       return g;
   }

   
  }