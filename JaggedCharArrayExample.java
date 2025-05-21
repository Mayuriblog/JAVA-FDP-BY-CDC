


public class JaggedCharArrayExample 
{
    public static void main(String[] args) 
	{    // Jagged array of characters (each sub-array represents a word)
        char[][] words = 
		{
            {'J', 'a', 'v', 'a'},
            {'i', 's'},
            {'f', 'u', 'n'},
            {'!', '!', '!'}
        };
        // Print each word
        for (int i = 0; i < words.length; i++)
		{
            System.out.print("Word " + (i + 1) + ": ");
            for (int j = 0; j < words[i].length; j++) 
			{
                System.out.print(words[i][j]);
            }
            System.out.println();
        }
    }
}