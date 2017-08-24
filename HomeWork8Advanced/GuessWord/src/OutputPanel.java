import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class OutputPanel extends JPanel{
	private JLabel[] labels = new JLabel[10];
	private String hideString;
	
	OutputPanel(Font font,String hidestring){
		setLayout(new GridLayout(1, 0, 0, 0));
				this.hideString = hidestring;
		
		for(int i=0;i<labels.length;i++) {
			labels[i]=new JLabel();
			labels[i].setIconTextGap(0);
			labels[i].setFont(font);
			labels[i].setHorizontalAlignment(SwingConstants.CENTER);
			labels[i].setText(hideString);
			add(labels[i]);
		}
	}

	public void reset() {
		for(int i=0;i<labels.length;i++)			
			labels[i].setText(hideString);
	}
	
	public void setLabels(String string) {
		for(int i=0;i<string.length();i++) {
			try {
				labels[i].setText(String.valueOf(string.charAt(i)));
			} catch (StringIndexOutOfBoundsException e) {
				labels[i].setText(this.hideString);
			}
		}
	}
	
	public JLabel[] getLabels() {
		return labels;
	}
	
	
}
