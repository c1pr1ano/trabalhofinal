package model;

import java.time.LocalDateTime;

public class Notification {
    private String message;
    private LocalDateTime timestamp;
    private boolean read;

    public Notification(String message) {
        this.message = message;
        this.timestamp = LocalDateTime.now();
        this.read = false;
    }

    // Getters e Setters

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public boolean isRead() {
        return read;
    }

    public void markAsRead() {
        this.read = true;
    }
}