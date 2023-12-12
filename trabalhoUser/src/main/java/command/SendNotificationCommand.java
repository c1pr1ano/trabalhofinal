package command;

import model.User;
import model.Notification;
import view.UserView;

public class SendNotificationCommand implements Command {
    private User model;
    private UserView view;

    public SendNotificationCommand(User model, UserView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void execute() {
        // Lógica para enviar uma notificação
        //String message = /* lógica para obter a mensagem */;
        //Notification notification = new Notification(message);
        //model.addNotification(notification);
        view.showMessage("Notificação enviada com sucesso.");
    }
}