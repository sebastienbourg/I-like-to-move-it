package interface_exercice;

public class MovableUser {
	
	public static double getTotalTime(MovableObject movable) {
		double totaltime = 0;
		totaltime += movable.getTimeToMove(1);
		movable.brake();
		totaltime += movable.getTimeToMove(0.1);
		movable.accelerate();
		totaltime += movable.getTimeToMove(1);
		
		return totaltime;
	}

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
		System.out.println("Time to move 1 km with genericspeed1 : " + genericspeed1.getTimeToMove(1));
		System.out.println("Time to move 1 km with genericspeed2 : " + genericspeed2.getTimeToMove(1));

		System.out.println("Total time to move for constantspeed : " + getTotalTime(constantspeed));
		System.out.println("Total time to move for genericspeed1 : " + getTotalTime(genericspeed1));
		System.out.println("Total time to move for genericspeed2 : " + getTotalTime(genericspeed2));
		
	}

}
