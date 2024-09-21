package support;

import java.util.Arrays;
import java.util.List;

public class AutomatedResponseSystem {

    private static List<String> commonIssues = Arrays.asList("Password Reset", "Connection Issue", "Login Failure");

    public static boolean isCommonIssue(String issueType) {
        return commonIssues.contains(issueType);
    }
}