import java.io.*;
import java.util.*;
class main
{
  public static void main(String args[])
  {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int max1=0,max2=0,max3=0;
    int a[]=new int[n];
    int j;
    for(int i=0;i<n;i++)
    {
      a[i]=scn.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      if(max1<a[i])
      {
        max3=max2;
        max2=max1;
        max1=a[i];
      }
    }
  }

}
