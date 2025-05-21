import java.util.*;
class Freq
{
	public static void main(String args[])
	{
		int i,n,m,f[];
		f = new int[21];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of students ");
		n=sc.nextInt();
		System.out.println("Enter "+n+ " students marks : ");
		for( i=0; i < n ; i++)
		{
			m=sc.nextInt();
			if(m>20)
			{
				System.out.println("Invalid mark ");
				i--;
				continue;
			}
			f[m]++;
		}
		
		System.out.println("Marks \t Freq ");
		for( i=0; i < 21 ; i++)
		{
			if(f[i] > 0)
				
				System.out.println(i+"\t"+f[i]);
		}
	}

}