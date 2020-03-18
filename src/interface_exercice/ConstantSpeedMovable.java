package interface_exercice;

public class ConstantSpeedMovable implements MovableObject {
	
	private double speed = 100;
	@Override
	public boolean canAccelerate() {
		return false;
	}
	@Override
	public void accelerate() {
	}
	@Override
	public double getTimeToMove(double distance) {
		return distance/speed;
	}
	@Override
	public void brake() {
	
	}
}


/*canAccelerate(): boolean, accelerate(): void and getTimeToMove(double): double; implement it twice in classe*/