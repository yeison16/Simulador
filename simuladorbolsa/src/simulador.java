import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import java.awt.Choice;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;


public class simulador {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					simulador window = new simulador();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public simulador() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Public\\Pictures\\Sample Pictures\\Chrysanthemum.jpg"));
		frame.getContentPane().setBackground(new Color(240, 248, 255));
		frame.setBounds(200, 200, 450, 412);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblNombre.setForeground(UIManager.getColor("Button.highlight"));
		lblNombre.setBounds(10, 64, 76, 14);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblApellido.setForeground(UIManager.getColor("Button.highlight"));
		lblApellido.setBounds(10, 89, 76, 14);
		frame.getContentPane().add(lblApellido);
		
		JLabel lblNick = new JLabel("Nick");
		lblNick.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblNick.setForeground(UIManager.getColor("Button.highlight"));
		lblNick.setBounds(10, 114, 46, 14);
		frame.getContentPane().add(lblNick);
		
		JLabel lblSexo = new JLabel("sexo");
		lblSexo.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblSexo.setForeground(UIManager.getColor("Button.highlight"));
		lblSexo.setBounds(10, 139, 46, 14);
		frame.getContentPane().add(lblSexo);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblEdad.setForeground(UIManager.getColor("Button.highlight"));
		lblEdad.setBounds(10, 164, 46, 14);
		frame.getContentPane().add(lblEdad);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblCorreo.setForeground(UIManager.getColor("Button.highlight"));
		lblCorreo.setBounds(10, 189, 76, 20);
		frame.getContentPane().add(lblCorreo);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblContrasea.setForeground(UIManager.getColor("Button.highlight"));
		lblContrasea.setBounds(10, 220, 102, 14);
		frame.getContentPane().add(lblContrasea);
		
		JLabel lblVerificcarContrasea = new JLabel("Verificcar Contrase\u00F1a");
		lblVerificcarContrasea.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblVerificcarContrasea.setForeground(UIManager.getColor("Button.highlight"));
		lblVerificcarContrasea.setBounds(10, 245, 172, 14);
		frame.getContentPane().add(lblVerificcarContrasea);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblTelefono.setForeground(UIManager.getColor("Button.highlight"));
		lblTelefono.setBounds(10, 270, 76, 14);
		frame.getContentPane().add(lblTelefono);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(181, 351, 91, 23);
		frame.getContentPane().add(btnAceptar);
		
		
		
		JRadioButton rdbtnAceptaCondiciones = new JRadioButton("Acepta Condiciones");
		rdbtnAceptaCondiciones.setBounds(33, 301, 168, 23);
		frame.getContentPane().add(rdbtnAceptaCondiciones);
		
		JLabel lblBolsaDeValores = new JLabel("Bolsa De Valores");
		lblBolsaDeValores.setBackground(new Color(245, 245, 245));
		lblBolsaDeValores.setForeground(UIManager.getColor("Button.highlight"));
		lblBolsaDeValores.setFont(new Font("Snap ITC", Font.PLAIN, 18));
		lblBolsaDeValores.setBounds(192, 0, 200, 33);
		frame.getContentPane().add(lblBolsaDeValores);
		
		textField = new JTextField();
		textField.setBounds(137, 63, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(137, 114, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(137, 88, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(137, 269, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(137, 164, 86, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(137, 191, 86, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(137, 219, 86, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(181, 244, 86, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Femennino", "Masculino"}));
		comboBox.setBounds(137, 137, 91, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\Jellyfish.jpg"));
		lblNewLabel.setBounds(0, 0, 442, 387);
		frame.getContentPane().add(lblNewLabel);
	}
}
