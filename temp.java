//import java.util.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

class temp{
public static void main(String args[]) throws IOException
{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  StringTokenizer st;
  int a;
  String asource=br.readLine();
  st=new StringTokenizer(asource);
  a=Integer.parseInt(st.nextToken());
  while(a>0)
  {   asource=br.readLine();
      st=new StringTokenizer(asource);
      int N=Integer.parseInt(st.nextToken());
      String test="";
      while(N>0)
      { int easy=-1,medium=-1,hard=-1,easy-medium=-1,cakewalk
        test=br.readLine();
        N--;
      }
      int l=test.indexOf("easy");
      if(test.indexOf("cakewalk")==-1||test.indexOf("simple")==-1||l==-1)
      {
        System.out.println("No");
      }
      else{
        int inm=test.indexOf("easy-medium");
        int linm=test.indexOf("medium");
        int ll=test.lastIndexOf("medium-hard");
        int indh=test.indexOf("hard");
        if(inm!=-1||linm!=-1)
        {
          if(ll!=-1||indh!=-1)
          {
            System.out.println("Yes");
          }
          else
          {
            System.out.println("No");
          }
        }
        else
        {
          System.out.println("No");
        }

      }

    a--;
  }
}
}
