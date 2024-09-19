import support.LowLevelSupport;
import support.MidLevelSupport;
import support.HighLevelSupport;
import support.SupportHandler;

public class Main {
    public static void main(String[] args) {
        SupportHandler lowLevel = new LowLevelSupport();
        SupportHandler midLevel = new MidLevelSupport();
        SupportHandler highLevel = new HighLevelSupport();

        lowLevel.setNext(midLevel);
        midLevel.setNext(highLevel);

        System.out.println("Handling basic issue:");
        lowLevel.handleRequest("basic issue");

        System.out.println("\nHandling intermediate issue:");
        lowLevel.handleRequest("intermediate issue");

        System.out.println("\nHandling advanced issue:");
        lowLevel.handleRequest("advanced issue");
    }
}