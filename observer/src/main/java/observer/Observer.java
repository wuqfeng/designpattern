package observer;

import subject.Subject;

/**
 * Created by wuqf on 16-2-20.
 */
public interface Observer {


    public void update(float temperature, float humidity, float pressure);
}
