package log;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JsonLog implements LogAdapter {
    private static final String JSON_FILE_PATH = "logs/application_log.json";

    @Override
    public void logOperation(String operation, String name, String user) {
        String logEntry = buildLogEntry(operation, name, user);
        writeLog(logEntry);
    }

    @Override
    public void logFailure(String operation, String name, String user, String message) {
        String logEntry = buildFailureLogEntry(operation, name, user, message);
        writeLog(logEntry);
    }

    private String buildLogEntry(String operation, String name, String user) {
        LocalDateTime now = LocalDateTime.now();
        String formattedDate = now.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

        return String.format("{\"operation\": \"%s\", \"name\": \"%s\", \"timestamp\": \"%s\", \"user\": \"%s\"},", operation, name, formattedDate, user);
    }

    private String buildFailureLogEntry(String operation, String name, String user, String message) {
        return String.format("{\"error\": \"%s\", \"message\": \"Ocorreu a falha %s ao realizar a %s do contato %s, (%s, %s, e %s)\"},", LocalDateTime.now(), message, operation, name, LocalDateTime.now(), LocalDateTime.now(), user);
    }

    private void writeLog(String logEntry) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(JSON_FILE_PATH, true))) {
            writer.println(logEntry);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}