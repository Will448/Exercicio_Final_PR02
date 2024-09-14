package org.example.Exercicio_02e03.funcoes;

import javax.swing.*;

public class Exclusao {
    public static void abrirExclusao() {

        JFrame exclusaoFrame = new JFrame("Tela de Exclusão");
        exclusaoFrame.setSize(350, 250);
        exclusaoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Exclusão acessada com sucesso", SwingConstants.CENTER);
        exclusaoFrame.add(label);

        //JOptionPane.showMessageDialog(null, "Exlusao acessado com sucesso");

        exclusaoFrame.setVisible(true);
    }
}



