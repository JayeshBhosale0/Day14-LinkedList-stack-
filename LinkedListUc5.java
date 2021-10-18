package practise;
import java.util.LinkedList;

import java.util.List;
public class LinkedListUc5 {

	public static void main(String[] args) {
		List<Integer>number= new LinkedList<>();
		number.add(56);
		number.add(30);
		number.add(70);
		System.out.println(number);
		number.remove(0);
		
		
		System.out.println("After removing first element:"+number);
	}

}