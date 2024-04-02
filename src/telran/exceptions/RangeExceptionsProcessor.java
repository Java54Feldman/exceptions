package telran.exceptions;

public class RangeExceptionsProcessor {
	private RangeExceptions rangeExceptions;
	private int counterGreaterMax; // how many numbers have been greater than max range
	private int counterLessMin; // how many numbers have been less than min range
	private int counterRange; // how many numbers have been into range
	public RangeExceptionsProcessor(RangeExceptions rangeException) {
		this.rangeExceptions = rangeException;
	}
	public void numberProcessor(int number) {
		try {
			rangeExceptions.checkNumber(number);
			counterRange++;
		} catch (NumberGreaterRangeMaxException e) {
			counterGreaterMax++;
		} catch (NumberLessRangeMinException e) {
			counterLessMin++;
		}
	}
	public RangeExceptions getRangeExceptions() {
		return rangeExceptions;
	}
	public int getCounterGreaterMax() {
		return counterGreaterMax;
	}
	public int getCounterLessMin() {
		return counterLessMin;
	}
	public int getCounterRange() {
		return counterRange;
	}
	
}
