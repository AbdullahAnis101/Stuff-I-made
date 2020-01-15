import java.util.LinkedList;
import java.util.Random;
/**
 * Simulates a series of flips and retrieves how many flips were heads and how many flips were tails.
 * @author Abdullah
 *
 */
public class CoinFlip {
	/**
	 * Determines the side of the coin. If true the side is head and if false the side is tail.
	 */
	private boolean coinSide;
	/**
	 * A linked list of head Occurences.
	 */
	private LinkedList<Boolean> head = new LinkedList<Boolean>();
	/**
	 * A linked list of tail Occurences.
	 */
	private LinkedList<Boolean> tail = new LinkedList<Boolean>();
	
public CoinFlip() {	

}
/**
 *  Flips the coin to see if its head or tails and then adds it the coin side list.
 */
public void flip() {
	Random r = new Random();

	coinSide = 	r.nextBoolean();

	if (coinSide == false) {
		tail.add(coinSide);
	}else {
		head.add(coinSide);
	}
}

	/**
	 *
	 * @return the occurences of head or tail.
	 */
	public String toString() {
	String occur = "Head  occurences "  + head.size() + " " + "Tail occurences " + tail.size() + " ";

	return occur;
}
public static void main(String[] args) {
	CoinFlip c = new CoinFlip();
	c.flip();
	c.flip();
	c.flip();
	c.flip();
	System.out.println(c.toString());
}
}
	