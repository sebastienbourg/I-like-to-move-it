package interface_exercice;

public interface MovableObject {
	
	public boolean canAccelerate(); 
	public void accelerate(); 
	public double getTimeToMove(double distance);
	public void brake();
}

/* Add a method brake(): void to MovableObject */

