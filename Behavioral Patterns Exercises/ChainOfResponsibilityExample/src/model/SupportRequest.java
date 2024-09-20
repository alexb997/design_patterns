package model;

public class SupportRequest {
    private String requestId;
    private int severityLevel;
    private String issueType;
    private String customerId;
    private long escalationTime;
    private int customerRating;
    
    public SupportRequest(String requestId, int severityLevel, String issueType, String customerId, long escalationTime) {
        this.requestId = requestId;
        this.severityLevel = severityLevel;
        this.issueType = issueType;
        this.customerId = customerId;
        this.escalationTime = escalationTime;
        this.customerRating = -1;
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

    public void setCustomerRating(int rating) {
        this.customerRating = rating;
    }

    public int getCustomerRating() {
        return customerRating;
    }

    @Override
    public String toString() {
        return "SupportRequest{" +
                "requestId='" + requestId + '\'' +
                ", severityLevel=" + severityLevel +
                ", issueType='" + issueType + '\'' +
                ", customerId='" + customerId + '\'' +
                ", customerRating=" + (customerRating != -1 ? customerRating : "Not rated") + 
                '}';
    }
}
