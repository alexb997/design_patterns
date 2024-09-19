package support;

import model.SupportRequest;

public class SupervisorSupportHandler extends SupportHandler {

    @Override
    protected boolean canHandleRequest(SupportRequest request) {
        return request.getSeverityLevel() >= 3;
    }

    @Override
    protected void processRequest(SupportRequest request) {
        System.out.println("Supervisor handled request: " + request.getRequestId());
    }
}