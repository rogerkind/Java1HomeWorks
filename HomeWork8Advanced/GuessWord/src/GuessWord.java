/**
 * 
 */

import java.awt.event.*;

public class GuessWord {
	
	private final String NEW_GAME_MSG = "New game started";
	private final String EMPTY_ANSWER_MSG="Dont be shy try to guess!";
	private final String CONTINUE_MSG = "You answer: ";
	private final String WIN_MSG="You win!";
	private final String[] WORDS = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
									"broccoli", "carrot", "cherry", "garlic", "grape", "melon",
									"leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
									"peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    private GUIGuessWord gui = new GUIGuessWord(); 
	private String settedword;
	private String answer;
	
	public static void main(String[] args) {
		new GuessWord();
	}
	
	public GuessWord() {
		settedword= WORDS[(int)(Math.random() * WORDS.length)];
		
		//New game pressed
		gui.getControls().getBtnNewGame().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	settedword= WORDS[(int)(Math.random() * WORDS.length)];
            	gui.getOut().reset();
            	gui.getIn().reset();
            	gui.getIn().grabFocus();
                gui.getStatus().setMessage(NEW_GAME_MSG);
               
            }
        });
		//Guess pressed
		gui.getControls().getBtnGuess().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	answer=gui.getIn().getValue().toLowerCase().trim();
            	if(!answer.isEmpty()){
            		if(isRightAnswer()) {
            			gui.getOut().setLabels(settedword);
            			gui.getStatus().setMessage(WIN_MSG);
            			
            			
            		}
            		else {
            			gui.getOut().setLabels(makeClue());
            			gui.getIn().reset();
            			gui.getIn().grabFocus();
            			gui.getStatus().setMessage(CONTINUE_MSG+answer);
            		}
            	}
            	else {
            		gui.getStatus().setMessage(EMPTY_ANSWER_MSG);	
            	}
            }
        });
		//Exit
		gui.getControls().getBtnExit().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
		
		gui.getIn().grabFocus();
	}
	
	
	
	private boolean isRightAnswer(){
	       return (settedword.equals(answer))?true:false;
	} 
	
	private String makeClue(){
        String clue="";
        for(int i=0;i<gui.getOut().getLabels().length;i++){
            try{
                if(settedword.charAt(i)==answer.charAt(i))clue+=settedword.charAt(i);
                else clue+="#";    
            }
            catch(StringIndexOutOfBoundsException e){
                clue+="#";
            }
            
        }
        return clue;    
    }
	
}

