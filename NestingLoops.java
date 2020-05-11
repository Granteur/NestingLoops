public class NestingLoops
{
	public static void main( String[] args )
	{
		// this is #1 - I'll call it "CN"
		for (int n = 1; n <= 3; n++){
			for (char c = 'A'; c <= 'E'; c++){
				System.out.println( c + " " + n );
			}
		}

		System.out.println("\n");

		// this is #2 - I'll call it "AB"
		for ( int a=1; a <= 3; a++ )
		{
			for ( int b=1; b <= 3; b++ )
			{
				System.out.print( a + "-" + b + " " );
			}
            // * You will add a line of code here.
            System.out.println();
		}

        System.out.println("\n");
        
        /*
        Answer 1 = n changes faster

        Answer 2 = for (int n = 1; n <= 3; n++){
			for (char c = 'A'; c <= 'E'; c++){
				System.out.println( c + " " + n );
			}
        }

        Answer 3 = It causes it each output to the terminal to be on its own line. It appears vertically instead of horizontally.

        Answer 4 = Each iteration of the inner loop appears on the same line, whereas each time the outer loop iterates, its on a new line.
        */

	}
}