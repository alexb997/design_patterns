package model;

public class SupportRequest {
    private String requestId;
    private int severityLevel;
    private String issueType;
    private String customerId;
    private long escalationTime;
    
    public SupportRequest(String requestId, int severityLevel, String issueType, String customerId, long escalationTime) {
        this.requestId = requestId;
        this.severityLevel = severityLevel;
        this.issueType = issueType;
        this.customerId = customerId;
        this.escalationTime = escalationTime;
    }

    public String getRequestId() {
        return requestId;
    }

    public int getSeverityLevel() {
        return severityLevel;
    }

    public String getIssueType() {
        return issueType;
    }

    public String getCustomerId() {
        return customerId;
    }

    public long getEscalationTime() {
        return escalationTime;
    }

    @Override
    public String toString() {
        return "SupportRequest{" +
                "requestId='" + requestId + '\'' +
                ", severityLevel=" + severityLevel +
                ", issueType='" + issueType + '\'' +
                ", customerId='" + customerId + '\'' +
                '}';
    }
}