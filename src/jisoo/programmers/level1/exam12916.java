package jisoo.programmers.level1;

import java.util.*;

public class exam12916 {
	public static void main(String[] args) {
		String s = "pPoooyY";
		boolean result = true;
		
		String lowS = s.toLowerCase();
		String[] arr = lowS.split("");
		
		Map<String, Integer> map = new HashMap<>();
		
		for(int a = 0; a < arr.length; a++) {
			if(!map.containsKey(arr[a])) {
				map.put(arr[a], 1);
			} else {
				map.replace(arr[a], map.get(arr[a]) + 1);
			}
		}
		
		if(map.get("p") == map.get("y")) {
			result = true;
		} else {
			result = false;
		}
		System.out.println(result);
		
	}
}
