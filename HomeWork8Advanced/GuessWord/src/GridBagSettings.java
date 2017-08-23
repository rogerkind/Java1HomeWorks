import java.awt.GridBagConstraints;
import java.awt.Insets;

@SuppressWarnings("serial")
public class GridBagSettings extends GridBagConstraints {

	GridBagSettings(int gridX,int gridY){
		insets = new Insets(0, 0, 0, 0);
		fill = GridBagConstraints.BOTH;
		gridx = gridX;
		gridy = gridY;
	}
	
	GridBagSettings(int gridX,int gridY,int height){
		gridheight = height;
		insets = new Insets(0, 0, 0, 0);
		fill = GridBagConstraints.BOTH;
		gridx = gridX;
		gridy = gridY;
	}
}
