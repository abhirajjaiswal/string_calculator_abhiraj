package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;


public class TestCalculator {

	@Test
	void shouldReturnZeroOnEmptyString() {
		assertEquals(0, StringCalculator.Add(""));
		
	}
}
