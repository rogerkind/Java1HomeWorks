import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.Font;
import java.awt.event.*;

@SuppressWarnings("serial")
public class GuessWord extends JFrame{
	private final String TITLE = "Guess Word Game";
	private final Font IN_OUT_FONT = new Font("Arial", Font.BOLD, 35);
	private final String HIDE_STRING = "#";
	private final int SIZE_X = 440;
	private final int SIZE_Y = 180;
	private JPanel contentPane;
	private OutputPanel out = new OutputPanel(IN_OUT_FONT,HIDE_STRING);
	private InputPanel in = new InputPanel(IN_OUT_FONT);
	private HelpPanel status = new HelpPanel();
	private ButtonPanel controls = new ButtonPanel();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GuessWord();
	}
	public GuessWord() {
		setTitle(TITLE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(SIZE_X,SIZE_Y);
		setLocationRelativeTo(null); // to the center
        setResizable(false);
        
		contentPane = new JPanel(); 
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{244, 100};
		gbl_contentPane.rowHeights = new int[] {38, 34, 36};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0};
		contentPane.setLayout(gbl_contentPane);
		
				
		
		contentPane.add(out,new GridBagSettings(0,0));
		contentPane.add(in, new GridBagSettings(0,1));
		contentPane.add(status, new GridBagSettings(0,2));
		contentPane.add(controls, new GridBagSettings(1,0,3));
		controls.getBtnNewGame().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                out.reset();
                status.setMessage("New Game");
            }
        });
		
		controls.getBtnGuess().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                out.setLabels(in.getValue());
                status.setMessage("Guess button pressed");
            }
        });
		
		controls.getBtnExit().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
		setVisible(true);
	}
}

