package demostracion;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Ejemplo1 extends JFrame {

	private JPanel contentPane;
	private JTextField inpNumero1;
	private JTextField inpNumero2;
	private JTextField inpiteraciones;
	private JTextArea varSerie;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Ejemplo1 frame = new Ejemplo1();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public Ejemplo1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(66, 229, 89, 23);
		contentPane.add(btnSalir);
		
		inpNumero1 = new JTextField();
		inpNumero1.setBounds(139, 33, 96, 20);
		contentPane.add(inpNumero1);
		inpNumero1.setColumns(10);
		
		JLabel lblNumero1 = new JLabel("Numero1:");
		lblNumero1.setBounds(66, 36, 49, 14);
		contentPane.add(lblNumero1);
		
		JLabel lblNumero2 = new JLabel("Numero2:");
		lblNumero2.setBounds(66, 67, 49, 14);
		contentPane.add(lblNumero2);
		
		inpNumero2 = new JTextField();
		inpNumero2.setColumns(10);
		inpNumero2.setBounds(139, 64, 96, 20);
		contentPane.add(inpNumero2);
		
		JLabel lblIteraciones = new JLabel("Iteraciones:");
		lblIteraciones.setBounds(55, 95, 70, 14);
		contentPane.add(lblIteraciones);
		
		inpiteraciones = new JTextField();
		inpiteraciones.setColumns(10);
		inpiteraciones.setBounds(139, 92, 96, 20);
		contentPane.add(inpiteraciones);
		
		JButton btnGenerar = new JButton("Generar");
		btnGenerar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String varNumero1 = inpNumero1.getText();
				String varNumero2 = inpNumero2.getText();
				String varIteraciones = inpiteraciones.getText();
				String Cadena= " ";
				int varNumero1I = Integer.parseInt(varNumero1);
				int varNumero2I = Integer.parseInt(varNumero2);
				int varIteraI = Integer.parseInt(varIteraciones);
				int Suma = 0;
				int X=0;
				Cadena = varNumero1 +" "+ varNumero2;
				do
			    {
			        Suma = varNumero1I + varNumero2I;
			      Cadena = Cadena +" "+ Suma;
			       varNumero1I = varNumero2I;
			        varNumero2I = Suma;
			       X++;
			    }
			   while (X < varIteraI);
				varSerie.setText(Cadena);
			}
		});
		btnGenerar.setBounds(183, 229, 89, 23);
		contentPane.add(btnGenerar);
		
		varSerie = new JTextArea();
		varSerie.setBounds(55, 138, 251, 62);
		contentPane.add(varSerie);
	}
}
