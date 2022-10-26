package numbers;

import java.util.ArrayList;
import java.util.List;

public class CheckOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1 ; i < list.size() ; i++)
		{
			list.add(i);
		}
System.out.println(onlyOddNumbers(list));
	}
	public static boolean onlyOddNumbers(List<Integer> list) {
		return list
				.parallelStream() // parallel stream for faster processing
				.anyMatch(x -> x % 2 != 0); // return as soon as any elements match the condition
	}

}
