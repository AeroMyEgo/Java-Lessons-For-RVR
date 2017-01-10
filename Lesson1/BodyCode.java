package Lesson1;


public class BodyCode {
		 public static void main(String RVR[]) {
			camera FrontCam;			// Channeling "camera.java" class into this class.
			camera TopCam;
			
			TopCam = new camera();		// Finalization of creating two different //
			FrontCam = new camera();	// objects for the "camera.java" class.   //
			
			TopCam.Stream(V.P1);		/**	KEY OF THE LESSON **/
			FrontCam.Stream(V.P2);		/**	COMBINED THE CAMERA AND VARIABLE CLASSES! "camera.java" and "v.java" respectively. **/

			
			
			/* 	This Function checks all pins of 1-5 in the "camera.java" class     */
			/*  and counts up 1 after every loop but before starting the next loop. */
			
			for (int i=1; i<6; i++){	// "int i=1;" Sets value of "i" to 1. "i<6;" the function loops while "i<6". "i++" each time a loop ends, the variable "i" gains +1.
				camera.Stream(i);
				while(i<0) {			// Never, "i=1", so i != 1; "!=" is a way of saying "does not equal".
					System.out.println("This Will Never Print");
					return;				// ALWAYS have "return" in a while loop; "return" will prevent your computer from being stuck in a endless cycle of loops.
				}
			}
			
		}
}
