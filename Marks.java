//read N marks and print tot and avg
import java.util.*;
class Marks
{	public static void main(String [] args)
	{	int tot=0;
		int marks[]; // array declaration
		int n;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter n : ");
		n=sc.nextInt();		
		marks = new int [n];		
		System.out.println("Enter "+n+" marks ");
		for(int i=0;i < n; i++)
		{	marks[i] = sc.nextInt();  // to read int
			tot += marks[i];
		}
		System.out.println("Total = "+tot);
		//System.out.println("Average = "+(tot/6.0));
		//System.out.printf("Average = %.2f",(float)(tot)/n );
		//System.out.printf("Average = %.2f",(float)tot/n );	
		System.out.printf("Average = %.2f",tot/ (float) n );	
	}
}