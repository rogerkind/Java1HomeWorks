/**
*Класс - коверт для панели ввода "ответа"
*@inherit JPanel
*@author Slava Bugakov
*@version 0.3.0 dated aug 23 year 2017
*/
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing. JFormattedTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class InputPanel extends JPanel {
    
    private  JFormattedTextField txtInField=new JFormattedTextField();;
    
    InputPanel(Font font){
        txtInField.setColumns(10);
        txtInField.setHorizontalAlignment(SwingConstants.LEADING);
        txtInField.setFont(font);
        txtInField.setColumns(1);
        txtInField.setFocusable(true);
        txtInField.setVisible(isFocusable());
        txtInField.setFocusLostBehavior(JFormattedTextField.COMMIT);
        setLayout(new GridLayout(1, 0, 0, 0));
        add(txtInField);
    }
    
    public String getValue() {
        return txtInField.getText();
    }
    @Override
    public void grabFocus() {
        txtInField.grabFocus();
    }
    
    public void reset() {
        txtInField.setText("");
    }
}

