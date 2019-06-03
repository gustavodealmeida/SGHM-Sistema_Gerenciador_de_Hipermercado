package com.utfpr.sghm.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.utfpr.sghm.controller.EnderecoController;
import com.utfpr.sghm.entidades.Endereco;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EnderecoWindow extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLabel lblCarregarEndereco;
	private JPanel panel;
	private JLabel lblRua;
	private JTextField txtRua;
	private JTextField txtNumero;
	private JTextField txtComplemento;
	private JLabel lblBairro;
	private JTextField txtBairro;
	private JLabel lblCidade;
	private JTextField txtCidade;
	private JLabel lblEstado;
	private JTextField txtEstado;
	private JLabel lblCep;
	private JTextField txtCep;
	private JButton btnListar;
	private JButton btnSelecionar;
	private DefaultTableModel model = new DefaultTableModel(new Object[][] {},
			new String[] { "Id", "Rua", "Numero", "Complemento", "Bairro", "Cidade", "Estado", "CEP" });

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EnderecoWindow frame = new EnderecoWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EnderecoWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 652);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(UIManager.getBorder("Table.scrollPaneBorder"));
		contentPane.add(scrollPane, BorderLayout.SOUTH);

		// ============ Carregar tabela com informações =====================
		table = new JTable();
		table.setModel(model);
		table.getColumnModel().getColumn(0).setPreferredWidth(39);
		table.getColumnModel().getColumn(1).setPreferredWidth(163);
		table.getColumnModel().getColumn(2).setPreferredWidth(60);
		table.getColumnModel().getColumn(3).setPreferredWidth(90);
		table.getColumnModel().getColumn(4).setPreferredWidth(99);
		table.getColumnModel().getColumn(5).setPreferredWidth(99);
		table.getColumnModel().getColumn(6).setPreferredWidth(110);
		table.getColumnModel().getColumn(7).setPreferredWidth(76);
		scrollPane.setViewportView(table);

		// ================== Final da tabela ===============================

		lblCarregarEndereco = new JLabel("Carregar Endereco");
		lblCarregarEndereco.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCarregarEndereco.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblCarregarEndereco, BorderLayout.NORTH);

		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		lblRua = new JLabel("Rua");
		lblRua.setBounds(12, 16, 27, 16);
		panel.add(lblRua);

		txtRua = new JTextField();
		txtRua.setBounds(51, 13, 291, 22);
		panel.add(txtRua);
		txtRua.setColumns(10);

		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setBounds(12, 45, 56, 16);
		panel.add(lblNumero);

		txtNumero = new JTextField();
		txtNumero.setBounds(61, 42, 63, 22);
		panel.add(txtNumero);
		txtNumero.setColumns(10);

		JLabel lblComplemento = new JLabel("Complemento");
		lblComplemento.setBounds(136, 45, 79, 16);
		panel.add(lblComplemento);

		txtComplemento = new JTextField();
		txtComplemento.setBounds(227, 42, 115, 22);
		panel.add(txtComplemento);
		txtComplemento.setColumns(10);

		lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(374, 16, 39, 16);
		panel.add(lblBairro);

		txtBairro = new JTextField();
		txtBairro.setBounds(425, 13, 215, 22);
		panel.add(txtBairro);
		txtBairro.setColumns(10);

		lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(374, 45, 45, 16);
		panel.add(lblCidade);

		txtCidade = new JTextField();
		txtCidade.setBounds(425, 42, 215, 22);
		panel.add(txtCidade);
		txtCidade.setColumns(10);

		lblEstado = new JLabel("Estado");
		lblEstado.setBounds(12, 74, 56, 16);
		panel.add(lblEstado);

		txtEstado = new JTextField();
		txtEstado.setBounds(53, 71, 162, 22);
		panel.add(txtEstado);
		txtEstado.setColumns(10);

		lblCep = new JLabel("CEP");
		lblCep.setBounds(227, 71, 27, 16);
		panel.add(lblCep);

		txtCep = new JTextField();
		txtCep.setBounds(266, 68, 76, 22);
		panel.add(txtCep);
		txtCep.setColumns(10);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(374, 70, 91, 25);
		panel.add(btnCadastrar);
		btnCadastrar.addActionListener(e -> this.create());

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(553, 110, 87, 25);
		panel.add(btnCancelar);
		btnCancelar.addActionListener(e -> System.exit(0)); // Fecha o aplicativo

		JLabel lblFunesAdministrativa = new JLabel("Funções Administrativas:");
		lblFunesAdministrativa.setBounds(12, 114, 155, 16);
		panel.add(lblFunesAdministrativa);

		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setEnabled(true);
		btnAtualizar.setBounds(179, 110, 97, 25);
		panel.add(btnAtualizar);
		btnAtualizar.addActionListener(e -> this.update());

		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.setEnabled(false);
		btnDeletar.setBounds(288, 110, 97, 25);
		panel.add(btnDeletar);
		btnDeletar.addActionListener(e -> this.delete());

		btnListar = new JButton("Listar");
		btnListar.setBounds(468, 70, 71, 25);
		panel.add(btnListar);
		btnListar.addActionListener(e -> this.listar());

		btnSelecionar = new JButton("Selecionar");
		btnSelecionar.setBounds(543, 70, 97, 25);
		panel.add(btnSelecionar);
		btnSelecionar.addActionListener(e -> this.selecionar());

	}

	// Operacoes do CRUD
	private void create() {
		Endereco end = new Endereco();
		end.setRua(txtRua.getText());
		end.setNumero(Integer.parseInt(txtNumero.getText()));
		end.setBairro(txtBairro.getText());
		end.setCidade(txtCidade.getText());
		end.setEstado(txtEstado.getText());
		end.setCep(txtCep.getText());
		end.setComplemento(txtComplemento.getText());

		try {
			new EnderecoController().create(end);
			this.listar();
			JOptionPane.showMessageDialog(this, "Endereço cadastrado com sucesso");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Não foi póssível cadastrar endereço");
			throw e;
		}

	}

	private int id_selecionado; // Auxiliar para mandar o id de quem for selecionado

	private void selecionar() {
		this.id_selecionado = (int) model.getValueAt(table.getSelectedRow(), 0);
		Endereco end = new Endereco();
		txtRua.setText((String) model.getValueAt(table.getSelectedRow(), 1));
		txtNumero.setText((String) Integer.toString((int) model.getValueAt(table.getSelectedRow(), 2)));
		txtComplemento.setText((String) model.getValueAt(table.getSelectedRow(), 3));
		txtBairro.setText((String) model.getValueAt(table.getSelectedRow(), 4));
		txtCidade.setText((String) model.getValueAt(table.getSelectedRow(), 5));
		txtEstado.setText((String) model.getValueAt(table.getSelectedRow(), 6));
		txtCep.setText((String) model.getValueAt(table.getSelectedRow(), 7));

	}

	private void update() {
		Endereco end = new Endereco();
		end.setId(this.id_selecionado);
		end.setRua(txtRua.getText());
		end.setNumero(Integer.parseInt(txtNumero.getText()));
		end.setBairro(txtBairro.getText());
		end.setCidade(txtCidade.getText());
		end.setEstado(txtEstado.getText());
		end.setCep(txtCep.getText());
		end.setComplemento(txtComplemento.getText());

		try {
			new EnderecoController().update(end);
			this.listar();
			JOptionPane.showMessageDialog(this, "Endereço atualizado com sucesso");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Não foi póssível atualizar endereço");
		}
	}

	private void delete() {
		try {
			new EnderecoController().delete((int) model.getValueAt(table.getSelectedRow(), 0));
			this.listar();
			JOptionPane.showMessageDialog(this, "Endereço deletado com sucesso");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Não foi póssível deletar endereço");
		}
	}

	// ============== Inicio listagem enderecos ================
	public void limpaTabela() {
		// limpaTabela
		model.setRowCount(0);
	}

	// funcao para alimentar tabela
	public void listar() {
		limpaTabela();
		try {
			List<Endereco> endLista = new EnderecoController().read();

			for (Endereco end : endLista) {
				model.addRow(new Object[] { end.getId(), end.getRua(), end.getNumero(), end.getComplemento(),
						end.getBairro(), end.getCidade(), end.getEstado(), end.getCep() });
			}
		} catch (Exception e) {
			throw e;
		}
	}
	// ======================= Fim Listagem ======================

}
