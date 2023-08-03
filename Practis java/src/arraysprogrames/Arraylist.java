package arraysprogrames;

public class Arraylist {
	private Object[] a = new Object[5];
	private int count = 0;

	public void add(Object e) {
		if (count > a.length)
			incerseCapacity();
		a[count] = e;
		count++;
	}

	private void incerseCapacity() {
		Object temp[] = new Object[a.length + 3];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = a[i];
		}
		a=temp;
	}
	public Object get(int index) {
		if(index<0 && index>=size())
			throw new IndexOutOfBoundsException();
		return a[index];
	}

	public int size() {
		return count;
	}
}
