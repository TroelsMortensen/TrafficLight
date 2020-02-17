package javatrafficlight;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Car1 implements PropertyChangeListener {

    public Car1() {}

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String oldValue = (String) evt.getOldValue();
        String newValue = (String) evt.getNewValue();

        if(newValue.equals("GREEN")) {
            System.out.println("Car 1 drives");
        } else if(newValue.equals("YELLOW")) {
            if ("RED".equals(oldValue)) {
                System.out.println("Car 1 turns engine on");
            } else {
                System.out.println("Car 1 slows down");
            }
        } else if ("RED".equals(newValue)) {
            System.out.println("Car 1 stops");
        }
    }
}
