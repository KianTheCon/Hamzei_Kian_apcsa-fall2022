package activity4;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "jack", "queen", "king"};
		String[] suits = {"blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red", "green"};
		int[] pointValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13};
		Deck d = new Deck(ranks, suits, pointValues);
//		d.shuffle();
		System.out.println(d);
		d.shuffle();
		System.out.println(d.isEmpty());
		System.out.println(d.size());
		System.out.println(d);
		System.out.println("\n");
		
		
		String[] ranks2 = {"blue", "green", "red"};
		String[] suits2 = {"square", "circle"};
		int[] pointValues2 = {7, 8, 9};
		Deck d2 = new Deck(ranks2, suits2, pointValues2);
		d2.deal();
		System.out.println(d2);
		d2.shuffle();
		System.out.println(d2.isEmpty());
		System.out.println(d2.size());
		System.out.println(d2);
		System.out.println("\n");
		
		
		
		String[] ranks3 = {"ace", "two", "three"};
		String[] suits3 = {"spades", "hearts"};
		int[] pointValues3 = {6, 4, 3};
		Deck d3 = new Deck(ranks3, suits3, pointValues3);
		d3.deal();
		d3.deal();
		System.out.println(d3);
		d3.shuffle();
		System.out.println(d3.isEmpty());
		System.out.println(d3.size());
		System.out.println(d3);
		System.out.println("\n");
		
//		Deck test1 = new Deck()
	}
}
