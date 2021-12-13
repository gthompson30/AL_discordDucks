import java.util.*;

public class ALTester {

	public static ArrayList _data = new ArrayList();

	public static void main(String[] args) {
		for (int i = 0; i < 23; i++)
			// adds numbers in descending order, but it should still be added in the correct place
			OrderedArrayList.add(_data, 23 - i);

		// should be sorted #'s 1-23
		printArrayList(_data);

		// should be true
		System.out.println(isSorted(_data));
		_data.add(50);
	}

	public static boolean isSorted(ArrayList<Integer> a) {
		for (int i = 0; i < a.size() - 1; i++) {
			if (a.get(i) > a.get(i + 1))
				return false;
		}
		return true;
	}
}
