import news.NewsAgency;
import news.NewsType;
import subscribers.EmailSubscriber;
import subscribers.SmsSubscriber;
import subscribers.DailyDigestSubscriber;
import java.util.EnumSet;

public class Main {

    public static void main(String[] args) {

        NewsAgency newsAgency = new NewsAgency();

        EmailSubscriber emailSubscriber1 = new EmailSubscriber("Alice", EnumSet.of(NewsType.SPORTS));
        SmsSubscriber smsSubscriber1 = new SmsSubscriber("Bob", EnumSet.of(NewsType.POLITICS));
        DailyDigestSubscriber dailyDigestSubscriber = new DailyDigestSubscriber("Charlie", EnumSet.of(NewsType.ENTERTAINMENT, NewsType.GENERAL));

        newsAgency.subscribe(emailSubscriber1);
        newsAgency.subscribe(smsSubscriber1);
        newsAgency.subscribe(dailyDigestSubscriber);

        newsAgency.publishNews("Breaking: Sports Championship!", NewsType.SPORTS);
        newsAgency.publishNews("Election Results Announced!", NewsType.POLITICS);
        newsAgency.publishNews("New Movie Released!", NewsType.ENTERTAINMENT);

        newsAgency.pauseSubscription(emailSubscriber1);

        newsAgency.publishNews("Sports Star Injured", NewsType.SPORTS);

        newsAgency.viewSubscribers();

        newsAgency.resumeSubscription(emailSubscriber1);
        newsAgency.sendPersonalMessage(emailSubscriber1, "Exclusive: Sports behind-the-scenes!");

        newsAgency.sendDailyDigest();
    }
}
