package interface_exercice;

public class MovableUser {

	public static void main(String[] args) {
		ConstantSpeedMovable constantspeed = new ConstantSpeedMovable();
		GenericMovable genericspeed1 = new GenericMovable();
		GenericMovable genericspeed2 = new GenericMovable();
		
		genericspeed1.accelerate();
		genericspeed1.accelerate();
		genericspeed1.accelerate();
		genericspeed1.accelerate();
		genericspeed1.accelerate();
		
		System.out.println("Time to move 1 km with constantspeed : " + constantspeed.getTimeToMove(1));
		System.out.println("Time to move 1 km with constantspeed : " + genericspeed1.getTimeToMove(1));
		System.out.println("Time to move 1 km with constantspeed : " + genericspeed2.getTimeToMove(1));

	}

}



/* program a main method that instanciates one ConstantSpeedMovable and two GenericMovable objects, 
 * accelerate one of them, and prints the three resulting times to move 1 km
 */

