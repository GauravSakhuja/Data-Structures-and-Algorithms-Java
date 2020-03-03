class MyBST
{
  Node root ;

  public static void main(String[] args)
  {
    MyBST bst=new MyBST();
    bst.insert(21);
    bst.insert(17);
    bst.insert(23);
    bst.insert(20);
    bst.insert(26);
    bst.insert(13);
    bst.insert(18);
    
    bst.exposeBST();
  }

  void insert(int V){
    
    Node current = root;
    Node n =  new Node(V, null);
    if (root==null)
    {
       
      root=n;
    }
    else
    {
      current =root;
      while(current != null)
      {
        n= new Node(V);
        if(current.value < V)
        {
          if (current.right==null)
          {
            current.right=n;
            current.right.parent=current;
            break;
          } 
          //right
          current = current.right;
        } 
        else
        {
           if (current.left==null)
          {
            current.left=n;
            current.left.parent=current;
            break;
          } 
          //left
          current = current.left;
        }
      }//end while
    }

  }

  void exposeBST(){
    Node current = root;
    Node parent = root;
    int v = root.value;;
    do
      {
       // if(current.value == v)
        {
          //parent = current;
          System.out.println("Node : Root" + current.value);
          System.out.println("Node : R-LEFT" + current.left.value);
          System.out.println("Node : R-RIGHT" + current.right.value);
          //right
          if(current.left!=null)
          current = current.left;
          else 
          current = current.parent;
          //break;
        } 
        // else if (current.value < v)
        // {
        //   System.out.println("Node : Left" + current.value);
        //   //right
        //   current = current.right;
        // } 
        // else
        // {
        //   System.out.println("Node : Right" + current.value);
        //   //left
        //   current = current.left;
        // }
      }
      while( current !=parent);//end while
//current != null ||
  }

  void delete(int c)
  {
    return ;
  }

}

class Node {
  int value ;
  Node left;
  Node right;
  Node parent;

  Node(int v)
  {
    this.value=v;
    left=null;
    right=null;
  }
   Node(int v, Node p)
  {
    this.value=v;
    left=null;
    right=null;
    parent = p;
  }

}