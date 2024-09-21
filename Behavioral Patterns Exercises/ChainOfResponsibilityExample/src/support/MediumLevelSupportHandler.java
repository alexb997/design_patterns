package support;

import model.SupportRequest;

public class MediumLevelSupportHandler extends SupportHandler {

    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getSeverity().equals("Medium")) {
            System.out.println("Medium-level support is handling the request: " + request);
            logger.log("MediumLevelSupportHandler handled the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}