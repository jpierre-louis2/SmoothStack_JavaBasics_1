//Author: Jameson Pierre-Louis
//This Program prints out different star pyramids
package com.ss.apr.jb.one;

public class First {

	//Prints upward star half-pyramid
	public static void firstPyramid(int rows) {
		
		System.out.print("1.)\n");
		for (int i = 1; i <= rows; ++i) {
			for(int j = 0; j < i; ++j) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println("----------");		
	}
	
	//Prints downward star half-pyramid
	public static void secondPyramid(int rows) {
		System.out.print("2.)\n");
		System.out.println("----------");
		for(int i = rows; i > 0; --i) {
			for(int j = i; j > 0; --j) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	//Prints full upward star pyramid
	public static void thirdPyramid(int rows) {
		System.out.print("3.)\n");
		int k = 0;
		for(int i = 1; i <= rows; ++i, k=0) {
			for(int j = 1; j <= rows - i; ++j) {
				System.out.print("  ");
			}
			while(k != 2 * i - 1) {
				System.out.print("* ");
				++k;
			}
			System.out.print("\n");
		}
		System.out.println("---------------");
	}
	
	//Prints full downward star pyramid
	public static void fourthPyramid(int rows) {
		System.out.print("4.)\n");
		System.out.println("---------------");
		for(int i = rows; i >= 1; --i) {
			
			for(int j = 1; j <= rows - i; ++j) {
				System.out.print("  ");
			}
			
			for(int j = i; j <= 2 * i -1; ++j) {
				System.out.print("* ");
			}
			
			for(int j = 0; j < i - 1; ++j) {
				System.out.print("* ");
			}
			
			System.out.print("\n");
		}
	}
	
	
	
	
	public static void main(String[] args) {
			
		int rows = 4;
		
		firstPyramid(rows);
		System.out.print("\n");
		secondPyramid(rows);
		System.out.print("\n");
		thirdPyramid(rows);
		System.out.print("\n");
		fourthPyramid(rows);
		
	}
}
