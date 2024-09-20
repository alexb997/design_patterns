package support;

import model.SupportRequest;
import java.util.Scanner;

public abstract class SupportHandler {
    protected SupportHandler nextHandler;
    protected long startTime;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(SupportRequest request) {
        logRequest(request);
        if (canHandleRequest(request)) {
            processRequest(request);
            collectCustomerRating(request);
        } else if (nextHandler != null) {
            escalateRequest(request);
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No support level available to handle the request.");
        }
    }

    protected abstract boolean canHandleRequest(SupportRequest request);
    protected abstract void processRequest(SupportRequest request);

    private void logRequest(SupportRequest request) {
        System.out.println(this.getClass().getSimpleName() + " is processing request: " + request);
    }

    protected void escalateRequest(SupportRequest request) {
        long currentTime = System.currentTimeMillis();
        if (currentTime - startTime > request.getEscalationTime()) {
            System.out.println("Request " + request.getRequestId() + " has been escalated to the next level.");
        }
    }

    protected void collectCustomerRating(SupportRequest request) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please rate the support for request " + request.getRequestId() + " (1-5): ");
        int rating = scanner.nextInt();
        request.setCustomerRating(rating);
        System.out.println("Thank you! You rated the support: " + rating);
    }
}
