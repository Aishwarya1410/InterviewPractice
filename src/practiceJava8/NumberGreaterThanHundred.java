package practiceJava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberGreaterThanHundred {
	
	public static void main(String[] args){
	
	List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
	List<Integer> result= list.stream().map(n->n*n).filter(n->n>100).collect(Collectors.toList());
	
	System.out.println(result);
	}
	

}
