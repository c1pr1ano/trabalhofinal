/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalhofinalprojeto;

import static DAO.connect.connect;
import view.login;
import javax.swing.JFrame;

/**
 *
 * @author batis
 */
public class TrabalhoFinalProjeto {

    public static void main(String[] args) {
        connect();
        login telaLogin = new login();
       telaLogin.setVisible(true);

    }
}
