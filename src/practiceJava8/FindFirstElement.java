package practiceJava8;

import java.util.Arrays;
import java.util.List;

public class FindFirstElement {
	
	public static void main(String []args){
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
		list.stream().findFirst().ifPresent(System.out::print);
	}

}
