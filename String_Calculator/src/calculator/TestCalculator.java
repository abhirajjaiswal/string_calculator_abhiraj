package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;


public class TestCalculator {

	@Test
	public void shouldReturnZeroOnEmptyString() {
		assertEquals(0, StringCalculator.Add(""));
	}
	
	@Test
	public void shouldReturnNumberONnumber() {
		assertEquals(1, StringCalculator.Add("1"));
	}
	@Test
	public void shouldReturnSumONTwoNumbersDelimitedByComma() {
		assertEquals(3, StringCalculator.Add("1,2"));
	}
	
	@Test
	public void shouldReturnSumOnMultipleNumbers() {
		assertEquals(6, StringCalculator.Add("1,2,3"));
	}
	
	@Test
	public void shouldAddNewLineAsValidDelimeter() {
		assertEquals(6, StringCalculator.Add("1,2\n3"));
	}
	
	@Test
	public void shouldAcceptCustomDelimeterSyntax() {
		assertEquals(3, StringCalculator.Add("//;\n1;2"));
	}
	
	@Test
	public void customExpCouldAlsoBeRegExpSpecialChar() {
		assertEquals(3, StringCalculator.Add("//.\n1.2"));
	}
	
}
