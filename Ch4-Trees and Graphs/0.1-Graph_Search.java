void DFS(Node node){ //Depth-First Search
if (node==null) return;
visit(node);
node.visited=true;
foreach(Node n in node.adjacent){
    if(n.visited==false){
        DFS(n);
    }   
  }
}

void BFS(Node node){// Breadth-First Search
Queue queue=new Queue();
node.marked=true;
queue.push(node); //add to the end of the queue

while(!queue.empty()){
    Node r= queue.pop();
    visit(r);
    foreach (Node n in r.adjacent){
        if(n.marked==false){
            n.marked=true;
            queue.push(n);
        }
    }
}

}