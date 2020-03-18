package interface_exercice;

public class GenericMovable implements MovableObject {
	private double speed = 100;
	@Override
	public boolean canAccelerate() {
		return true;
	}
	@Override
	public void accelerate() {
		speed = speed + 1;
	}
	@Override
	public double getTimeToMove(double distance) {
		return distance/speed;
	}
	public void brake(){
		speed = speed -1;
	}
}

/* canAccelerate(): boolean, accelerate(): void and getTimeToMove(double): double; implement it twice in classe*/ 