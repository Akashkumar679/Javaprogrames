package arraysprogrames;

public class Testarray {

	public static void main(String[] args) {
		Arraylist list = new Arraylist();
		list.add(4);
		list.add(3);
		list.add(10);
		list.add(9);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
