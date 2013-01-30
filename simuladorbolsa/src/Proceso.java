import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;


public class Proceso extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLabel lblAcciones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proceso frame = new Proceso();
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
	public Proceso() {
		setResizable(false);
		setTitle("Acciones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 284, 252);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		String fs= System.getProperty("file.separator");
		
		lblAcciones = new JLabel("Acciones");
		lblAcciones.setForeground(new Color(245, 245, 245));
		lblAcciones.setFont(new Font("Arial Black", Font.ITALIC, 15));
		lblAcciones.setBounds(78, 24, 120, 14);
		contentPane.add(lblAcciones);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 11));
		table.setBackground(Color.WHITE);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Titulo", "Valor"},
				{"Coca-Cola", "50.000"},
				{"SENA", "50.000"},
				{"Adobe System", "50.000"},
				{"American Express", "50.000"},
				{null, null},
			},
			new String[] {
				"Titulo", "New column"
			}
		));
		table.setBounds(10, 63, 253, 96);
		contentPane.add(table);
		
		JLabel lblNewLabel_1 = new JLabel("image");
		lblNewLabel_1.setIcon(new ImageIcon("imagenes"+fs+"bolsa2.png"));
		lblNewLabel_1.setBounds(0, 0, 413, 225);
		contentPane.add(lblNewLabel_1);
		
	}
}
