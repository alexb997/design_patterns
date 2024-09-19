package support;

public class MidLevelSupport implements SupportHandler {

    private SupportHandler nextHandler;

    @Override
    public void handleRequest(String request) {
        if (canHandle(request)) {
            System.out.println("MidLevelSupport handling request: " + request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }

    @Override
    public void setNext(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    private boolean canHandle(String request) {
        return request.contains("intermediate");
    }
}