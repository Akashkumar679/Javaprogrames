package pattern.pack;

public class Spiral {

	public static void main(String[] args) {
		int n = 5;
		int x = n, y = n - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1) {
					System.out.print(j + " ");
				} else if (i == n) {
					System.out.print(x + " ");
					x--;
				} else {
					if (j == 1)
						System.out.print(i + " ");
					else if (j == n)
						System.out.print(y-- + " ");
					else
						System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
