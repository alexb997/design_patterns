package news;

import subscribers.DailyDigestSubscriber;
import subscribers.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

    private List<Subscriber> subscribers = new ArrayList<>();
    private List<String> dailyDigest = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void pauseSubscription(Subscriber subscriber) {
        subscriber.setPaused(true);
        System.out.println(subscriber.getName() + " has paused their subscription.");
    }

    public void resumeSubscription(Subscriber subscriber) {
        subscriber.setPaused(false);
        System.out.println(subscriber.getName() + " has resumed their subscription.");
    }

    public void publishNews(String news, NewsType newsType) {
        System.out.println("Publishing news: " + news + " [" + newsType + "]");
        dailyDigest.add(news + " [" + newsType + "]");

        for (Subscriber subscriber : subscribers) {
            if (subscriber.getPreferredNewsType() == newsType || subscriber.getPreferredNewsType() == NewsType.GENERAL) {
                subscriber.update(news, newsType);
            }
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

    public void sendDailyDigest() {
        System.out.println("Sending daily digest...");
        for (Subscriber subscriber : subscribers) {
            if (subscriber instanceof DailyDigestSubscriber) {
                ((DailyDigestSubscriber) subscriber).sendDailyDigest(dailyDigest);
            }
        }
        dailyDigest.clear();
    }
}
