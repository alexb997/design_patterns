package subscribers;

import news.NewsType;

public class SmsSubscriber implements Subscriber {

    private String name;
    private NewsType preferredNewsType;

    public SmsSubscriber(String name, NewsType preferredNewsType) {
        this.name = name;
        this.preferredNewsType = preferredNewsType;
    }

    @Override
    public void update(String news, NewsType newsType) {
        if (this.preferredNewsType == newsType || this.preferredNewsType == NewsType.GENERAL) {
            System.out.println(name + " (SMS) received: " + news + " [" + newsType + "]");
        }
    }

    @Override
    public NewsType getPreferredNewsType() {
        return preferredNewsType;
    }

    @Override
    public String toString() {
        return "SmsSubscriber{" +
                "name='" + name + '\'' +
                ", preferredNewsType=" + preferredNewsType +
                '}';
    }
}