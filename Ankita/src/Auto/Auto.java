package Auto;

public class Auto
{
	public static void main(String args[])	
	{
		int no=20;
		
		for(int i=1;i<=no;i=i+2)
		{
			for(int k=no;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("*");
		}
		
		for(int i=13;i>=1;i=i-2)
		{
			for(int k=no;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("*");
		}
		
		
		
		
	}
		
}

