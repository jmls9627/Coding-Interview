*/
public static void main(String [] args) {
int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
TreeNode root = TreeNode.CreateBinaryTree(arr);
TreeNode x=root.find(1);
TreeNode y=root.find(10);
TreeNode var=CommonAncestor(x,y);

System.out.println(var.data);

}

public static TreeNode CommonAncestor(TreeNode x, TreeNode y){   
   int dif= Depth(x)-Depth(y);
   TreeNode first  = dif > 0 ? y : x;
   TreeNode second = dif > 0 ? x : y;
   second=PutSameLvl(second,Math.abs(dif));
   
   while(first != second && first!=null && second!=null){
       first=first.parent;
       second=second.parent;
   }
   return  first;
   
}

public static TreeNode PutSameLvl(TreeNode var, int dif){
   while(var!=null && dif > 0){
    var=var.parent;
    dif--;
   }
   return var;
}

public static int Depth(TreeNode var){
   int depth=0;
   while(var!=null){
       var=var.parent;
       depth++;
   }
  return depth;
} 
/////////////////////////////////////////////////////////////////////////////

public static TreeNode commonAncestor(TreeNode p, TreeNode q) {
    if (p == q) return p;
    
    TreeNode ancestor = p;
    while (ancestor != null) {
        if (isOnPath(ancestor, q)) {
            return ancestor;
        }
        ancestor = ancestor.parent;
    }
    return null;
}

public static boolean isOnPath(TreeNode ancestor, TreeNode node) {
    while (node != ancestor && node != null) {
        node = node.parent;
    }
    return node == ancestor;
}	
///////////////////////////////////////////////////////////////
public static TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (!covers(root, p) || !covers(root, q)) {
        return null;
    } else if (covers(p, q)) {
        return p;
    } else if (covers(q, p)) {
        return q;
    }
    
    TreeNode sibling = getSibling(p);
    TreeNode parent = p.parent;
    while (!covers(sibling, q)) {
        sibling = getSibling(parent);
        parent = parent.parent;
    }
    return parent;
}

public static boolean covers(TreeNode root, TreeNode p) { 
    if (root == null) return false;
    if (root == p) return true;
    return covers(root.left, p) || covers(root.right, p); 
}

public static TreeNode getSibling(TreeNode node) {
    if (node == null || node.parent == null) {
        return null;
    }
    
    TreeNode parent = node.parent;
    return parent.left == node ? parent.right : parent.left;
}
///////////////////////////////////////////////////////////////////////////

public static TreeNode commonAncestor( TreeNode p, TreeNode q) {
    if ((p == null) || (q == null)) {
        return null;
    }
    
    TreeNode ap = p.parent;
    while (ap != null) {
        TreeNode aq = q.parent;
        while (aq != null) { 
            if (aq == ap) {
                return aq;
            }
            aq = aq.parent;
        }
        ap = ap.parent;
    }
    return null;
}

}