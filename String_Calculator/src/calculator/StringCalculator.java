package calculator;

public class StringCalculator {

	public static int Add(String numbers) {
		if(numbers.isEmpty()) {
			return 0;	
		}else if (numbers.contains(",")) {
			String [] token = numbers.split(",");
			return toInt(token[0]) + toInt(token[1]);
		}
		else {
			return toInt(numbers);
		}
	}
	private static int  toInt(String numbers) {
		return Integer.parseInt(numbers);
	}
}
