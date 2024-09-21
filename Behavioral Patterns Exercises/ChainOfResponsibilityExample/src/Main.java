import support.*;
import model.SupportRequest;

public class Main {
    public static void main(String[] args) {
        LowLevelSupportHandler lowHandler = new LowLevelSupportHandler();
        MediumLevelSupportHandler mediumHandler = new MediumLevelSupportHandler();
        HighLevelSupportHandler highHandler = new HighLevelSupportHandler();

        lowHandler.setNextHandler(mediumHandler);
        mediumHandler.setNextHandler(highHandler);

        SupportRequest lowRequest = new SupportRequest("Low", "Password Reset", "C123", 5);
        SupportRequest mediumRequest = new SupportRequest("Medium", "Software Crash", "C456", 30);
        SupportRequest highRequest = new SupportRequest("High", "Data Loss", "C789", 120);

        System.out.println("Processing Low-Level Request:");
        lowHandler.handleRequest(lowRequest);

        System.out.println("\nProcessing Medium-Level Request:");
        lowHandler.handleRequest(mediumRequest);

        System.out.println("\nProcessing High-Level Request:");
        lowHandler.handleRequest(highRequest);

        SupportRequest delayedRequest = new SupportRequest("Low", "Network Issue", "C012", 60);
        System.out.println("\nEscalating Delayed Request:");
        delayedRequest.escalate();
        lowHandler.handleRequest(delayedRequest);

        System.out.println("\nCustomer rates support:");
        delayedRequest.setRating(5);
        System.out.println(delayedRequest);
    }
}
