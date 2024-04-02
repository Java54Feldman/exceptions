package telran.exceptions.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.exceptions.RangeExceptions;
import telran.exceptions.RangeExceptionsProcessor;

class RangeExceptionsProcessorTest {

	private static final int MIN = 10;
	private static final int MAX = 20;
	private static final int N_RANGE_NUMBERS = 10;
	private static final int RANGE_NUMBER = 15;
	private static final int N_GREATER_MAX_NUMBERS = 30;
	private static final int RANGE_GREATER_NUMBER = 25;
	private static final int N_LESS_MIN_NUMBERS = 3;
	private static final int RANGE_LESS_NUMBER = 8;

	@Test
	void test() {
		RangeExceptions rangeExceptions = RangeExceptions.getRangeExceptions(MIN, MAX);
		RangeExceptionsProcessor rangeExceptionsProcessor = 
				new RangeExceptionsProcessor(rangeExceptions);
		processNumbers(rangeExceptionsProcessor, N_RANGE_NUMBERS, RANGE_NUMBER);
		processNumbers(rangeExceptionsProcessor, N_GREATER_MAX_NUMBERS, RANGE_GREATER_NUMBER);
		processNumbers(rangeExceptionsProcessor, N_LESS_MIN_NUMBERS, RANGE_LESS_NUMBER);
		assertEquals(N_RANGE_NUMBERS, rangeExceptionsProcessor.getCounterRange());
		assertEquals(N_GREATER_MAX_NUMBERS, rangeExceptionsProcessor.getCounterGreaterMax());
		assertEquals(N_LESS_MIN_NUMBERS, rangeExceptionsProcessor.getCounterLessMin());
	}

	private void processNumbers(RangeExceptionsProcessor rangeExceptionsProcessor, int nNumbers, int number) {
		for(int i = 0; i < nNumbers; i++) {
			rangeExceptionsProcessor.numberProcessor(number);
		}
	}

}
