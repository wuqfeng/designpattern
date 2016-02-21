package observer;

import observer.Observer;
import subject.Subject;

/**
 * Created by wuqf on 16-2-21.
 */
public class CurrentCondituonDisplay implements Observer {

    public void update(float temperature, float humidity, float pressure) {
        System.out.println("temperature is " + temperature + " . humidity is " + humidity + " .pressure is " + pressure);
    }
}
