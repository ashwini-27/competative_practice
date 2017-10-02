
// Working program with FastReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main
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
        public static void main(String args[] ) throws IOException
        {
          FastReader scn = new FastReader();
          int t,p=-1;
          t=scn.nextInt();
          while(t>0)
          {
            String a=scn.nextLine();
            System.out.println("the input string is::"+a);
            for(int i=97;i<=122;i++)
            { p=a.indexOf(i);
              int q=a.lastIndexOf(i);
              if(p!=q&&p!=-1&&q!=-1)
              {
                System.out.println("yes");
                break;
              }
              p=-1;
            }
            if(p==-1)
            {
              System.out.println("no");
            }
            t--;
          }
        }

    }
