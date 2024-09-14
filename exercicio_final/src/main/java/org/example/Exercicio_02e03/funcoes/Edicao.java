package org.example.Exercicio_02e03.funcoes;

import javax.swing.*;

public class Edicao {
    // Método para abrir a tela de Edição
    public static void abrirEdicao() {
        JFrame edicaoFrame = new JFrame("Tela de Edição");
        edicaoFrame.setSize(350, 200);
        edicaoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Edição acessada com sucesso", SwingConstants.CENTER);
        edicaoFrame.add(label);

        //JOptionPane.showMessageDialog(null, "Edição acessada com sucesso");

        edicaoFrame.setVisible(true);
    }
}
