package org.example.Exercicio_02e03.funcoes;

import javax.swing.*;

public class Cadastro {
    // Método para abrir a tela de Cadastro
    public static void abrirCadastro() {
        JFrame cadastroFrame = new JFrame("Tela de Cadastro");
        cadastroFrame.setSize(350, 200);
        cadastroFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label1 = new JLabel("Cadastro acessado com sucesso");
        cadastroFrame.add(label1);
        //JOptionPane.showMessageDialog(null, "Cadastro acessado com sucesso");

        cadastroFrame.setVisible(true);


    }
}
