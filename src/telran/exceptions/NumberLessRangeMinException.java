package telran.exceptions;

@SuppressWarnings("serial")
public class NumberLessRangeMinException extends Exception {
	public NumberLessRangeMinException(int min, int number) {
		super(String.format("Number (%d) less than range min (%d)", number, min));
	}
}
