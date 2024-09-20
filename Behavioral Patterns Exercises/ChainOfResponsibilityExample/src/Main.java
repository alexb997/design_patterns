import support.*;
import model.SupportRequest;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        SupportHandler basicSupport = new BasicSupportHandler();
        SupportHandler advancedSupport = new AdvancedSupportHandler();
        SupportHandler supervisorSupport = new SupervisorSupportHandler();

        basicSupport.setNextHandler(advancedSupport);
        advancedSupport.setNextHandler(supervisorSupport);

        SupportRequest request1 = new SupportRequest("REQ123", 1, "Password reset", "CUST001", 3000);
        SupportRequest request2 = new SupportRequest("REQ124", 2, "Unable to connect", "CUST002", 3000);
        SupportRequest request3 = new SupportRequest("REQ125", 3, "System crash", "CUST003", 3000);

        System.out.println("Handling Request 1 (Low severity):");
        basicSupport.handleRequest(request1);

        Thread.sleep(2000);
        System.out.println("\nHandling Request 2 (Medium severity):");
        basicSupport.handleRequest(request2);

        Thread.sleep(4000);
        System.out.println("\nHandling Request 3 (High severity):");
        basicSupport.handleRequest(request3);
        
        System.out.println("\nEscalating Request 3 after delay:");
        Thread.sleep(3000);
        basicSupport.handleRequest(request3);
    }
}
