package simpletrafficlight;

import java.util.ArrayList;
import java.util.List;

public class TrafficLight implements Subject {
	
	private String currentLight;
	private String[] lights = {"GREEN", "YELLOW", "RED", "YELLOW"};
	private int lightIndex = 2;

	private List<Listener> listeners = new ArrayList<>();

	public TrafficLight() {	currentLight = lights[2]; }
	
	public void start() throws InterruptedException {
		for(int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			lightIndex = (++lightIndex) % 4; //0,1,2,3,0,1,2,3
			currentLight = lights[lightIndex];
			System.out.println("\nLight is " + currentLight);
			updateListeners(currentLight);
		}
	}

	private void updateListeners(Object arg) {
		for (Listener listener : listeners) {
			listener.update(arg);
		}
	}

	@Override
	public void addListener(Listener lstnr) {
		listeners.add(lstnr);
	}

	@Override
	public void removeListener(Listener lstnr) {
		listeners.remove(lstnr);
	}
}

