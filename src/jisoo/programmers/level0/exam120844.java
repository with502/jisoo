package jisoo.programmers.level0;

public class exam120844 {
	public static void main(String[] args) {
		int[] numbers = {4, 455, 6, 4, -1, 45, 6};
//		int[] numbers = {1, 2, 3};
		String direction = "left";
//		String direction = "right";
		
		for(int a = 0; a < numbers.length; a++) {
			if(direction.equals("left")) {
				
			}
		}
		
		if(direction.equals("right")) {
			numbers[0] = numbers[numbers.length-1];
			for(int a = 1; a < numbers.length; a++) {
				if(a < numbers.length) {
					numbers[a] = numbers[a+1];					
				} else {
					break;
				}
			}
		} else {
			numbers[numbers.length -1] = numbers[0];
			for(int a = 1; a < numbers.length; a++) {
				numbers[a] = numbers[a-1];
			}
		}
		
		
	}
}
