
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


  class Lunch2
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

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
      }
      public static void main(String args[])
      {
          FastReader scn=new FastReader();
          StringTokenizer r,j;
          int t=scn.nextInt();
          int cost=0,i=0,temp=0;
          while(t>0)
          {
          String a=scn.nextLine();
          r=new StringTokenizer(a);
          String b=scn.nextLine();
          for(i=97;i<=122;i++)
          {
          temp=Integer.parseInt(r.nextToken());
            if(b.indexOf(i)==-1)
            {

              cost=cost+temp;
            }
          }
          System.out.println(cost);
          t--;
          cost=0;

          }
      }
      }
