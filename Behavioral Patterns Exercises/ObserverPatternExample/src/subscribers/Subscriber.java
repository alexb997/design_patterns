package subscribers;

import news.NewsType;

public interface Subscriber {
    void update(String news, NewsType newsType);
    NewsType getPreferredNewsType();
}