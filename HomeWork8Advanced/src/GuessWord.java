import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;

public class GuessWord extends JFrame {

	private JPanel contentPane;
	private JTextField txt0;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuessWord frame = new GuessWord();
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
	public GuessWord() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 233, 424, 23);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 4, 0, 0));
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		panel.add(btnNewButton_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 35, 402, 35);
		contentPane.add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		
		txt0 = new JTextField();
		panel_1.add(txt0);
		txt0.setText("a");
		txt0.setHorizontalAlignment(SwingConstants.CENTER);
		txt0.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		txt0.setEditable(false);
		txt0.setColumns(10);
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setText("a");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		textField.setEditable(false);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setText("a");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		panel_1.add(textField_2);
		textField_2.setText("a");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		panel_1.add(textField_3);
		textField_3.setText("a");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		panel_1.add(textField_4);
		textField_4.setText("a");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setText("a");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText("a");
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		panel_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setText("a");
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		panel_1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setText("a");
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		panel_1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setText("a");
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		panel_1.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setText("a");
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		panel_1.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setText("a");
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		panel_1.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setText("a");
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		panel_1.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setText("a");
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		panel_1.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setBounds(10, 95, 132, 20);
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(148, 94, 89, 23);
		contentPane.add(btnNewButton_4);
	}
}
