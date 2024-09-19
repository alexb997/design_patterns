package support;

public class LowLevelSupport implements SupportHandler {

    private SupportHandler nextHandler;

    @Override
    public void handleRequest(String request) {
        if (canHandle(request)) {
            System.out.println("LowLevelSupport handling request: " + request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }

    @Override
    public void setNext(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    private boolean canHandle(String request) {
        return request.contains("basic");
    }
}