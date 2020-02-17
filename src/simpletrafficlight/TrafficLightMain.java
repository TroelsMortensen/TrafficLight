package simpletrafficlight;

public class TrafficLightMain {

	public static void main(String[] args) 
			throws InterruptedException 
	{
		TrafficLight tf = new TrafficLight();
		Car c1 = new Car("c1");
		Car c3 = new Car("c3");
		Car c2 = new Car("c2");

		tf.start();
	}
	
}
