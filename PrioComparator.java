package f;

import java.util.Comparator;

public class PrioComparator implements Comparator<Prio> {

	@Override
	public int compare(Prio o1, Prio o2) {
		if(o1.p <= o2.p ) {
			return 1;
		}
		else if(o1.p > o2.p) {
			return -1;
		}
		return 0;
	}

}
