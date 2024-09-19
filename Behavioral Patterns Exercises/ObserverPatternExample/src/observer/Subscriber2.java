package observer;

public class Subscriber2 implements Observer {

    private String name;

    public Subscriber2(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " received news update: " + news);
    }
}