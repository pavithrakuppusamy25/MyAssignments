package listLearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingValuesInList {

	public static void main(String[] args) {
		List <Integer> lst1=new ArrayList<Integer>();
		lst1.add(1);
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);
		lst1.add(10);
		lst1.add(6);
		lst1.add(8);
		Collections.sort(lst1);
		System.out.println(lst1);
		for (int i = 0; i < lst1.size()-1; i++) {
			if(lst1.get(i)+1!=lst1.get(i+1)) {
				int missing=lst1.get(i)+1;
				System.out.println(missing);
				
				
			}
			
			
		}
	}

}
