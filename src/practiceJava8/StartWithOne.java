package practiceJava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWithOne {
	
	public static void main(String []agrs){
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
		list.stream().map(s->s + "").filter(s->s.startsWith("1")).forEach(System.out::print);;
	}
	

}
