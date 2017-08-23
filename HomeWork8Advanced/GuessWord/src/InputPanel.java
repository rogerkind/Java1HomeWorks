import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class InputPanel extends JPanel {
	private JTextField txtInField= new JTextField();
		
	InputPanel(Font font){
		txtInField.setHorizontalAlignment(SwingConstants.LEADING);
		txtInField.setFont(font);
		txtInField.setColumns(1);
		setLayout(new GridLayout(1, 0, 0, 0));
		add(txtInField);
	}
	
	public String getValue() {
		return txtInField.getText();
	}
}
