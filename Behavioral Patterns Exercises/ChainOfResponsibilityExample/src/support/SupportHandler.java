package support;

public interface SupportHandler {
    void handleRequest(String request);
    void setNext(SupportHandler nextHandler);
}