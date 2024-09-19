package support;

public class HighLevelSupport implements SupportHandler {

    @Override
    public void handleRequest(String request) {
        System.out.println("HighLevelSupport handling request: " + request);
    }

    @Override
    public void setNext(SupportHandler nextHandler) {
        //end of chain
    }
}