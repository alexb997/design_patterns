package support;

import model.SupportRequest;
import log.Logger;

public abstract class SupportHandler {
    protected SupportHandler nextHandler;
    protected Logger logger = Logger.getInstance();

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(SupportRequest request);
}
