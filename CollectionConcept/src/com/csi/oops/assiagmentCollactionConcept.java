package com.csi.oops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class assiagmentCollactionConcept {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter branch nm=");
		String bnm=sc.next();
		ArrayList<String> a1=new ArrayList<>();
		a1.add("it");
		a1.add("comp");
		a1.add("civil");
		a1.add("production");
		a1.add("petrolium");
		a1.add("mechanical");
		a1.add("it");
		a1.add("automobile");
		if(a1.contains(bnm))
		{
			System.out.println("branch is available");
		}
		else
		{
			System.out.println("branch is not available");
		}
		
	/*Iterator<String> itr=a1.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}*/
	}

}
