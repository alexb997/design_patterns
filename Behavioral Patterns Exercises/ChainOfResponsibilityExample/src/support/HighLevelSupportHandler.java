package support;

import model.SupportRequest;

public class HighLevelSupportHandler extends SupportHandler {

    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getSeverity().equals("High")) {
            System.out.println("High-level support is handling the request: " + request);
            logger.log("HighLevelSupportHandler handled the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}