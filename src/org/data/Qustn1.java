package org.data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Qustn1 {
	public static void main(String[] args) {
		int a[]=  {1,2,3,4,5,6,7,8,9,10,6} ;
		//4.1
		System.out.println(a.length);
		
		LinkedList<Integer> n = new LinkedList<>();
		n.add(100);
		n.add(200);
		n.add(300);
		n.add(400);
		n.add(500);
		n.add(600);
		n.add(700);
		//4.2
		System.out.println(n.size());
		//5.1 to find the first index value
		System.out.println(n.indexOf(200));
		
		Vector<Integer> h = new Vector<>();
		h.add(105);
		h.add(205);
		h.add(305);
		h.add(405);
		h.add(505);
		h.add(605);
		h.add(705);
		h.add(805);
		//4.3
		System.out.println(h.size());
		//5.2 find the last index position
		System.out.println(h.lastIndexOf(605));
		
		ArrayList<Integer> b = new ArrayList<>();
		b.add(30);
		b.add(234);
		b.add(1987);
		b.add(21);
		System.out.println(b);
		b.removeAll(b);
		System.out.println(b);
		
		 
		
	
	
	}
}
