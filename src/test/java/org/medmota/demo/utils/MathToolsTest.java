package org.medmota.demo.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MathToolsTest {

	@Test
	@DisplayName("Test successful decimal conversion")
	void testConvertToDecimalSuccess() {
		double result = MathTools.convertToDecimal(3, 4);
		Assertions.assertEquals(0.75, result,
				() -> "The MathTools::convertToDecimal value did not return the correct value of 0.75 for 3/4");
	}

	@Test
	void testConvertToDecimalInvalidDenominator() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> MathTools.convertToDecimal(3, 0));
	}
}
