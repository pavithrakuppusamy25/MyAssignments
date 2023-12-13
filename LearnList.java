package wee4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		List <Integer> litname=new ArrayList<Integer>();
		litname.add(12);
		litname.add(12);
		litname.add(10);
		litname.add(56);
		litname.add(34);
		litname.add(78);
		//to get lenght of this text
		int size = litname.size();
		System.out.println(size);
		//print the list
		System.out.println(litname);
		//to get particular vlaue
		System.out.println(litname.get(4));
		//to remove data
		System.out.println(litname.remove(3));
		//litname.clear();
		System.out.println(litname);
		System.out.println(litname.contains(34));
		System.out.println(litname.isEmpty());
		//sort the list
		Collections.sort(litname);
		System.out.println("Sorted list");
		System.out.println(litname);
		//addAll
		List <Integer> lst1=new ArrayList<Integer>();
		lst1.addAll(litname);
		lst1.add(10);
		System.out.println(lst1);
		
		//AddAll
		List <Integer> lst11=new ArrayList<Integer>();
		lst11.add(20);		
		lst11.addAll(litname);
		System.out.println(lst11);
		
	}

}
