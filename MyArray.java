public class MyArray{
char[] _array ;
int length;

  MyArray()
  {
    this._array= new char[10];
    this.length =0;
  }

  public static void main(String args[])
  {
    MyArray array= new MyArray();
    array.add('c');
    array.add('a');
    array.add('t');
    array.print();

  }

  int add(char c)
  {
    _array[length]=c;
    length++;

    return length;
  }

  void print()
  {
    for(int i=0;i<=length -1;i++)
    System.out.println(this._array[i]);
  }


}
