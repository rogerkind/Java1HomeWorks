import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.Font;

@SuppressWarnings("serial")
public class GUIGuessWord extends JFrame {
	private final String TITLE = "Guess Word Game";
	private final Font IN_OUT_FONT = new Font("Arial", Font.BOLD, 35);
	private final String HIDE_STRING = "#";
	private final int SIZE_X = 440;
	private final int SIZE_Y = 180;
	private JPanel contentPane = new JPanel();
	private OutputPanel out = new OutputPanel(IN_OUT_FONT,HIDE_STRING);
	private InputPanel in = new InputPanel(IN_OUT_FONT);
	private HelpPanel status = new HelpPanel();
	private ButtonPanel controls = new ButtonPanel();
	
	GUIGuessWord(){
		setTitle(TITLE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(SIZE_X,SIZE_Y);
		setLocationRelativeTo(null); // to the center
        setResizable(false);
        
		 
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
		setVisible(true);
	}

	public HelpPanel getStatus() {
		return status;
	}
	
	public OutputPanel getOut() {
		return out;
	}
	
	public InputPanel getIn() {
		return in;
	}
	
	public ButtonPanel getControls() {
		return controls;
	}
}
