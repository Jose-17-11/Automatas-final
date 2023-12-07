package vista;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		VentanaPrincipal sm = new VentanaPrincipal();
		sm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sm.setVisible(true);
		sm.setBounds(50, 50, 1150, 700);
	}
}	