package com.csi.oops;

import java.util.TreeMap;
import java.util.Map;

public class TreemapConcept {
	public static void main(String[] args) {
		TreeMap<String,String> hm=new TreeMap<>();
		hm.put("","121");
		hm.put("adress","pune");
		hm.put("clg","sms");
		//hm.put(null,"anything");	
		//hm.put(null,"everything");
		
		for(Map.Entry<String,String>m:hm.entrySet())
		{
		System.out.println(m.getKey()+":"+m.getValue());	
		}
	}

}
