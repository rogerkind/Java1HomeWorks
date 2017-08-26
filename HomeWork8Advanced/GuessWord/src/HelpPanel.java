/**
*Класс - коверт для панели вывода
*@inherit JPanel
*@author Slava Bugakov
*@version 0.1.0 dated aug 22 year 2017
*/
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
    
    public void setMessage(String message) {
        hlpLabel.setText(message);
    }
}
