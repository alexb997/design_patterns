package subscribers;

import news.NewsType;

import java.util.ArrayList;
import java.util.List;

public class DailyDigestSubscriber implements Subscriber {

    private String name;
    private NewsType preferredNewsType;
    private List<String> dailyDigest;

    public DailyDigestSubscriber(String name, NewsType preferredNewsType) {
        this.name = name;
        this.preferredNewsType = preferredNewsType;
        this.dailyDigest = new ArrayList<>();
    }

    @Override
    public void update(String news, NewsType newsType) {
        if (this.preferredNewsType == newsType || this.preferredNewsType == NewsType.GENERAL) {
            dailyDigest.add(news + " [" + newsType + "]");
        }
    }

    @Override
    public NewsType getPreferredNewsType() {
        return preferredNewsType;
    }

    public void sendDailyDigest(List<String> allNews) {
        System.out.println(name + "'s Daily Digest: ");
        for (String news : allNews) {
            System.out.println(news);
        }
        dailyDigest.clear();
    }

    @Override
    public String toString() {
        return "DailyDigestSubscriber{" +
                "name='" + name + '\'' +
                ", preferredNewsType=" + preferredNewsType +
                '}';
    }
}

