
public class ezRays {

	public Object[] customRays = new Object[25];
	public int size = 0;

	// good
	public boolean isEmpty() {

		if (size > 0) {
			return false;
		}
		return true;

	}

	// add to end of list good
	public void add(Object o) {

		customRays[size] = o;
		size++;
		// double ray
		if (size == customRays.length) {
			Object[] newRay = new Object[customRays.length * 2];

			// copy old elements to new array
			for (int i = 0; i < customRays.length; i++) {
				newRay[i] = customRays[i];
			}
			customRays = newRay;

		}
	}

	// size good
	public int size() {
		return size;
	}

	// good
	public void remove(int index) {
		// exception
		if (Math.abs(index) > size) {
			throw new ArrayIndexOutOfBoundsException("Index " + index + " is out of bounds");
		}

		// negative numbers
		if (index < 0) {
			if (Math.abs(index + size) + 1 > size) { // neg out of bounds
				throw new ArrayIndexOutOfBoundsException("Index " + index + " is out of bounds");
			}
			index = index + size;
		}

		for (int i = index; i < size - 1; i++) {
			if (customRays[i] != null) {
				customRays[i] = customRays[i + 1];
			} else {
				break;
			}

		}
		customRays[size - 1] = null;
		size--;

	}

//	contains
	public boolean contains(Object obj) {

		// null pointer exception
		if (obj == null) {
			return false;
		}

		for (int i = 0; i < customRays.length; i++) {
			if (obj.equals(customRays[i])) {
				return true;
			}
		}
		return false;
	}

	// get index item
	public Object get(int index) {
		// negative index
		if (index < 0) {
			if (Math.abs(index + size) + 1 > size) { // neg out of bounds
				throw new ArrayIndexOutOfBoundsException("Index " + index + " is out of bounds");
			}
			return (customRays[size + index]);
		}

		// out of bounds
		if (index > size - 1) {
			throw new ArrayIndexOutOfBoundsException("Index " + index + " is out of bounds");
		}

		return customRays[index];

	}

	// main method
	public static void main(String[] args) {

		ezRays list = new ezRays();

		System.out.println(list.isEmpty()); // true

//		list.add(1); // 0
//		list.add(2); // 1
//		list.add(3); // 2
//		list.add("string"); // 3

		System.out.println(list.contains(null));

		// empty
		// add
		// contain
		// get
		// remove
		// size

	}

}
