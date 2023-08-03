package arraysprogrames;

public class MergeSort {

	public static void merge(int a[],int b[],int c[]) {
		int i=0,j=0,k=0;
		while (i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				c[k++]=a[i++];
			}else {
				c[k++]=b[j++];
			}
		}
		while (i<a.length) {
			c[k]=a[i];
			k++;
			i++;
		}
		while (j<b.length) {
			c[k]=b[j];
			k++;
			j++;
		}
	}
	public static void sort(int a[]) {
		if(a.length==1)return;
		int r[]=new int[a.length/2];
		int l[]=new int[a.length-r.length];
		int i=0,j=0;
		while(i<r.length) {
			r[i]=a[i];
			i++;
		}
		while (j<l.length) {
			l[j]=a[i];
			i++;
			j++;
		}
		sort(l);
		sort(r);
		merge(l, r, a);
	}
	public static void main(String[] args) {
		int a[]= {4,5,1,2,3,6,7,9,8};
		sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
