package com.test;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;


public class EncodeJson {

	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		JSONObject output = new JSONObject();
		
		output.put("name","xyz");
		output.put("fname","xyzxyz");
		output.put("dob","date");
		
		JSONObject address = new JSONObject();
		address.put("line1", "abcdefg1");
		address.put("line2", "abcdefg2");
		address.put("line3", "abcdefg3");
		
		output.put("address", address);
		output.put("pin", "123456");
		
		String jsonText = JSONValue.toJSONString(output);
		System.out.print(jsonText);    
	}
}

