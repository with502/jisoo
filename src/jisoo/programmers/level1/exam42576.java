package jisoo.programmers.level1;

import java.util.*;
<<<<<<< HEAD
import java.util.function.IntFunction;
=======
>>>>>>> 9446a9028f2fad8b2737b91041a04da6337167a1

public class exam42576 {
	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
<<<<<<< HEAD
		
		Set<String> set = new HashSet<>();
		
		
	}
=======
		String result = "leo";
		
		
		for(int a = 0; )
		
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
>>>>>>> 9446a9028f2fad8b2737b91041a04da6337167a1
}
