package com.test;

import java.util.HashMap;
import java.util.Set;

public class CharOccurance {
	
	public static void main(String args[]) {
		String input = "yournameee";
		char[] inputArr = input.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i<inputArr.length; i++) {
			if(map.containsKey(inputArr[i]))
				map.put(inputArr[i], map.get(inputArr[i])+1);
			else
				map.put(inputArr[i], 1);
		}
		
		Set<Character> keySet = map.keySet();
		
		int maxOccurance = 1;
		for(char key: keySet) {
			if(maxOccurance < map.get(key))
				maxOccurance = map.get(key);
		}
		
		if(maxOccurance == 1)
			System.out.println("All characters in the string appears only one time");
		else {
			for(char key:keySet) {
				if(map.get(key) == maxOccurance)
					System.out.println("char "+key+" max occurance "+maxOccurance+" times");
			}	
		}
		
	}

}
