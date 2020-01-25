package com.csi.oops;


import java.util.Iterator;
import java.util.TreeSet;

public class TreesetConcept {
	public static void main(String[] args) {
		TreeSet<String> a1=new TreeSet<>();
		a1.add("it");
		a1.add("comp");
		a1.add("civil");
		a1.add("production");
		a1.add("petrolium");
		a1.add("mechanical");
		a1.add("it");
		a1.add("automobile");
		
	Iterator<String> itr=a1.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	}

}
