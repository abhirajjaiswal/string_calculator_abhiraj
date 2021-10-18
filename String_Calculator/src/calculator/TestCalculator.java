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
	
	@Test
	public void shouldRaiseExceptionONNegatives() {
		try{
			StringCalculator.Add("-1,2,3");
			fail("Exception.expected.");
		}
		catch(RuntimeException ex){
			
		}
	}
	@Test
	public void ExceptionMessageShouldContaionNegativeNumber() {
		try{
			StringCalculator.Add("-1,2,3");
			fail("Exception.expected.");
		}
		catch(RuntimeException ex){
			assertEquals("Negatives not allowed -1",ex.getMessage());	
		}
		
	}
}
