package calculator;





import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StringCalculator {

	public static int Add(String numbers) {
		if(numbers.isEmpty()) {
			return 0;	
		}else {
			String[] token = tokanize(numbers);
			
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
	}
	
	
	private static String[] tokanize(String numbers) {
		if(numbers.startsWith("//")) {
			return splitCustomDelimiter(numbers);
		}
		else{
			return splitUsingNewLinesAndComma(numbers);
		}
		
	}


	private static String[] splitUsingNewLinesAndComma(String numbers) {
		String [] token = numbers.split(",|\n");
		return token;
	}


	private static String[] splitCustomDelimiter(String numbers) {
		Matcher m= Pattern.compile("//(.)\n(.*)").matcher(numbers);
		m.matches()	;
		String customDelimiter = m.group(1);
		String numberString = m.group(2);
		return numberString.split(customDelimiter);
	}
	
	
	private static int  toInt(String numbers) {
		return Integer.parseInt(numbers);
	}
}
