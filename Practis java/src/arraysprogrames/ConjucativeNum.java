package arraysprogrames;

public class ConjucativeNum {

	public static void main(String[] args) {
		int n[]= {7,9,6,1,2,3,4,5,30,40,90};
  		for (int i = 1; i < n.length; i++) {
			for (int j = i+1; j < n.length; j++) {
				if (n[j]-n[i]==1) {
					System.out.print(n[i]+" ");
				if (n[j+1]-n[j]!=1)
					System.out.println(n[j]+" ");
				}
				else break;
			}
		}
	}

}
