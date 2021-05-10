package com.test;

import java.util.HashMap;

public class HashMapValidations {
	
	public static void main(String args[]) {
		HashMap<String, String> map = new HashMap<String, String>();
		
		for(int i=1; i<=5; i++) {
			map.put("Key "+ i, "Value " + i );
		}
		
		//System.out.println("map before deleting: "+map);
		
		map.remove("Key 3");
		
		//System.out.println("map after deleting: "+map);
		
		if(map.containsKey("Key 3"))
			System.out.println("Key 3 is present in hasmap. Delete operation failed!!");
		else
			System.out.println("Key 3 is not present in hasmap. Deleted successfully!!");
		
	}

}
