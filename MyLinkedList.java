//Doubly Link list without any other data structure or index 

public class MyLinkedList 
{
  Node fNode =null;
  Node lNode =null;

  Node node=null;

  public static void main(String[] args)
  {
      MyLinkedList list = new MyLinkedList();
      list.append("g");
      list.append("a");
      list.append("u");
      list.append("r");
      list.append("a");
      list.append("v");
      // list.listAllNode();
      // list.prepend("S");
      // list.listAllNode();
      // list.insert(4,"X");
      //  list.listAllNode();
       list.listAllNode();
       System.out.println("||||||");
       list.appendTail("P");
       list.listBackward();
       System.out.println("||||||");
       list.insert(3,"8");
       list.listAllNode();

  }

  void append( String value)
  {
    if(fNode == null)
    {
      fNode = new Node(value);
      fNode.next = null;
      fNode.prev = null;
      lNode=fNode;
    }
    else {
      Node node = fNode;
      while (node != null)
      {
        if (node.next==null)
        {
          Node newNode = new Node(value);
          node.next = newNode;
          newNode.prev=node;
          lNode=newNode;
          return;
        }
        else
        {
          node = node.next;
        }
      }
    }
return;
  }//O(n)

  void appendTail( String value)
  {
   Node newTail = new Node(value);
   newTail.prev=lNode;
   lNode= newTail; 
return;
  }//O(1) **IMPROVED**

  void prepend(String value)
  {
    Node newFirst = new Node(value);
    newFirst.next = fNode;
    fNode.prev= newFirst;
    fNode = newFirst;
  } //O (1)

 //without tail access
   void insert(int i, String value)
  {
int position = 1;
    Node node = fNode;
      while (node != null)
      {
        // System.out.println("current node:" + node.value + "-|" + position);
          if(position == i)
          {

          Node newNode = new Node(value);
          newNode.next = node.next;
          node.next = newNode;

        return;

          }
          else 
          node=node.next;
          position++;
      }
      return;
  } //O (n)

  void listAllNode()
  {
    Node node = fNode;
      while (node != null)
      {
          System.out.println("node:" + node.value + "-|" );
          //System.out.println("last:" + 
          //lNode.value);
          node = node.next;

      }

  } //O(n)

  void listBackward()
  {
    Node node = lNode;
      while (node != null)
      {
          System.out.println("node:" + node.value + "-|" );
          node = node.prev;

      }

  } //O(n)

//to be implemented
  boolean remove(String key, String value)
  {
return true;
  } //O(n)


//to be implemented
  boolean find(String key, String value)
  {
return true;
  } //O(n)


}

 class Node
{
  int index;
String value;
Node next;
Node prev;

Node ( String value)
{
  this.value =  value;
  this.next = null;
  this.prev=null;
}

void setValue(String value)
{
  this.value = value
;
}


} 
