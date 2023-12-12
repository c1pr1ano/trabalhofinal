public class Main {
    public static void main(String[] args) {
        // Criar instância da view
        UserView userView = new UserView();

        // Criar instância do modelo (usuário)
        User user = new User("nomeUsuario", "senha", "Usuario");

        // Criar instância do controlador
        UserController userController = new UserController(user, userView);

        // Exemplo de uso do controlador e da view
        userController.changePassword("novaSenha");

        // Exibir detalhes do usuário após a alteração da senha
        userView.printUserDetails(user.getUsername(), user.getRole());
    }
}