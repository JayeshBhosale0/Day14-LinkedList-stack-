package practise;

import java.util.LinkedList;
import java.util.List;
public class LinkedListUc3 {

	public static void main(String[] args) {
		List<Integer> number  = new LinkedList <>();
		number.add(56);
		System.out.println(number);
		number.add(30);
		System.out.println("new number added:"+number);
		number.add(70);
		System.out.println("last number added:"+number);
	}

}
