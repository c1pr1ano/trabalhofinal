package observer;

import view.NotificationView;

public class NotificationObserver implements Observer {
    private NotificationView view;

    public NotificationObserver(NotificationView view) {
        this.view = view;
    }

    @Override
    public void update() {
        view.displayNotifications(); // Método a ser chamado quando houver uma atualização
    }
}