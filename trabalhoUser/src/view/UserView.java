package view;

import model.User;

public class UserView {
    public void printUserDetails(String userName, String role) {
        System.out.println("Detalhes do Usuário:");
        System.out.println("Nome de Usuário: " + userName);
        System.out.println("Função: " + role);
        System.out.println("--------------");
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}