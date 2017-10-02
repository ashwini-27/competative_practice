
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


  class Septcir
  {
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }


      }
      public static void main(String args[]) throws IOException
      {
          FastReader scn=new FastReader();
          int t=scn.nextInt();
          int i=0,temp;
          int abc[]=new int[100000];
          //int b[]=new int[100000];
          while(i<t)
          {
            temp=scn.nextInt();
            abc[temp-1]++;
            i++;
          }
          //now starts queries
          int jj=scn.nextInt();
          i=1;
          int count=0;
          while(i<jj)
          {
            temp=scn.nextInt();
            int temp1;
            temp1=temp;
            if(temp==1)
            {
            System.out.println(t);
            }
            else
            {
              while(temp<=100000)
              {
                  if(abc[temp-1]>0)
                  {
                    count+=abc[temp-1];
                  }
                //  System.out.println("inside the while loop and the value of the temp is:::"+temp);
                  temp=temp+temp1;
              }
              System.out.println(count);
              count=0;
              i++;
            }
          }
      }
      }
