package jisoo.programmers.level0;

import java.util.*;

public class exam120834 {
	public static void main(String[] args) {
		String re = "cd";
		int age = 23;
		
		List<Character> list = new ArrayList<>();
		
		for(char a = 'a'; a <= 'j' ; a++) {
			list.add(a);
		}
		
		boolean run = true;
		String result = "a";
		while(run) {
			if((age % 10) < 10) {
				result += list.get((age % 10));
			} else {
				run = false;
			}
		}
		
		System.out.println(result);
		
		
		
	}
}
