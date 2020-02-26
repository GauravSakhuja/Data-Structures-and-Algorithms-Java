public class MyStack {
   Item top = null;//top
   Item botton = null;//bottom

   public static void main(String[] var0) {
      MyStack var1 = new MyStack();
      var1.push("G");
      var1.push("A");
      var1.push("U");
      var1.push("R");
      var1.listall();
      System.out.println("--");
      var1.pop();
      var1.listall();
   }

   void push(String var1) {
      Item var2;
      if (this.top == null) {
         var2 = new Item(var1);
         this.top = var2;
         this.botton = var2;
      } else {
         var2 = new Item(var1);
         var2.prev = this.top;
         this.top = var2;
      }

   }

   void pop() {
      Item var1 = this.top;
      this.top = this.top.prev;
      this.top.next = null;
      var1 = null;
   }

   Item peek() {
      return null;
   }

   void listall() {
      for(Item var1 = this.top; var1 != null; var1 = var1.prev) {
         System.out.println("Stack LIFO >> " + var1.value);
      }

   }
}
    