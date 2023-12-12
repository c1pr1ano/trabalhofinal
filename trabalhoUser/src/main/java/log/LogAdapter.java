package main.java.log;

public interface LogAdapter {
    void logOperation(String operation, String name, String user);
    void logFailure(String operation, String name, String user, String message);
}