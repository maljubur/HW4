package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.util.List;

/**
 * JUnit 5 test class for StaffDashboard.
 */
public class StaffDashboardTest {
	
	private StaffDashboard dashboard;

    @BeforeEach
    public void setUp() {
    	dashboard = new StaffDashboard();
    }

    @Test
    public void testGetAllPosts() {
        List<String> posts = dashboard.getAllPosts();
        assertNotNull(posts);
        assertFalse(posts.isEmpty());
        assertTrue(posts.get(0).contains("[Question]"));
    }

    @Test
    public void testGetPrivateFeedback() {
        List<String> feedback = dashboard.getPrivateFeedback();
        assertNotNull(feedback);
        assertEquals(2, feedback.size());
    }

    @Test
    public void testGetFlaggedAlerts() {
        List<String> alerts = dashboard.getFlaggedAlerts();
        assertNotNull(alerts);
        assertTrue(alerts.size() >= 1);
        assertTrue(alerts.get(0).startsWith("Alert"));
    }

    @Test
    public void testUpdateAndGetIssueStatus() {
        dashboard.updateIssueStatus("Q123", "resolved");
        assertEquals("resolved", dashboard.getIssueStatus("Q123"));
    }

    @Test
    public void testUnknownIssueStatus() {
        assertEquals("unknown", dashboard.getIssueStatus("fakeID"));
    }
}


