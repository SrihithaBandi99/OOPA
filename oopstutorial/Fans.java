package oopstutorial;
class Appliance {
    void turnOn() {
        System.out.println("Appliance is turned ON");
    }

}

class Fan extends Appliance {
    void rotate() {
        System.out.println("Fan is rotating");
    }
}

class CeilingFan extends Fan {
    void setSpeed(int speed) {
        System.out.println("Ceiling Fan speed set to: " + speed);
    }
}

public class Fans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CeilingFan cf =new CeilingFan();
		cf.turnOn();
		cf.rotate();
		cf.setSpeed(5);
	}

}
