//find first occurance of any duplicate in array

import java.util.*;

class findFirstDupHashTable

{


public static void main(String[] args)
{
  int[] arr= {2,5,5,2,9,6,5,4};
  findFirstDupHashTable obj= new findFirstDupHashTable();
  System.out.println(obj.findFirstDup(arr));
}



int findFirstDup(int[] arr)
{
  Hashtable<Integer,Integer> h = new Hashtable <Integer,Integer>();
  for (int i=0; i<arr.length-1;i++)
  {
    if(!h.containsKey(arr[i]))
      h.put(arr[i],0) ;
    else 
    return (int)arr[i];
  }
  return 10000;
}//O(n)

} 
