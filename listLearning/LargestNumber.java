package listLearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestNumber {

	public static void main(String[] args) {
		List <Integer> lst1=new ArrayList<Integer>();
		lst1.add(3);
		lst1.add(2);
		lst1.add(11);
		lst1.add(4);
		lst1.add(6);
		lst1.add(7);
		Collections.sort(lst1);
		System.out.println(lst1);
		System.out.println("Second largest number"+lst1.get(4));

	}

}
