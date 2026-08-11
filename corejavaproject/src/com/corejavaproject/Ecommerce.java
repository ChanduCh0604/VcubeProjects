package com.corejavaproject;
import java.util.*;

public class Ecommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] temp = new int[n];
		for(int i= 0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int i= 0;i<n;i++) {
			temp[i] = a[i];
			
			for(int j = i + 1;j<n;j++) {
				
			if(a[j] <= a[i]) {
				temp[i] =a[i] - a[j];
				break;
			}
			}
		}
		for(int i = 0;i<n;i++) {
			System.out.print(" "+temp[i]);
		}
//		System.out.println(Arrays.toString(temp));


	}

}

// prices = [8 4 6 2 3]
//otuput = [4 2 4 2 3]