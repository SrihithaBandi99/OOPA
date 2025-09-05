package oopstutorial;
class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    void fuelType() {
        System.out.println("Car uses petrol or diesel");
    }
}

public class Vehicles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Car myCar = new Car();
	        myCar.move();      
	        myCar.fuelType(); 
	}

}
