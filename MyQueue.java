public class MyQueue {
   Item last = null;//top
   Item first = null;//bottom

   public static void main(String[] var0) {
      MyQueue var1 = new MyQueue();
      var1.enqueue("G");
      var1.enqueue("A");
      var1.enqueue("U");
      var1.enqueue("R");
      var1.listall();
      System.out.println("--");
      var1.dequeue();
      var1.listall();
   }
  //adds last element
   void enqueue(String var1) {
      Item var2;
      if (this.first == null) {
         var2 = new Item(var1);
         this.first = var2;
         this.last = var2;
      } else {
         var2 = new Item(var1);
         last.next= var2;
         var2.prev = this.last;
         this.last = var2;
      }

   }//O(1)
  //removes first element
   void dequeue() {
      Item var1 = this.first;
      this.first = this.first.next;
      first.prev= null;
      var1 = null;
   }//O(1)

  //returns last element
   Item peek() {
      return null;
   }

//list all elements 
   void listall() {
     Item current = first; 
      while(current.next != null) {
         System.out.println("Stack FIFO >> " + current.value);
         current=current.next; 
      }

   }//O(n)
}
    