import java.awt.event.*;
import javax.swing.*;

class MarvellousListner implements ActionListener
{
    public void actionPerformed(ActionEvent aobj)
			{
				System.out.println("Button clicked...");    // Not a good Practice GUI and CUI s
			}
}

class EventHandlingSeperateClass
{
	public static void main(String A[])
	{
		JFrame fobj = new JFrame("PPA");
		JButton bobj = new JButton("OK");
		
		bobj.setBounds(100,100,150,50);

		bobj.addActionListener(new MarvellousListner());
       

		fobj.add(bobj);
		
		fobj.setSize(400, 300); // width, height

		fobj.setLayout(null);   //Can be Specified as TypesOFLayout : Grid,flow,Matrix 
		fobj.setVisible(true);

		fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}