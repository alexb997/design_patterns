package subscribers;

import news.NewsType;

public class EmailSubscriber implements Subscriber {

    private String name;
    private NewsType preferredNewsType;

    public EmailSubscriber(String name, NewsType preferredNewsType) {
        this.name = name;
        this.preferredNewsType = preferredNewsType;
    }

    @Override
    public void update(String news, NewsType newsType) {
        if (this.preferredNewsType == newsType || this.preferredNewsType == NewsType.GENERAL) {
            System.out.println(name + " (Email) received: " + news + " [" + newsType + "]");
        }
    }

    @Override
    public NewsType getPreferredNewsType() {
        return preferredNewsType;
    }

    @Override
    public String toString() {
        return "EmailSubscriber{" +
                "name='" + name + '\'' +
                ", preferredNewsType=" + preferredNewsType +
                '}';
    }
}