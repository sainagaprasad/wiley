package com.assignment.recursion;

public class MagicNumber {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 4, 3, 2, 34, 5, 6, 9, 9 };
		int m = magicnumber(0, arr);
		System.out.println(m);
	}

	private static int magicnumber(int i, int[] arr) {
		int m = -1;
		if (i >= arr.length)
			return m;
		if (arr[i] == i) {
			m = i;
			return m;
		} else {
			m = magicnumber(i + 1, arr);
		}
		return m;
	}
}
