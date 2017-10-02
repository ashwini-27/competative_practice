
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


  class Lunch3
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
        FastReader scn=new FastReader();
      //  int i=0;
        int n=scn.nextInt();
        while(n>0)
        {
          String a=scn.nextLine();
          t=new StringTokenizer(a);

            int N=Integer.parseInt(t.nextToken());
            int V1=Integer.parseInt(t.nextToken());
            int V2=Integer.parseInt(t.nextToken());
          //  double N1=N;
            double Elevator=V2/(Math.sqrt(2));
            System.out.println("Elevator Speed into root 2:::"+Elevator);
            System.out.println("stair speed is :::"+V1);
          //  double Stairs= N1/V1;
            if(Elevator>V1)
            {
            System.out.println("Elevator");
            }
            else{
            System.out.println("Stairs");
            }

            n--;

        }
      }
      }
