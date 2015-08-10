package implementation;
/**
 * @author yhjhoo
 * @since 1.0
 * date : 10 Aug, 2015
 *
 */

public class Checkout {
	int runningTotal = 0;

	public void add(int itemCount, int price) {
		runningTotal += (itemCount * price);
	}

	public int total() {
		return runningTotal;
	}

}
