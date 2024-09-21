package model;

public class SupportRequest {
    private String severity;
    private String issueType;
    private String customerId;
    private int timeToResolve; // in minutes
    private int rating = 0;

    public SupportRequest(String severity, String issueType, String customerId, int timeToResolve) {
        this.severity = severity;
        this.issueType = issueType;
        this.customerId = customerId;
        this.timeToResolve = timeToResolve;
    }

    public String getSeverity() {
        return severity;
    }

    public String getIssueType() {
        return issueType;
    }

    public String getCustomerId() {
        return customerId;
    }

    public int getTimeToResolve() {
        return timeToResolve;
    }

    public void escalate() {
        if (severity.equals("Low")) {
            severity = "Medium";
        } else if (severity.equals("Medium")) {
            severity = "High";
        }
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "SupportRequest{" +
                "severity='" + severity + '\'' +
                ", issueType='" + issueType + '\'' +
                ", customerId='" + customerId + '\'' +
                ", timeToResolve=" + timeToResolve +
                ", rating=" + rating +
                '}';
    }
}
