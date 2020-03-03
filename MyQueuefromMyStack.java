public class MyQueuefromMyStack extends MyStack {
   

   public static void main(String[] var0) {
      MyQueuefromMyStack var1 = new MyQueuefromMyStack();
      var1.push("G");
      var1.push("A");
      var1.push("U");
      var1.push("R");
      var1.listall();
      System.out.println("--");
      var1.pop();
      var1.listall();
   }

  

  //  void push(String var1) {
  //     Item var2;
  //     if (this.top == null) {
  //        var2 = new Item(var1);
  //        this.top = var2;
  //        this.botton = var2;
  //     } else {
  //        var2 = new Item(var1);
  //        var2.prev = this.top;
  //        this.top = var2;
  //     }

  //  }

   void pop() {
      Item var1 = super.getBottom();
      super.setBottom(super.getBottom().next);
      super.getBottom().prev = null;
      var1 = null;
   }

   Item peek() {
      return null;
   }

   void listall() {
     Item n = super.getBottom();
      while(n.next!=null)         System.out.println("Queue FIFO >> " + n.value);
      n=n.next;
      }

   }