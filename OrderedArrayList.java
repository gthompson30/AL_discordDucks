// Clyde "Thluffy" Sinclair
// APCS pd00
// Lab02
// 2021-12-13

/**********************************************
 * class OrderedArrayList
 * wrapper class for ArrayList
 * maintains invariant that elements are ordered (ascending)
 * (SKELETON)
 **********************************************/


import java.util.ArrayList;

public class OrderedArrayList
{

  // instance of class ArrayList, holding objects of type Integer
  // (i.e., objects of a class that implements interface Integer)
  private ArrayList<Integer> _data;

  // default constructor
  // initializes instance variables
  public OrderedArrayList(ArrayList<Integer> a)
  {
     _data = a;
  }

  public String toString()
  {
	String out = "{";
	for (int i = 0; i < _data.size() - 1; i++) {
		out += _data.get(i) + ", ";
	}
	return out + _data.get(_data.size() - 1) + "}";
  }

  public Integer remove( int n )
  {
	int temp = _data.get(n);
	_data.remove(n);
	return temp;
  }

  public int size()
  {
	return _data.size();
  }

  public Integer get( int i )
  {
	return _data.get(i);
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a linear search to find appropriate index
  public void addLinear(Integer newVal)
  {
		if (_data.size() == 0) {
			_data.add(newVal);
			return;
		}
		int index = 0;

		while (index < _data.size()) {
			if (_data.get(index) > newVal) {
				_data.add(index, newVal);
				return;
			}
			index++;
			System.out.println(index);
		}

		_data.add(newVal);
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a binary search to find appropriate index
  public void addBinary(Integer newVal)
  {
	int lower = 0;
	int upper = size() - 1;
	int mid;

	int index = -1;

	while (upper - lower > 0) {
		mid = (upper + lower) / 2;
		if (_data.get(mid) > newVal) {
			upper = mid;
		} else if (_data.get(mid) < newVal) {
			lower = mid;
		} else {
			index = upper;
		}
	}

	_data.add(index, newVal);
  }

  // main method solely for testing purposes
  public static void main( String[] args )
  {
    OrderedArrayList Franz = new OrderedArrayList();

    // testing linear search
    System.out.println("starting linear");
    for( int i = 0; i < 15; i++ )
      Franz.addLinear( (int)( 50 * Math.random() ) );
    System.out.println( Franz );

    // testing binary search
    Franz = new OrderedArrayList();
    for( int i = 0; i < 15; i++ ) 
      Franz.addBinary( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
/*-----v-------move-me-down-----------------v--------
      =====^====================================^=========*/

  }//end main()

}//end class OrderedArrayList
