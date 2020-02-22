//iki sayıyı karşılaştır sayıları kullanıcının girmesini istedik.
public class Nemo {
  public static void main(String args[]){
      String[] arr = {"nemo"};

      Nemo finder = new Nemo();
      finder.findNemo(arr);

      // findNemo( arr);
  }
  boolean findNemo(String[] arr)
  {
    for (int i=0;i < arr.length; i++)
    {
      if (arr[i]=="nemo")
      System.out.println("Found");
      return true;
    }
    return false;
  }
}