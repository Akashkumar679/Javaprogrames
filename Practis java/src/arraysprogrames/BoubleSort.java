package arraysprogrames;

public class BoubleSort {

	public static void sort(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				int temp = 0;
				if (a[j] > a[j + 1]) {
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int a[] = { 6, 4, 5, 1, 3, 7, 8 };
		sort(a);
		for (int n : a) {
			System.out.print(n+" ");
		}
	}
}
