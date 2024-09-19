package support;

import model.SupportRequest;

public class BasicSupportHandler extends SupportHandler {
    
    @Override
    protected boolean canHandleRequest(SupportRequest request) {
        return request.getSeverityLevel() <= 1;
    }

    @Override
    protected void processRequest(SupportRequest request) {
        System.out.println("Basic Support handled request: " + request.getRequestId());
    }
}