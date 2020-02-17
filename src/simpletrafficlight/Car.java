package simpletrafficlight;


public class Car implements Listener {

	private String id;
	private String previousLight;

	public Car(String id) {this.id = id;}

	@Override
	public void update(Object arg) {
		String light = (String)arg;

		if("GREEN".equals(light)) {
			System.out.println("Car " + id + " drives");
		} else if("YELLOW".equals(light)) {
			if("RED".equals(previousLight)) {
				System.out.println("Car " + id + " turns engine on");
			} else {
				System.out.println("Car " + id + " slows down");
			}
		} else if("RED".equals(light)) {
			System.out.println("Car " + id + " stops");
		}
		previousLight = light;
	}
}
