import news.NewsAgency;
import news.NewsType;
import subscribers.EmailSubscriber;
import subscribers.SmsSubscriber;
import subscribers.DailyDigestSubscriber;

public class Main {

    public static void main(String[] args) {

        NewsAgency newsAgency = new NewsAgency();

        EmailSubscriber emailSubscriber1 = new EmailSubscriber("Alice", NewsType.SPORTS);
        SmsSubscriber smsSubscriber1 = new SmsSubscriber("Bob", NewsType.POLITICS);
        DailyDigestSubscriber dailyDigestSubscriber = new DailyDigestSubscriber("Charlie", NewsType.ENTERTAINMENT);

        newsAgency.subscribe(emailSubscriber1);
        newsAgency.subscribe(smsSubscriber1);
        newsAgency.subscribe(dailyDigestSubscriber);

        newsAgency.publishNews("Breaking: Sports Championship!", NewsType.SPORTS);
        newsAgency.publishNews("Election Results Announced!", NewsType.POLITICS);
        newsAgency.publishNews("New Movie Released!", NewsType.ENTERTAINMENT);

        newsAgency.viewSubscribers();

        newsAgency.sendPersonalMessage(emailSubscriber1, "Special sports offer for Alice!");

        newsAgency.sendDailyDigest();
    }
}
