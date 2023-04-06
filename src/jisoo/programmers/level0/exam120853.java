package jisoo.programmers.level0;

import java.util.*;

public class exam120853 {
	public static void main(String[] args) {
		String s = "1 2 Z 3";
		int result = 4;
		
		String[] arr1 = s.split(" ");
		int sum1 = 0;
		int sum2 = 0;
		for(int a = 0; a < arr1.length; a++) {
			if(arr1[a].equals("Z")) {
				try {
					int x = Integer.parseInt(arr1[a-1]);
					sum2 += x;
				} catch (Exception e) {}
			} 
			else {
				try {
					int y = Integer.parseInt(arr1[a]);
					sum1 += y;
				} catch (Exception e) {}				
			}
		}
		
		result = sum1 - sum2;
		System.out.println(result);
	}
}
