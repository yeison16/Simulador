import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;


public class Historial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Historial frame = new Historial();
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
	public Historial() {
		setTitle("Mostrar Historial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 198);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.highlight"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Registrarase");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
			
			
			}

		});
		btnNewButton.setBounds(50, 96, 113, 23);
		contentPane.add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("Logeo");
		btnNewButton_1.setBounds(390, 96, 113, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Invertir");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		btnNewButton_2.setBounds(211, 126, 113, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Historial");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Proceso miProceso = new Proceso();
				miProceso.setVisible(true);
				hide();
				setDefaultCloseOperation(1);
			}
			
		});
		btnNewButton_3.setBounds(598, 126, 113, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblSimuladorDeBolsa = new JLabel("Simulador De Bolsa De Valores ");
		lblSimuladorDeBolsa.setIcon(new ImageIcon("C:\\Users\\Aprendiz\\Desktop\\ultimo2.png"));
		lblSimuladorDeBolsa.setFont(new Font("Imprint MT Shadow", Font.BOLD, 24));
		lblSimuladorDeBolsa.setBounds(0, 11, 764, 74);
		contentPane.add(lblSimuladorDeBolsa);
	}
}
