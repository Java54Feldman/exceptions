package telran.exceptions;

import java.util.Random;

public class BallBrokenFloor {
	private int brokenFloor;
	private int nFloors;
	public BallBrokenFloor(int nFloors) {
		this.nFloors = nFloors;
		brokenFloor = new Random().nextInt(1, nFloors + 1);
		// диапазон, верхнее значение не включается
	}
	public int getBrokenFloor() {
		//this method only for test
		return brokenFloor;
	}
	public void checkFloor(int floor) throws Exception {
		if (floor >= brokenFloor) {
			throw new Exception();
		}
	}
}
