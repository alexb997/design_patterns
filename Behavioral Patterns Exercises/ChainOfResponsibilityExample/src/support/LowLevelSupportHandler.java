package support;

import model.SupportRequest;

public class LowLevelSupportHandler extends SupportHandler {

    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getSeverity().equals("Low")) {
            if (AutomatedResponseSystem.isCommonIssue(request.getIssueType())) {
                System.out.println("Automated Response: Issue " + request.getIssueType() + " is common. Sending pre-written solution.");
                logger.log("LowLevelSupportHandler: Automated response for issue type " + request.getIssueType());
            } else {
                System.out.println("Low-level support is handling the request: " + request);
                logger.log("LowLevelSupportHandler handled the request.");
            }
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}