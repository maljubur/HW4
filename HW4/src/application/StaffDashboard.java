package application;

import java.util.*;

/**
 * The StaffDashboard class simulates basic features for a staff member
 * to review posts, private feedback, flagged content, and track issue statuses.
 */
public class StaffDashboard {

    private List<String> posts;
    private List<String> privateFeedback;
    private Map<String, String> issueStatus;

    /**
     * Initializes sample data for the posts, feedback, and issue statuses.
     */
    public StaffDashboard() {
        posts = new ArrayList<>();
        privateFeedback = new ArrayList<>();
        issueStatus = new HashMap<>();

        // Sample posts
        posts.add("[Question] How do I reset my password?");
        posts.add("[Answer] You can reset your password under Account Settings.");

        // Sample private feedback
        privateFeedback.add("Student said: This answer was unclear.");
        privateFeedback.add("Reviewer noted: The question was vague.");

        // Sample issue statuses
        issueStatus.put("Q123", "open");
        issueStatus.put("A234", "in progress");
    }

    /**
     * Returns all questions and answers available to staff.
     * @return List of posts
     */
    public List<String> getAllPosts() {
        return posts;
    }

    /**
     * Returns all private feedback from users.
     * @return List of feedback messages
     */
    public List<String> getPrivateFeedback() {
        return privateFeedback;
    }

    /**
     * Returns a list of alerts for flagged content.
     * @return List of flagged alerts
     */
    public List<String> getFlaggedAlerts() {
        return Arrays.asList(
            "Alert: Question Q123 flagged by 2 users.",
            "Alert: Feedback marked as inappropriate."
        );
    }

    /**
     * Updates the issue status of a post (e.g., question or answer).
     * @param issueId ID of the item
     * @param status New status (e.g., resolved, in progress)
     */
    public void updateIssueStatus(String issueId, String status) {
        issueStatus.put(issueId, status);
    }

    /**
     * Returns the current status of a post (question/answer).
     * @param issueId ID of the item
     * @return Current status
     */
    public String getIssueStatus(String issueId) {
        return issueStatus.getOrDefault(issueId, "unknown");
    }
}

