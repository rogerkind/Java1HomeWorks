import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.*;

public class GuessWord extends JFrame{
	private final Font IN_OUT_FONT = new Font("Arial", Font.BOLD, 35);
	private final String HIDE_STRING = "#";
	private final int SIZE_X = 440;
	private final int SIZE_Y = 180;
	private JPanel contentPane;
	private JTextField txtInField;
	private OutputPanel out = new OutputPanel(IN_OUT_FONT,HIDE_STRING);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GuessWord();
	}
	public GuessWord() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(SIZE_X,SIZE_Y);
		setLocationRelativeTo(null); // to the center
        setResizable(false);
        
		contentPane = new JPanel(); contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{244, 100};
		gbl_contentPane.rowHeights = new int[] {38, 34, 36};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0};
		contentPane.setLayout(gbl_contentPane);
		
				
		
		contentPane.add(out,new GridBagSettings(0,0));
		
		
		JPanel inPanel = new JPanel();
		contentPane.add(inPanel, new GridBagSettings(0,1));
		inPanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		txtInField = new JTextField();
		txtInField.setHorizontalAlignment(SwingConstants.LEADING);
		txtInField.setFont(IN_OUT_FONT);
		inPanel.add(txtInField);
		txtInField.setColumns(1);
		
		JPanel btnPanel = new JPanel();
		contentPane.add(btnPanel, new GridBagSettings(1,0,3));
		btnPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewGame = new JButton("New Game");
		btnNewGame.setMnemonic('N');
		btnPanel.add(btnNewGame);
		btnNewGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                out.reset();
            }
        });
		
		JButton btnGuess = new JButton("Guess Word");
		btnGuess.setMnemonic('G');
		btnPanel.add(btnGuess);
		btnGuess.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                out.setLabels("init");
            }
        });
		
		JButton btnExit = new JButton("Exit");
		btnExit.setMnemonic('E');
		btnPanel.add(btnExit);
		btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
		
		JPanel helpPanel = new JPanel();
		contentPane.add(helpPanel, new GridBagSettings(0,2));
		helpPanel.setLayout(new GridLayout(1, 0, 0, 0));
		JLabel hlpLabel = new JLabel("Some Text");
		helpPanel.add(hlpLabel);
		
		
		setVisible(true);
	}
}

