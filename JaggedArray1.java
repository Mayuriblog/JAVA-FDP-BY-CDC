public class JaggedArraySumExample 
{    
	public static void main(String[] args) 
		{        
		// Inline initialization of a jagged array
        int[][] jaggedArray = {            
			{10, 20},
            {30, 40, 50},            
			{60},
            {70, 80, 90, 100}        
		};
        // Print the jagged array and calculate row sums
        for (int i = 0; i < jaggedArray.length; i++)   
		{
            int sum = 0;            System.out.print("Row " + i + ": ");
            for (int j = 0; j < jaggedArray[i].length; j++)    
			{
                System.out.print(jaggedArray[i][j] + " ");                
				sum += jaggedArray[i][j];
            }            
			System.out.println(" | Sum = " + sum);
        }    
	}
}