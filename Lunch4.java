
// Working program with FastReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


  class Lunch1
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
      StringTokenizer t;
      FastReader scn =new FastReader();
      int m;
      m=scn.nextInt();
      while(m>0)
      { int count=0,max1=0,max2=0,temp;
        String a=scn.nextLine();
        t=new StringTokenizer(a);
        while(t.hasMoreElements())
        {
          int temp1,temp2;
          temp1=Integer.parseInt(t.nextToken());
          if(temp1>max1)
          {
            temp2=max1;
            max1=temp1;
            max2=temp2;
          }
          else if(temp1>max2)
          {
            max2=temp1;
          }
          count++;
        }
      //  System.out.println("The value of temp is:"+temp);
        if(--count==max1)
        {
          System.out.println("this gives max2::::"+max2);
        //  System.out.println("count:"+count+"temp:"+temp);
        }
        else
        {
          System.out.println("this one gives max1 :::"+max1);

          //System.out.println("count:"+count+"temp:"+temp);


        }
        m--;
      }
    }
  }
