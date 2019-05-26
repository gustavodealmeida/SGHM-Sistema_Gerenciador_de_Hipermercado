package com.utfpr.sghm.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Endereco extends JFrame {

	private JPanel contentPane;
	
	//Operacoes do CRUD
	
	private void create() {
		//Implementar a criacao de um endereco
	}
	
	private void read() {
		//Implementar tabela que mostra enderecos
	}
	
	private void update() {
		//Implementar atualizacao de enderecos
	}
	
	private void delete() {
		//Implementar tabela que deleta endereco
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Endereco frame = new Endereco();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Endereco() {
		setTitle("Gerenciamento de Cadastro");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
