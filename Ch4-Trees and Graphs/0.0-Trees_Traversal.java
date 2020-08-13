
void InOrderTraversal(Tree node){ // In-Order Traversal means visit the left branch , then the current node and finally the right branch
    if(node!=null){
      InOrderTraversal(node.left);
      visit(node);
      InOrderTraversal(node.right);
    }
}

void PreOrderTraversal(Tree node){ // Pre-Order Traversal visit the current node before its child nodes
    if(node!=null){
      visit(node);
      InOrderTraversal(node.left);
      InOrderTraversal(node.right);
    }
}

void PostOrderTraversal(Tree node){ // Post-Order Traversal visit the current node after its child nodes
    if(node!=null){                   //In a post order traversal the root is always the last node visited
      InOrderTraversal(node.left);
      InOrderTraversal(node.right);
      visit(node);
    }
}