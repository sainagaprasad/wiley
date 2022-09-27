package com.assignment.recursion;
import java.util.*;

public class LastAlive {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a=lastalive(n,k);
		System.out.println(a);
	}

	private static int lastalive(int n, int k) {
		if(n==1) {
			return 1;
		}
		return (lastalive(n-1,k)+k-1)%n+1;
	}
}
