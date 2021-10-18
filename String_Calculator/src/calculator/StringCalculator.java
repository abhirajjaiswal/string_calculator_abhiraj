package calculator;

public class StringCalculator {

	public static int Add(String numbers) {
		if(numbers.isEmpty()) {
			return 0;	
		}else if (numbers.contains(",")) {
			String [] token = numbers.split(",");
			return Integer.parseInt(token[0]) + Integer.parseInt(token[1]);
		}
		else {
			return Integer.parseInt(numbers);
		}
		
	}
}
