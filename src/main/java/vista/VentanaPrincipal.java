package vista;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import validaciones.ValidarExpresion1;
import validaciones.ValidarExpresion2;
import validaciones.ValidarExpresion3;
import validaciones.ValidarExpresion4;

//Clase funcional con la base de datos, solo falta renombrar variables
public class VentanaPrincipal extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel titulo, n1, n2, denegado, letraDenegada;
	JTextField text1, text2;
	JButton registrarEntrada1, registrarEntrada2, registrarEntrada3;
	String[][] array = new String[7][7];

	public VentanaPrincipal() {
		setTitle("Automatas");
		setResizable(false);
		/**********************************
		 * Panel Izquierdo y su contenido *
		 **********************************/
		JPanel panelIzquierda = new JPanel();
		panelIzquierda.setBounds(0, 0, 240, 800);
		panelIzquierda.setBackground(new Color(0, 56, 205));
		panelIzquierda.setLayout(null);

		getContentPane().add(panelIzquierda);
		/***********************************
		 * Asignar valores vacios al array *
		 ***********************************/

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 6; j++) {
				array[i][j] = "";
			}
		}

		/*********************************
		 * Contenido del panel principal *
		 *********************************/
		titulo = new JLabel("Bienvenido");
		titulo.setBounds(570, 0, 400, 100);
		titulo.setFont(new Font("Courier New", Font.BOLD, 16));
		titulo.setForeground(Color.WHITE);

		n1 = new JLabel("Ingrese la cadena de texto");
		n1.setBounds(530, 85, 200, 100);
		n1.setForeground(Color.WHITE);
		text1 = new JTextField(10);
		text1.setBounds(520, 200, 220, 30);

		registrarEntrada1 = new JButton("(6|7)*bc(a|bc)");
		registrarEntrada1.setBounds(400, 300, 170, 30);

		registrarEntrada2 = new JButton("bc*d|h|ae");
		registrarEntrada2.setBounds(600, 300, 170, 30);

		registrarEntrada3 = new JButton("bc*d|h|ae");
		registrarEntrada3.setBounds(800, 300, 170, 30);

		denegado = new JLabel();
		denegado.setBounds(570, 220, 400, 50);
		denegado.setForeground(Color.WHITE);

		letraDenegada = new JLabel();
		letraDenegada.setBounds(500, 260, 400, 50);
		letraDenegada.setForeground(Color.WHITE);

		/************************
		 * Creacion de la tabla *
		 ************************/
		DefaultTableModel model = new DefaultTableModel(array, new String[array[0].length]);
		JTable table = new JTable(model);
		table.setBounds(330, 350, 700, 110);
		JScrollPane scrollPane = new JScrollPane(table);

		/********************************
		 * Creacion del panel principal *
		 ********************************/
		Container panel = getContentPane();
		LineBorder borde = new LineBorder(Color.BLACK, 1);
		((JComponent) panel).setBorder(borde);
		panel.setLayout(null);
		panel.add(registrarEntrada1);
		panel.add(registrarEntrada2);
		panel.add(registrarEntrada3);
		panel.add(n1);
		panel.add(text1);
		panel.add(titulo);
		panel.add(denegado);
		panel.add(letraDenegada);
		panel.add(table);
		panel.add(scrollPane);
//		Color de fondo del panel
		panel.setBackground(new Color(45, 45, 45));

		/*************************************************************************
		 * Conjunto de eventos que ocurren al precionar cualquier boton del menu *
		 *************************************************************************/

		/******* Realizar recorrido de automatas ingresados ***************/
		registrarEntrada1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String cadena = text1.getText();
				cadena = cadena.toLowerCase();
				ValidarExpresion4 validar = new ValidarExpresion4();
				array = validar.validarExpresion(text1.getText());
				DefaultTableModel model = new DefaultTableModel(array, new String[array[0].length]);
				table.setModel(model);
				if (validar.estado == 'D') {
					denegado.setText("Cadena aceptada");
					letraDenegada.setText("");
				} else if (!validar.condicion) {
					denegado.setText("Cadena no aceptada");
					letraDenegada.setText("Letras " + validar.denegada + " fuera del conjunto finito de entradas.");
				} else {
					denegado.setText("Cadena no aceptada");
					letraDenegada.setText("");
				}
			}
		});
		registrarEntrada2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String cadena = text1.getText();
				cadena = cadena.toUpperCase();
				ValidarExpresion2 validar = new ValidarExpresion2();
				array = validar.validarExpresion(text1.getText());
				DefaultTableModel model = new DefaultTableModel(array, new String[array[0].length]);
				table.setModel(model);
				if (validar.estado == 'C') {
					denegado.setText("Cadena aceptada");
					letraDenegada.setText("");
				} else if (!validar.condicion) {
					denegado.setText("Cadena no aceptada");
					letraDenegada.setText("Letras " + validar.denegada + " fuera del conjunto finito de entradas.");
				} else {
					denegado.setText("Cadena no aceptada");
					letraDenegada.setText("");
				}
			}
		});

		registrarEntrada3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String cadena = text1.getText();
				cadena = cadena.toUpperCase();
				ValidarExpresion3 validar = new ValidarExpresion3();
				array = validar.validarExpresion(text1.getText());
				DefaultTableModel model = new DefaultTableModel(array, new String[array[0].length]);
				table.setModel(model);
				if (validar.estado == 'C') {
					denegado.setText("Cadena aceptada");
					letraDenegada.setText("");
				} else if (!validar.condicion) {
					denegado.setText("Cadena no aceptada");
					letraDenegada.setText("Letras " + validar.denegada + " fuera del conjunto finito de entradas.");
				} else {
					denegado.setText("Cadena no aceptada");
					letraDenegada.setText("");
				}
			}
		});
	}

}
