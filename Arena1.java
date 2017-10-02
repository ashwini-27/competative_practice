
// Working program with FastReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


  class Arena1
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
    //StringTokenizer t;
      FastReader scn=new FastReader();
      int N= scn.nextInt();
      String S=scn.nextLine();
      int Q=scn.nextInt();
      int inda=0;
      int indb=0;
      int count=0;
      while(Q>0)
      {
        String temp=scn.nextLine();
      //  t=new StringTokenizer(temp);
        char a=temp.charAt(1);
        char b=temp.charAt(3);
        do{
          inda=S.indexOf(a,inda);
          if(inda!=-1)
          {
            do
            {
              indb=S.indexOf(b,indb);
              if(indb!=-1)
              {
                count++;
              }
            }
            while(indb!=-1);
          }
        }
        while(inda!=-1);

          Q--;
          System.out.println(count);
      }

    }
  }
