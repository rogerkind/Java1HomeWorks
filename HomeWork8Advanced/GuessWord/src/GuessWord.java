import java.awt.event.*;


public class GuessWord {

	private GUIGuessWord gui = new GUIGuessWord(); 
	
	public static void main(String[] args) {
		new GuessWord();
	}
	
	public GuessWord() {
		
		gui.getControls().getBtnNewGame().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gui.getOut().reset();;
                gui.getStatus().setMessage("NewGame");
            }
        });
		
		gui.getControls().getBtnGuess().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	gui.getOut().setLabels(gui.getIn().getValue());
            	gui.getStatus().setMessage("Guess button pressed");
            }
        });
		
		gui.getControls().getBtnExit().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

	}
}

