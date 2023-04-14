package jisoo.programmers.level0;

import java.util.*;

public class exam120890 {
	public static void main(String[] args) {
		int[] array = {10, 11, 12};
		int n = 13;
		List<Integer> list = new ArrayList<>();
		int result = 0;
		
		for(int a : list) {
			list.add(a);
		}
		
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		
		for(int a = 0; a < list.size(); a++) {
			if(list.get(a) > 0) {
				if(max > (n - list.get(a))) {
					result = list.get(a);
				}
			} else if (list.get(a) < 0) {
				if(min < (n - list.get(a))) {
					result = list.get(a);
				}
			} else {
				result = list.get(a);
			}
		}
		
		System.out.println(result);
	}
}
