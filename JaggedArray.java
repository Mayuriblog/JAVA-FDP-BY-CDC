public class JaggedArrayExample 
{
    public static void main(String[] args)  
	{
        // Declare a 2D jagged array        
		int[][] jaggedArray = new int[3][];
        // Initialize each row with different lengths
        jaggedArray[0] = new int[2]; // Row 0 has 2 elements        
		jaggedArray[1] = new int[4]; // Row 1 has 4 elements
        jaggedArray[2] = new int[3]; // Row 2 has 3 elements
        // Assigning values        
		jaggedArray[0][0] = 1;
        jaggedArray[0][1] = 2;
        jaggedArray[1][0] = 3;        
		jaggedArray[1][1] = 4;
        jaggedArray[1][2] = 5;        
		jaggedArray[1][3] = 6;
        jaggedArray[2][0] = 7;
        jaggedArray[2][1] = 8;        
		jaggedArray[2][2] = 9;
        // Printing the jagged array        
		for (int i = 0; i < jaggedArray.length; i++) 
		{            
			for (int j = 0; j < jaggedArray[i].length; j++) 
			{                
				System.out.print(jaggedArray[i][j] + " ");
            }            
			System.out.println(); // Newline after each row
        }    
	}
}
