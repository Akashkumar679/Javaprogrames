package com.Array.java;

public class Matrixmultiplication {
	static int[][] matrixMultiply(int[][] a, int[][] b) {
		int len = a.length;
		int[][] c = new int[len][len];

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				int sum = 0;
				for (int k = 0; k < len; k++) {
					sum += a[i][k] * b[k][j];
				}
				c[i][j] = sum;
			}
		}
		return c;
	}

	public static void main(String[] args) {
    int[][] a= { {1,2,3},
                 {4,2,1},
                 {2,3,1}
               };
    int[][]b= {{3,1,2},
    		   {2,3,2},
    		   {1,2,1}
              };
    int[][]c=matrixMultiply(a, b);
    for (int[] temp : c) {
		for (int n : temp) {
			System.out.print(n+"\t");
		}
		System.out.println();
	}
	}

}
