package subscribers;

import news.NewsType;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class DailyDigestSubscriber implements Subscriber {
    private String name;
    private Set<NewsType> preferredNewsTypes;
    private boolean paused;
    private List<String> dailyDigest;

    public DailyDigestSubscriber(String name, Set<NewsType> preferredNewsTypes) {
        this.name = name;
        this.preferredNewsTypes = preferredNewsTypes;
        this.paused = false;
        this.dailyDigest = new ArrayList<>();
    }

    @Override
    public void update(String news, NewsType newsType) {
        if (preferredNewsTypes.contains(newsType) || preferredNewsTypes.contains(NewsType.GENERAL)) {
            dailyDigest.add(news + " [" + newsType + "]");
        }
    }

    @Override
    public Set<NewsType> getPreferredNewsTypes() {
        return preferredNewsTypes;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isPaused() {
        return paused;
    }

    @Override
    public void setPaused(boolean paused) {
        this.paused = paused;
    }

    public void sendDailyDigest(List<String> allNews) {
        if (!paused) {
            System.out.println(name + "'s Daily Digest: ");
            for (String news : allNews) {
                System.out.println(news);
            }
        } else {
            System.out.println(name + " has paused their daily digest.");
        }
        dailyDigest.clear();
    }

    @Override
    public String toString() {
        return "DailyDigestSubscriber{" +
                "name='" + name + '\'' +
                ", preferredNewsTypes=" + preferredNewsTypes +
                ", paused=" + paused +
                '}';
    }
}
