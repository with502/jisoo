package jisoo.programmers.level1;

import java.util.*;

public class exam42576 {
	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		String result = "leo";
		
		Map<String, Integer> map = new HashMap<>();
		for(String a : participant) {
			map.computeIfAbsent(a, (v -> 0));
		}
		
		for(String a : completion) {
			map.computeIfPresent(a, ((k, v) -> v + 1));			
		}
		
		System.out.println(map.keySet());
		
	}
	
	String solution (String[] participant, String[] completion) {
		
		List<String> list = new ArrayList<>();
		for(String a : participant) {
			list.add(a);
		}
		
		for(String a : completion) {
			if(list.contains(a)) {
				list.remove(a);
			} 
		}
		return "";
	}
}
