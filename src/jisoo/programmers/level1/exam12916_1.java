package jisoo.programmers.level1;

import java.util.*;

public class exam12916_1 {
	public static void main(String[] args) {
		String s = "pPoooyY";
		boolean result = true;
		
		String lowS = s.toLowerCase();
		String[] arr = lowS.split("");
		
		Map<String, Integer> map = new HashMap<>();		
		
		for(int a = 0; a < arr.length; a++) {
			map.computeIfAbsent(arr[a], (v -> 0));
			map.computeIfPresent(arr[a], (k, v) -> v + 1);
		}
		
		if(map.get("p") == map.get("y")) {
			result = true;
		} else {
			result = false;
		}
		
		System.out.println(result);
		System.out.println(map);
	}
}
