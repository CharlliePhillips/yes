import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Yes{
	static JFrame yesFrame;
	static JButton yes;
	static Font  f = new Font("Comic Sans MS", Font.PLAIN, 48);
	static boolean yesOrNo = false;
	static int frameSkip = 0;
	public static void main(String args[]) {
		ButtonListener howToyes = new ButtonListener();
		yesFrame = new JFrame("The yes Button"); 
		yesFrame.setLayout(new BorderLayout()); 
		yes = new JButton("yes");
		yes.addActionListener(howToyes);
		yesFrame.add(yes);
		
		yesFrame.setResizable(false);
		yesFrame.setSize(450, 200);    
		yesFrame.setVisible(true);
		yesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while(!yesOrNo){
			if(frameSkip == 10000000) {
				yes();
				frameSkip = 0;
			}
			frameSkip++;
		}
	}
	
	public static void yes() {
		JFrame newyes = new JFrame("Yes"); 
		newyes.setLayout(new BorderLayout());
		JLabel yesText = new JLabel("yes");
		yesText.setFont(f);
		
		newyes.add(yesText);
		
		int xPos = (int)Math.floor(Math.random()*(1920-0+1)+0);
		int yPos = (int)Math.floor(Math.random()*(1080-0+1)+0);
		
		newyes.setLocation(xPos, yPos);
		newyes.setResizable(false);
		newyes.setSize(100, 100);    
		newyes.setVisible(true);
	}
	private static class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
				yesOrNo = true;
			
		}
		
	}
}

