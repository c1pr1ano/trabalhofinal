import java.util.List;

import model.Notification;
import model.User;

public class NotificationDao {
    // Implement the methods for interaction with the database or persistence here

    public void saveNotification(Notification notification) {
        // Logic to save a notification to the database
    }

    public List<Notification> getUnreadNotifications(User user) {
        // Logic to retrieve unread notifications for a specific user from the database
        return null;
    }

    public void markNotificationAsRead(Notification notification) {
        // Logic to mark a notification as read in the database
    }
}