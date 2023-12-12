package view;

//import model.Admin;

public class AdminView {
    public void printAdminDetails(String adminName, String role) {
        System.out.println("Detalhes do Administrador:");
        System.out.println("Nome do Administrador: " + adminName);
        System.out.println("Função: " + role);
        System.out.println("--------------");
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
