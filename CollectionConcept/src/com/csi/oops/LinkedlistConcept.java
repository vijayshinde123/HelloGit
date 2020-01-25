package com.csi.oops;


import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistConcept {
	public static void main(String[] args) {
		
	
	LinkedList<String> a1=new LinkedList<>();
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


