class Factorial{
  int fValue=0;
  public static void main(String[] args)
  {
    Factorial f = new Factorial();
    System.out.println(f.findFactorial(5));

  }

  int findFactorial(int n)
  {
    if (n==1)
    return 1;

    return n*findFactorial (n-1);

  }//O(n)
}