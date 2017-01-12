package Lesson1;


public class camera {
									/* This is where we would usually state our values */
	 								/* without a Value Class. . . aka "V.java" for us. */
	
	static void Stream(int PIN){
		boolean Connection = true;
		if (Connection == true && PIN < 5){					// the "&&" is a double statement meaning "X and Y".
			System.out.println("Connected\n");
			}
		else if (Connection == false) {
			System.out.println("Not Connected\n");
			}												// the "||" is like "&&" except that "||" means or, "X or Y" but "||" also means "X and Y".
		else if (PIN > 4 || PIN == 5) {						/* X < 5  is equal to X <= 4  */
			System.out.println("Not A Pin In My Sweep\n");}	/* but X < 5 uses less bytes. */
		else {
			System.out.println("I don't have a clue\n");}	// An "all ELSE fails" scenario.
	}

}

		/*		Though we end on an "else" statement, it is optional and* 
		 *		not in bad practice to end in an "else if".				*/

				// Still the "else" statement will catch any unpredicted outcomes whereas
				// ending with the "elseif" statement will lead to your program crashing
				// in the case of an unexpected/unpredicted input/output.
