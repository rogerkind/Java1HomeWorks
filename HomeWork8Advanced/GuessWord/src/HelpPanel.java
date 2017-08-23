import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class HelpPanel extends JPanel{
	private JLabel hlpLabel = new JLabel();
	
	HelpPanel(){
		setLayout(new GridLayout(1, 0, 0, 0));
		hlpLabel.setHorizontalAlignment(SwingConstants.LEADING);
		add(hlpLabel);	
	}

}
