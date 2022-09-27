package com.presentation.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAddRemove {
	private static int[] addElement(int[] arr, int ae) {
		int[] appendedarray = new int[arr.length + 1];
		for(int i=0;i<arr.length;i++) {
			appendedarray[i]=arr[i];
		}
		appendedarray[arr.length] = ae;
		return appendedarray;
	}
	private static int[] insertX(int arr[], int x, int pos) {
		int i=0;
		int[] tmp = new int[arr.length+1];
		while(i<arr.length) {
			if(i==pos)
				break;
			tmp[i]=arr[i++];
		}
		
		for(int j=i+1;j<tmp.length;j++) {
			tmp[j]=arr[j-1];
		}
		tmp[i]=x;
		return tmp;
	}
	private static int[] removeTheElement(int[] arr, int index) {
		if (arr == null || index < 0 || index >= arr.length) {

			return arr;
		}
		int[] anotherArray = new int[arr.length - 1];
		for (int i = 0, k = 0; i < arr.length; i++) {
			if (i == index) {
				continue;
			}
			anotherArray[k++] = arr[i];
		}
		return anotherArray;
	}
	private static int[] deleteElement(int[] arr, int d) {
		int darr[]=null;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==d) {
				darr=removeTheElement(arr, i);
				break;
			}
		}
		return darr;
	}
	public static void main(String[] args) {
		
		/*
		 * Space complexity : n
		 * Time complexity : n
		 * Big o
		 */
		System.out.println("*************************************************");
		Scanner sc = new Scanner(System.in);
		// Adding elements
		System.out.println("enter the number of elements to be appended");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Original Array: " + Arrays.toString(arr));
		System.out.println(arr.length);
		System.out.println("*************************************************");
				
		// Adding more elements
		System.out.println("enter 1 if you want to add more elements");
		int a = sc.nextInt();
		if (a == 1) {
			System.out.println("enter the element to be appended");
			int ae = sc.nextInt();
			arr = addElement(arr, ae);
		}
		System.out.println("New array: " + Arrays.toString(arr));
		System.out.println(arr.length);
		System.out.println("*************************************************");
		
		//add element at desired position
		System.out.println("enter the element and position to be appended");
        int x = sc.nextInt();
        int pos = sc.nextInt();
        arr = insertX(arr, x, pos);
        System.out.println("New array: " + Arrays.toString(arr));
		System.out.println(arr.length);
		System.out.println("*************************************************");
		
        //remove at index
		System.out.println("enter the index of element to be removed");
		int index = sc.nextInt();
		System.out.println("Index to be removed: " + index);
		arr = removeTheElement(arr, index);
		System.out.println("Index deleted Array: " + Arrays.toString(arr));
		System.out.println(arr.length);
		System.out.println("*************************************************");
		
		//delete first occuring element
		System.out.println("enter the value to be deleted");
		int d=sc.nextInt();
		arr=deleteElement(arr,d);
		System.out.println("Value deleted Array: " + Arrays.toString(arr));
		System.out.println(arr.length);
		System.out.println("*************************************************");
		sc.close();
	}
}
