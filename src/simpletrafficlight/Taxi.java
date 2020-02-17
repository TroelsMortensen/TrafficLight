package simpletrafficlight;


public class Taxi implements Listener {

	private String name;
	
	public Taxi(String name) {this.name = name;}


	@Override
	public void update(Object arg) {
		String light = (String)arg;

		if("GREEN".equals(light)) {
			System.out.println("Taxi " + name + " drives super fast");
		} else if("RED".equals(light)) {
			System.out.println("Taxi " + name + " stops with screetching tires");
		}
	}
}
