package observer;

public class Subscriber1 implements Observer {

    private String name;

    public Subscriber1(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " received news update: " + news);
    }
}