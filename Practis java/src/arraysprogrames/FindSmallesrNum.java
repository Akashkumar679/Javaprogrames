package arraysprogrames;

import java.util.Arrays;

public class FindSmallesrNum {
	public static int smallest(int a[],int total) {
		Arrays.sort(a);
		return a[0];
	}
	public static void main(String[] args) {
		int x[]= {1,2,3,4,5,6,7,8,9};
		System.out.println(smallest(x, x.length));
	}

}
