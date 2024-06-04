package practiceJava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortListUpperCase {
	
	public static void main(String[]args){
		List<String> list = Arrays.asList("java", "python", "javascript");
		
		List<String> sortedList = list.stream().map(String::toUpperCase).sorted().collect(Collectors.toList());
		
		System.out.println(sortedList);
		
	}

}
