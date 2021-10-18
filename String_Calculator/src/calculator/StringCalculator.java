package calculator;





import java.util.ArrayList;
import java.util.List;


public class StringCalculator {

	public static int Add(String numbers) {
		if(numbers.isEmpty()) {
			return 0;	
		}else if (numbers.contains(",")) {
			String [] token = numbers.split(",|\n");
			
			int sum= 0;
			List<Integer> convert= new ArrayList<Integer>();
			for (String number : token) {
				convert.add(toInt(number));
			}
			for (Integer i : convert) {
				sum = sum+i;
			}
			return sum;
		}
		else {
			return toInt(numbers);
		}
	}
	
	private static int  toInt(String numbers) {
		return Integer.parseInt(numbers);
	}
}
