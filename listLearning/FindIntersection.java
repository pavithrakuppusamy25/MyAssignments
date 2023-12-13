package listLearning;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		List <Integer> lst1=new ArrayList<Integer>();
		lst1.add(3);
		lst1.add(2);
		lst1.add(11);
		lst1.add(4);
		lst1.add(6);
		lst1.add(7);
		int size = lst1.size();
		System.out.println(size);
		System.out.println(lst1);
		
		List<Integer> lst2=new ArrayList<Integer>();
		lst2.add(1);
		lst2.add(2);
		lst2.add(8);
		lst2.add(4);
		lst2.add(9);
		lst2.add(7);
		int size2 = lst2.size();
		System.out.println(size2);
		
		for (int i = 0; i < size; i++) {
			Integer integer = lst1.get(i);
			if(!(lst2.contains(integer))) {
				System.out.println(integer);
			}
			
			
		}
		
		
		
		

	}

}
