import observer.Subscriber1;
import observer.Subscriber2;
import subject.NewsAgency;

public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        Subscriber1 subscriber1 = new Subscriber1("Alice");
        Subscriber2 subscriber2 = new Subscriber2("Bob");

        newsAgency.subscribe(subscriber1);
        newsAgency.subscribe(subscriber2);

        newsAgency.setNews("Breaking News: Observer Pattern Implemented!");
        
        newsAgency.unsubscribe(subscriber1);

        newsAgency.setNews("More News: Observer Pattern in Action!");
    }
}