package activity1;
import static java.lang.System.*;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card carda = new Card("ace", "spades", 12);
		Card cardb = new Card("three", "diamonds", 2);
		Card cardc = new Card("two", "hearts", 11);
		
		out.println(carda.suit());
		out.println(carda.rank());
		out.println(carda.matches(cardb));
		out.println(carda);
		out.println("\n");
		
		out.println(cardb.suit());
		out.println(cardb.rank());
		out.println(cardb.matches(cardb));
		out.println(cardb);
		out.println("\n");
		
		out.println(cardc.suit());
		out.println(cardc.rank());
		out.println(cardc.matches(cardb));
		out.println(cardc);
		out.println("\n");
	}
}
