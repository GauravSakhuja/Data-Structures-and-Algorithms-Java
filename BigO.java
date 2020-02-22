public class BigO{

public static void main(String args[]){

String [] names = {"abc","pqr","bbc"};

for (int i=0 ; i<names.length;i++)
{
 for (int j=0;j<names.length;j++)
 {
   System.out.println("Pair:" + names[i]+ " " + names[j]);
 }  
}
}
}//O (n^2)