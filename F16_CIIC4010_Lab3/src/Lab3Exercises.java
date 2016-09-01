import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Cristian G. Duque Gonzalez");
		 MyPanelClass myPanel = new MyPanelClass();
         myFrame.getContentPane().add(myPanel);
		//myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//		myFrame.setLocation(200, 200);
		myFrame.setSize(300, 200);
		myFrame.setLocationRelativeTo(null);
		myFrame.setVisible(true);
	}
}