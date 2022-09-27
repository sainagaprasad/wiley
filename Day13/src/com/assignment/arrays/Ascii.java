package com.assignment.arrays;

import java.util.*;

public class Ascii {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Map<String,Integer> m=new HashMap<String,Integer>();
		int c=0;
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			if((int)s.charAt(i)==(int)c)
				m.putIfAbsent(s.charAt(i)+"", (int)i);
			else
				c++;
		}
		c=s.length()-c;
		if(c==m.size()) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		sc.close();
	}
}
