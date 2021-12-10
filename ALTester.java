public class ALTester {

	private ArrayList _data = new ArrayList();

	public static void main(String[] args) {
		for (int i = 0; i < 23; i++)
			_data.add(i);

		for (int i = 0; i < _data.size(); i++)
			System.out.print(_data.get(i) + ",");
	}
}
