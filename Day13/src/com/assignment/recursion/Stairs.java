package com.assignment.recursion;

import java.util.Scanner;

public class Stairs {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int w=sc.nextInt();
		w=countWays(w);
		System.out.println(w);
		sc.close();
	}

	private static int countWays(int n) {
		int[] res=new int[n+1];
		res[0]=1;
		res[1]=1;
		for(int i=2;i<=n;i++) {
			res[i]=res[i-1]+res[i-2];
		}
		return res[n];
	}
}
