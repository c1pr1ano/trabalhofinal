package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminInterface extends JFrame {

    public AdminInterface() {
        setTitle("Admin Interface");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Conteúdo da interface do administrador
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel label = new JLabel("Bem-vindo, Administrador!");
        panel.add(label, BorderLayout.CENTER);

        JButton sendNotificationButton = new JButton("Enviar Notificação");
        sendNotificationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para enviar notificação
                JOptionPane.showMessageDialog(AdminInterface.this, "Notificação enviada!");
            }
        });
        panel.add(sendNotificationButton, BorderLayout.SOUTH);

        getContentPane().add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AdminInterface());
    }
}