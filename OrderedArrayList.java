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

	public static int size(ArrayList<Integer> a) {
		return a.size();
	}

}
