package simpletrafficlight;

import java.util.List;

public class TrafficLight  {
	
	private String currentLight;
	private String[] lights = {"GREEN", "YELLOW", "RED"};
	private int count = 2;
	
	public TrafficLight() {	currentLight = lights[2]; }
	
	public void start() throws InterruptedException {
		for(int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			count = (++count) % 3;
			currentLight = lights[count];
			System.out.println("\nLight is " + currentLight);

		}
	}





//	private class Listener {
//
//		public void update(Object arg) {
//
//		}
//	}
//
//	private List<Listener> listeners;
//
//	private void updateListeners(Object arg) {
//		for (Listener listener : listeners) {
//			listener.update(arg);
//		}
//	}
}

