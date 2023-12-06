package vista;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
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

import lexico.Evaluar;
import testeos.Sintactico;
import validaciones.ValidarExpresion5;
import validaciones.ValidarExpresion6;

//Clase funcional con la base de datos, solo falta renombrar variables
public class VentanaPrincipal extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel titulo, n1, n2, denegado, letraDenegada, lexicoR, sintacticoR;
	JTextField text1, text2;
	JButton registrarEntrada;
	String[][] array = new String[7][7];
	String[][] array2 = new String[7][7];
	boolean end;

	public VentanaPrincipal() {
		setTitle("Automatas");
		setResizable(false);
		
		JLabel imagenLabel = new JLabel();
		ImageIcon imagenIcon = new ImageIcon("/home/jose-manuel/eclipse-workspace/Automatas-final/src/main/java/IMAGES/b.png");
		imagenLabel.setIcon(imagenIcon);
		imagenLabel.setBounds(750, 50, 344, 147);
		
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 6; j++) {
				array[i][j] = "";
			}
		}

		/*********************************
		 * Contenido del panel principal *
		 *********************************/
		titulo = new JLabel("Bienvenido");
		titulo.setBounds(180, 0, 400, 100);
		titulo.setFont(new Font("Courier New", Font.BOLD, 16));
		titulo.setForeground(Color.WHITE);

		n1 = new JLabel("Ingrese la cadena de texto");
		n1.setBounds(150, 75, 200, 100);
		n1.setForeground(Color.WHITE);
		text1 = new JTextField(10);
		text1.setBounds(50, 150, 400, 50);
		text1.setBackground(Color.LIGHT_GRAY);

		registrarEntrada = new JButton("Calcular");
		registrarEntrada.setBounds(50, 200, 170, 30);

		denegado = new JLabel();
		denegado.setBounds(475, 150, 400, 50);
		denegado.setForeground(Color.WHITE);

		letraDenegada = new JLabel();
		letraDenegada.setBounds(500, 260, 400, 50);
		letraDenegada.setForeground(Color.WHITE);
		
		lexicoR = new JLabel();
		lexicoR.setBounds(50, 300, 220, 30);
		lexicoR.setForeground(Color.WHITE);

		sintacticoR = new JLabel();
		sintacticoR.setBounds(400, 300, 420, 30);
		sintacticoR.setForeground(Color.WHITE);

		/************************
		 * Creacion de la tabla *
		 ************************/
		DefaultTableModel model = new DefaultTableModel(array, new String[array[0].length]);
		JTable table = new JTable(model);
		table.setBounds(50, 400, 700, 110);
		JScrollPane scrollPane = new JScrollPane(table);

		/********************************
		 * Creacion del panel principal *
		 ********************************/
		Container panel = getContentPane();
		LineBorder borde = new LineBorder(Color.BLACK, 1);
		((JComponent) panel).setBorder(borde);
		panel.setLayout(null);
		panel.add(imagenLabel);
		panel.add(registrarEntrada);
		panel.add(n1);
		panel.add(text1);
		panel.add(titulo);
		panel.add(denegado);
		panel.add(letraDenegada);
		panel.add(lexicoR);
		panel.add(sintacticoR);
		panel.add(table);
		panel.add(scrollPane);
//		Color de fondo del panel
		panel.setBackground(new Color(0, 0, 0));

		/*************************************************************************
		 * Conjunto de eventos que ocurren al precionar cualquier boton del menu *
		 *************************************************************************/
		registrarEntrada.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				/*	Recorrido del automata*/
				String cadena = text1.getText();
//				cadena = cadena.toUpperCase();
				ValidarExpresion5 validar = new ValidarExpresion5();
				ValidarExpresion6 validar2 = new ValidarExpresion6();
//				ValidarExpresion7 validar = new ValidarExpresion7();
//				ValidarExpresion8 validar = new ValidarExpresion8();
//				ValidarExpresion9 validar = new ValidarExpresion9();
//				ValidarExpresion10 validar = new ValidarExpresion10();
//				ValidarExpresion11 validar = new ValidarExpresion11();
//				ValidarExpresion12 validar = new ValidarExpresion12();
//				ValidarExpresion13 validar = new ValidarExpresion13();
//				ValidarExpresion14 validar = new ValidarExpresion14();
//				ValidarExpresion15 validar = new ValidarExpresion15();
				
				array2 = validar.validarExpresion(text1.getText());
				array2 = validar2.validarExpresion(text1.getText());
				DefaultTableModel model = new DefaultTableModel(array, new String[array[0].length]);
				table.setModel(model);
				if (validar.estado == 'C') {
					array2 = validar.validarExpresion(text1.getText());
					denegado.setText("Automata aceptado");
					array = array2;
				} else if (validar2.estado == 'D'){
					array2 = validar2.validarExpresion(text1.getText());
					denegado.setText("Automata aceptado");
					array = array2;
				}else if (!validar.condicion) {
					denegado.setText("Automata no aceptado");
//					letraDenegada.setText("Letras " + validar.denegada + " fuera del conjunto finito de entradas.");
				} else {
					denegado.setText("Automata no aceptada");
					letraDenegada.setText("");
				}
				/*	Analizador Lexico*/
				Evaluar evaluar = new Evaluar();
				Sintactico sintaxis = new Sintactico();
				String sintactico = sintaxis.sintactico(cadena);
				try {
					
					sintacticoR.setText(sintactico);
					
					boolean ev = evaluar.lexico(cadena);
					if(ev) {
						System.out.println(ev);
						lexicoR.setText("El lexico es correcto");
					}else {
						lexicoR.setText("El lexico no es correcto");
						System.out.println(ev);
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
	}

}
