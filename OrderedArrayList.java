import java.util.*;

public class OrderedArrayList {

	public boolean add(ArrayList<Integer> a, int n) {
		int index = 0;

		while (n < a.get(index)) {
			index++;
		}

		System.out.println(index);
		return true;
	}

}
