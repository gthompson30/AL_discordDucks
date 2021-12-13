# LAB02 by Team discordDucks

## DA TEAM (in order of lsat nombre)
 - [Gabriel Thompson](https://www.github.com/gthompson30)
 - [Kartik Vanjani](https://www.github.com/NYG-Kartik)
 - [Marcus Wu](https://www.github.com/mwoi)

## ALTester
### `main` (test cases)
Creates a new instance of the `OrderedArrayList` class, and adds #'s 0-22 in ascending order, using `addLinear`.
It then prints them out, and they should be in ascending order.

The program then creates a new instance of the cals for, and adds the same numbers in **descending** order, using `addBinary`. It then prints them out, and they too should be in ascending order.

### `isSorted()`
Goes through every item of the array (except for the last), and compares it to the number following it. If the number following it is smaller than the current number, the function returns `false`. If it goes through all the items and doesn't find this, it returns `true`.

## OrderedArrayList

### `OrderedArrayList()`
Default constructor – initializes `_data` as an empty `ArrayList`.

### `toString()`
Returns a String representation of `_data`, which includes every item separated by a comma and a space, with the output surrounded by squirrely brackets.

### `remove(int)`
Removes the item at the index specified in the arguments.

### `size()`
Returns an int representation of the size of the `ArrayList`.

### `get(int)`
Returns the value at the index specified in the arguments

### `addLinear(int)`
Goes through every item of the array until it finds a value larger than the argument. Then, it inserts it into that position.

### `addBinary(int)`
Like `addLinear()`, finds the first index where the argument could be inserted. However, it does this by dividing the scope of the array down by dividing it in half. It keeps track of the scope with the variables `lower` and `upper`. It was very tedious to fix all the off-by-one errors.
