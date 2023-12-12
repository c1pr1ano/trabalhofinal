package command;

import model.User;
import view.UserView;

public class ChangePasswordCommand implements Command {
    private User model;
    private UserView view;

    public ChangePasswordCommand(User model, UserView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void execute() {
        // Lógica para alterar a senha do usuário
        //String newPassword = /* lógica para obter a nova senha */;
        model.setPassword(newPassword);
        view.showMessage("Senha alterada com sucesso.");
    }
}