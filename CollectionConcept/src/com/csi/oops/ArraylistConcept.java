package com.csi.oops;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistConcept {
public static void main(String[] args) {
	
	ArrayList<String> a1=new ArrayList<>();
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
