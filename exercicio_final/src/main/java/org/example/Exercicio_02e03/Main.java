package org.example.Exercicio_02e03;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.example.Exercicio_02e03.funcoes.Cadastro;
import org.example.Exercicio_02e03.funcoes.Edicao;
import org.example.Exercicio_02e03.funcoes.Exclusao;


public class Main {

    public static void main(String[] args) {
        // Criação da janela principal (JFrame)
        JFrame frame = new JFrame("Sistema de Gerenciamento");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 300);

        // Criação da barra de menu
        JMenuBar menuBar = new JMenuBar();

        // Criação do menu principal
        JMenu menu = new JMenu("Opções");
        menuBar.add(menu);

        // Criação dos itens de menu
        JMenuItem cadastroItem = new JMenuItem("Cadastro");
        JMenuItem edicaoItem = new JMenuItem("Edição");
        JMenuItem exclusaoItem = new JMenuItem("Exclusão");

        // Adicionando itens ao menu
        menu.add(cadastroItem);
        menu.add(edicaoItem);
        menu.add(exclusaoItem);

        // Ações para cada item do menu
        cadastroItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Cadastro cad = new Cadastro();
                cad.abrirCadastro();
            }
        });

        edicaoItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Edicao edit = new Edicao();
                edit.abrirEdicao();
            }
        });

        exclusaoItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Exclusao exc = new Exclusao();
                exc.abrirExclusao();
            }
        });

        // Adiciona a barra de menu à janela principal
        frame.setJMenuBar(menuBar);

        // Exibe a janela principal
        frame.setVisible(true);
    }

}
