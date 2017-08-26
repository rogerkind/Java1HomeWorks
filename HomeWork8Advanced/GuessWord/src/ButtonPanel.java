/**
*Класс - коверт для панели с кнопками
*@inherit JPanel
*@author Slava Bugakov
*@version 0.1.0 dated aug 22 year 2017
*/

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class ButtonPanel extends JPanel {
    private final String BTN_EXIT = "Exit";
    private final String BTN_NEW = "New game";
    private final String BTN_GUESS = "Guess word";
    private JButton btnExit = new JButton(BTN_EXIT);
    private JButton btnNewGame = new JButton(BTN_NEW);
    private JButton btnGuess = new JButton(BTN_GUESS);
    
    ButtonPanel(){
        setLayout(new GridLayout(0, 1, 0, 0));
        btnExit.setMnemonic(BTN_EXIT.charAt(1));
        btnNewGame.setMnemonic(BTN_NEW.charAt(0));
        btnGuess.setMnemonic(BTN_GUESS.charAt(0));
        add(btnNewGame);
        add(btnGuess);
        add(btnExit);
    }
    
    public JButton getBtnExit(){
        return btnExit;
    }
    
    public JButton getBtnGuess(){
        return btnGuess;
    }
    
    public JButton getBtnNewGame(){
        return btnNewGame;
    }

}
