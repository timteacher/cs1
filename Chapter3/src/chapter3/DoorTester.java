package chapter3;

public class DoorTester {
	public static void main(String[] args) {
		door frontDoor = new door("front",true,5,1.7);
		
		System.out.println("The front door is "+ frontDoor.getState());
		System.out.println("Front door area is "+ frontDoor.getArea());
		
		
		door backDoor = new door("back", false, 1000,1000);
		System.out.println("The back door is "+ backDoor.getState());
		System.out.println("Back door area is "+ backDoor.getArea());
	}
}
