package subject;

import observer.Observer;

/**
 * Created by wuqf on 16-2-20.
 */
public interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver();
}
