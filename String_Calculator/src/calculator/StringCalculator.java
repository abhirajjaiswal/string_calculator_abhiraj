package calculator;





import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import org.hamcrest.Matcher.*;

public class StringCalculator {

	public static int Add(String numbers) {
		if(numbers.isEmpty()) {
			return 0;	
		}else {
			String[] token = tokanize(numbers);
			
			int sum= 0;
			List<Integer> convert= new ArrayList<Integer>();
			List<Integer> negatives = new ArrayList<Integer>();
			for (String number : token) {
				int n = toInt(number);
					if(n<0) {
						negatives.add(n);
					 }
				convert.add(n);
			}
			
			for (Integer i : convert) {
				sum = sum+i;
			}
			if(negatives.size()>0)
				throw new RuntimeException("Negatives not allowed -1"+ join(negatives));
			return sum;
		}
	}
	
	
	private static String[] tokanize(String numbers) {
		if(useCustomDelimeterSyntax(numbers)) {
			return splitUsingCustomDelimiterSyntax(numbers);
		}
		else{
			return splitUsingNewLinesAndComma(numbers);
		}
		
	}


	private static boolean useCustomDelimeterSyntax(String numbers) {
		return numbers.startsWith("//");
	}


	private static String[] splitUsingNewLinesAndComma(String numbers) {
		String [] token = numbers.split(",|\n");
		return token;
	}


	private static String[] splitUsingCustomDelimiterSyntax(String numbers) {
		Matcher m= Pattern.compile("//(.)\n(.*)").matcher(numbers);
		m.matches()	;
		String customDelimiter = m.group(1);
		String numberString = m.group(2);
		return numberString.split(Pattern.quote(customDelimiter));
	}
	
	
	private static int  toInt(String numbers) {
		return Integer.parseInt(numbers);
	}
}
