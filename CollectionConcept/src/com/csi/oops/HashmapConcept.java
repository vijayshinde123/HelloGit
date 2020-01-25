package com.csi.oops;

import java.util.HashMap;
import java.util.Map;

public class HashmapConcept {
	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<>();
		hm.put("id","121");
		hm.put("adress","pune");
		hm.put("clg","sms");
		hm.put(null,"anything");	
		hm.put(null,"everything");
		
		for(Map.Entry<String,String>m:hm.entrySet())
		{
		System.out.println(m.getKey()+":"+m.getValue());	
		}
			
		
		
	}

}
