package subscribers;

import news.NewsType;

import java.util.Set;

public class SmsSubscriber implements Subscriber {
    private String name;
    private Set<NewsType> preferredNewsTypes;
    private boolean paused;

    public SmsSubscriber(String name, Set<NewsType> preferredNewsTypes) {
        this.name = name;
        this.preferredNewsTypes = preferredNewsTypes;
        this.paused = false;
    }

    @Override
    public void update(String news, NewsType newsType) {
        System.out.println(name + " (SMS) received: " + news + " [" + newsType + "]");
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

    @Override
    public String toString() {
        return "SmsSubscriber{" +
                "name='" + name + '\'' +
                ", preferredNewsTypes=" + preferredNewsTypes +
                ", paused=" + paused +
                '}';
    }
}