package com.java.practis;


import java.io.*;
public class GFG {
static void Sum_of_Diagonals(int[][] matrix, int N)
	{
		int Pd = 0, Sd = 0;
		for(int i=0; i<N; i++)
		{
			Pd += matrix[i][i];		
			Sd += matrix[i][N-(i+1)];
		}
		System.out.println("Sum of Principal Diagonal:"+ Pd);
		System.out.println("Sum of Secondary Diagonal:"+ Sd);
	}
	static public void main(String[] args)
	{
		int[][] b = { { 8, 2, 13, 4 },
					{ 9, 16, 17, 8 },
					{ 1, 22, 3, 14 },
					{ 15, 6, 17, 8 } };
		Sum_of_Diagonals(b, 4);
	}
}
