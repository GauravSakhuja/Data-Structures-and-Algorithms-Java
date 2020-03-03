class Fibonacci{
  int[] fArr =new int[100];
  int i=0;

  public static void main(String[] args)
  {
    Fibonacci f = new Fibonacci();
    System.out.println(f.printFibonacci(50));

  }

  int printFibonacci(int n)
  {
      if(n<2)
    {
    return n;     }
    
    //System.out.println(i);
    return printFibonacci (n-1) + printFibonacci (n-2);

  }//O(2^n)

  int printFibonacciArray(int n)
  {
    if (i>10)
     return fArr[n];
    if(i<2)
    {
      fArr[0]=0;
      fArr[1]=1;
    }
    else
    {
      fArr[i]=fArr[i-1]+fArr[i-2];
    }
    System.out.println(fArr[i]+";" +i);
    return i+printFibonacci (i++);

  }//O(n)
}