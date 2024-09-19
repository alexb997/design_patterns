package support;

import model.SupportRequest;

public class AdvancedSupportHandler extends SupportHandler {

    @Override
    protected boolean canHandleRequest(SupportRequest request) {
        return request.getSeverityLevel() == 2;
    }

    @Override
    protected void processRequest(SupportRequest request) {
        System.out.println("Advanced Support handled request: " + request.getRequestId());
    }
}