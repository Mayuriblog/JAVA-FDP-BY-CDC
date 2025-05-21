//read N marks and print lowest and highest marks
import java.util.*;
class HighLow
{	public static void main(String [] args)
	{	int low=0,high=0;
		int marks[]; // array declaration
		int n;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter n : ");
		n=sc.nextInt();		
		marks = new int [n];		
		System.out.println("Enter "+n+" marks ");
		for(int i=0;i < n; i++)
		{	
			marks[i] = sc.nextInt();  // to read int
			if(i==0)
			{
				low=marks[0];
				high=marks[0];
			}
			else
			{
				if(marks[i]  < low)
				{
					low=marks[i] ;
				}
				if(marks[i]  > high)
				{
					high=marks[i] ;
				}
				
			}
			
		}
		
		System.out.println(" Lowest = "+low);
		System.out.println(" Highest = "+high);
		
			
	}
}