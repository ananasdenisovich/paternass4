import java.util.ArrayList;
import java.util.List;
class NotificationPublisher implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void publishNotification(String message) {
        System.out.println("New message: " + message);
        notifyObservers(message);
    }

    public List<String> getUsers() {
        List<String> userNames = new ArrayList<>();
        for (Observer observer : observers) {
            if (observer instanceof User) {
                userNames.add(observer.toString());
            }
        }
        return userNames;
    }
}