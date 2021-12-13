import java.util.*;

public class ALTester {

	public static void main(String[] args) {
		OrderedArrayList a = new OrderedArrayList();
		for (int i = 0; i < 23; i++)
			// adds numbers in descending order, but it should still be added in the correct place
			a.addLinear(i);

		// should be sorted #'s 1-23
		System.out.println(a);

                OrderedArrayList b = new OrderedArrayList();
                for (int i = 0; i < 23; i++)
                        // adds numbers in descending order, but it should still be added in the correct place
                        b.addBinary(22 - i);

                // should be sorted #'s 1-23
                System.out.println(b);
	}

	public static boolean isSorted(ArrayList<Integer> a) {
		for (int i = 0; i < a.size() - 1; i++) {
			if (a.get(i) > a.get(i + 1))
				return false;
		}
		return true;
	}
}
