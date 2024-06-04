package practiceJava8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElememts {
	
	public static void main(String []args){
		
		List<Integer> list = Arrays.asList(10,15,8,49,49,25,98,98,32);
		HashSet<Integer> set = new HashSet();
		list.stream()
		    .filter(n->!set.add(n))
		    .forEach(System.out::print);
		
		
	}

}
