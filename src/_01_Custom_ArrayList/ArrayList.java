package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList<T> {
	Object[] _items = null;

	public ArrayList() {
		_items = new Object[0];
	}

	public T get(int loc) throws IndexOutOfBoundsException {
		if (loc < 0 || loc > size() - 1) {
			throw new IndexOutOfBoundsException();
		}
		return (T) _items[loc];
	}

	public void add(T val) {
		Object[] newArray = new Object[size() + 1];
		for (int i = 0; i < size(); i++) {
			
			newArray[i] = get(i);
		}
		newArray[newArray.length - 1] = val;
		_items = newArray;

	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		if (loc < 0 || loc > size()) {
			throw new IndexOutOfBoundsException();
		}
		Object[] newArray = new Object[size() + 1];
		for (int i = 0; i < newArray.length; i++) {
			if (i < loc) {
				newArray[i] = get(i);
			} else if (i > loc) {
				newArray[i] = get(i - 1);
			} else {
				newArray[i] = val;
			}
			
		}
		_items = newArray;
	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		if (loc < 0 || loc > size() - 1) {
			throw new IndexOutOfBoundsException();
		}
		_items[loc] = val;
	}

	public void remove(int loc) throws IndexOutOfBoundsException {
		if (loc < 0 || loc > size() - 1) {
			throw new IndexOutOfBoundsException();
		}
		Object[] newArray = new Object[size() - 1];
		for (int i = 0; i < newArray.length; i++) {
			if (i < loc) {
				newArray[i] = get(i);
			} else {
				newArray[i] = get(i + 1);
			}
		}
		_items = newArray;
	}

	public boolean contains(T val) {
		for (int i = 0; i < _items.length; i++) {
			if (get(i).equals(val)) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		return _items.length;
	}
}