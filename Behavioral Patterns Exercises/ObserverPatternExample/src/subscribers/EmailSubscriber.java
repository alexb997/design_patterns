package subscribers;

import news.NewsType;
import java.util.Set;

public class EmailSubscriber implements Subscriber {

    private String name;
    private Set<NewsType> preferredNewsTypes;
    private boolean paused;

    public EmailSubscriber(String name, Set<NewsType> preferredNewsTypes) {
        this.name = name;
        this.preferredNewsTypes = preferredNewsTypes;
        this.paused = false;
    }

    @Override
    public void update(String news, NewsType newsType) {
        System.out.println(name + " (Email) received: " + news + " [" + newsType + "]");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Set<NewsType> getPreferredNewsTypes() {
        return preferredNewsTypes;
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
        return "EmailSubscriber{" +
                "name='" + name + '\'' +
                ", preferredNewsTypes=" + preferredNewsTypes +
                ", paused=" + paused +
                '}';
    }
}
