package news;

import subscribers.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

    private List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void publishNews(String news, NewsType newsType) {
        System.out.println("Publishing news: " + news + " [" + newsType + "]");
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news, newsType);
        }
    }

    public void viewSubscribers() {
        System.out.println("Current Subscribers:");
        for (Subscriber subscriber : subscribers) {
            System.out.println(subscriber);
        }
    }

    public void sendPersonalMessage(Subscriber subscriber, String message) {
        System.out.println("Sending personalized message to " + subscriber + ": " + message);
        subscriber.update(message, NewsType.GENERAL);
    }
}