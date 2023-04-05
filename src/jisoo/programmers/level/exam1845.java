package jisoo.programmers.level;

import java.util.*;

public class exam1845 {
    public int solution(int[] nums) {
        int result = 0;
        
        Set<Integer> type = new HashSet<>();
		for(int a : nums) {
			type.add(a);
		}
		
		int[] take = new int[nums.length / 2];
		
        return result = (take.length <= type.size()) ? take.length : type.size();
    }
}
