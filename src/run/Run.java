/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import casestudentmanagement.view.Login;

/**
 *
 * @author Hieu
 */
public class Run {
    public static void main(String[] args) {
//        Login login = new Login();
//        login.setLocationRelativeTo(null);
//        login.setVisible(true);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
}
