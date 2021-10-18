package practise;
import java.util.List;
import java.util.LinkedList;

public class LinkedListUc6 {

	public static void main(String[] args) {
		List<Integer>number = new LinkedList<>(); 
		number.add(56);
		number.add(30);
		number.add(70);
		System.out.println(number);
		number.remove(2);
		System.out.println("After removing last element:"+number);

	}

}
