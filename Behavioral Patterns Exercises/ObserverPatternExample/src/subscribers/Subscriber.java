package subscribers;

import news.NewsType;
import java.util.Set;

public interface Subscriber {
    void update(String news, NewsType newsType);
    Set<NewsType> getPreferredNewsTypes();
    String getName();
    boolean isPaused();
    void setPaused(boolean paused);
}
