import java.io.*;
import java.util.*;
class Ans1
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		int N,H,i=0,t;
		N=scn.nextInt();
		System.out.println("number of persons::"+N);
		H=scn.nextInt();
		System.out.println("Hieght::"+H);
		int length=N;
		while(i<N)
		{
			ystem.out.println("inside the while loop");
			t=scn.nextInt();
			t=t/H;
			if(t>1)
			{
				System.out.println("inside the if loop");
				length++;
				System.out.println(length);
			}
			i++;
		}
		System.out.println("the answer is "+length);
	}
}