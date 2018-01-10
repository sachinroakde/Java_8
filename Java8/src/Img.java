import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Img extends JFrame 
{
	public static void main(String args[])
	{
		JFrame f=new JFrame();
		ImageIcon imglogo7 = new ImageIcon("F://Student exam Images//Background//Mainback.jpg");
		JLabel back = new JLabel(imglogo7);
		back.setBounds(0, 0, 1380, 700);
		
		f.add(back);
		f.setBounds(0,0,1380,700);
		f.setVisible(true);
	}
}
