package subject;

import observer.CurrentCondituonDisplay;
import observer.Observer;

/**
 * Created by wuqf on 16-2-21.
 */
public class Client {
    public static void main(String[] args)
    {
        WeatherStation subject=new WeatherStation();
        Observer observer=new CurrentCondituonDisplay();
        subject.registerObserver(observer);
        subject.setWeatherData(0f,0f,1f);
    }
}
