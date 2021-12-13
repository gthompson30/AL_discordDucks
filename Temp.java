import java.util.*;

public class OrderedArrayList {

	public static boolean add(ArrayList<Integer> a, int n) {
		if (a.size() == 0) {
			a.add(n);
			return true;
		}
		int index = 0;

		while (index < a.size()) {
			if (a.get(index) > n) {
				a.add(index, n);
				return true;
			}
			index++;
		}

		a.add(n);
		return true;
	}

	public static boolean remove(ArrayList<Integer> a, int n) {
		for (int i = 0; i < a.size(); i++) {
			if (n == a.get(i)) {
				a.remove(i);
				return true;
			}
		}
		return false;
	}

	public static boolean set(ArrayList<Integer> a, int index, int val) {
		if (index == 0) {
			if (a.size() > 1) {
				if (a.get(1) >= val) {
					a.set(0, val);
					return true;
				} else { return false; }
			} else {
				a.set(1, val);
				return true;
			}
		}
		if (index == a.size() - 1) {
			if (val >= a.get(index - 1)) {
				a.set(index, val);
				return true;
			} else { return false; }
		}
		if (a.get(index - 1) <= val && val <= a.get(index + 1)) {
			a.set(index, val);
			return true;
		}
		return false;
	}

	public static int size(ArrayList<Integer> a) {
		return a.size();
	}

}
