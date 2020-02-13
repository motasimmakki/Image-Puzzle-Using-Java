import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*;  
public class Puzzle extends JFrame implements ActionListener
{  
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,shuffle;  
	ImageIcon ii1,ii2,ii3,ii4,ii5,ii6,ii7,ii8,ii9;
	Puzzle()
	{  
		super("Image Puzzle");
		ii1=new ImageIcon("profile1.jpg");  
		ii2=new ImageIcon("profile2.jpg");  
		ii3=new ImageIcon("profile3.jpg");  
		ii4=new ImageIcon("profile4.jpg");  
		ii5=new ImageIcon("profile5.jpg");  
		ii6=new ImageIcon("profile6.jpg");  
		ii7=new ImageIcon("profile7.jpg");  
		ii8=new ImageIcon("profile8.jpg");  
		ii9=new ImageIcon("profile9.jpg");  
		
		b1=new JButton(ii5);  
		b2=new JButton(ii4);  
		b3=new JButton(ii1);  
		b4=new JButton(ii6);  
		b5=new JButton(ii9);  
		b6=new JButton(ii7);  
		b7=new JButton(ii3);  
		b8=new JButton(ii8);  
		b9=new JButton(ii2);  
		// b1=new JButton(ii1);  
		// b2=new JButton(ii2);  
		// b3=new JButton(ii3);  
		// b4=new JButton(ii4);  
		// b5=new JButton(ii5);  
		// b6=new JButton(ii6);  
		// b7=new JButton(ii7);  
		// b8=new JButton(ii8);  
		// b9=new JButton(ii9);  
		shuffle=new JButton("SHUFFLE");  
  
		b1.setBounds(20,10,200,200);  
		b2.setBounds(220,10,200,200);  
		b3.setBounds(420,10,200,200);  
		b4.setBounds(20,210,200,200);  
		b5.setBounds(220,210,200,200);  
		b6.setBounds(420,210,200,200);  
		b7.setBounds(20,410,200,200);  
		b8.setBounds(220,410,200,200);  
		b9.setBounds(420,410,200,200);  
		shuffle.setBounds(220,625,200,50);  
    
		add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9); add(shuffle);  
		b1.addActionListener(this);  
		b2.addActionListener(this);  
		b3.addActionListener(this);  
		b4.addActionListener(this);  
		b5.addActionListener(this);  
		b6.addActionListener(this);  
		b7.addActionListener(this);  
		b8.addActionListener(this);  
		b9.addActionListener(this);  
		shuffle.addActionListener(this);  
  
		shuffle.setBackground(Color.black);  
		shuffle.setForeground(Color.green);  
		setSize(660,730);  
		setLayout(null);  
		setVisible(true);  
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}//end of constructor  
  
	public void actionPerformed(ActionEvent e)
	{  
		if(e.getSource()==shuffle){  
			Icon ii=b4.getIcon();  
			b4.setIcon(b9.getIcon());  
			b9.setIcon(ii);  
			ii=b1.getIcon();  
			b1.setIcon(b5.getIcon());  
			b5.setIcon(ii);  
			ii=b2.getIcon();  
			b2.setIcon(b7.getIcon());  
			b7.setIcon(ii);  
		}  
		if(e.getSource()==b1)
		{  
			Icon ii=b1.getIcon();  
			if(b2.getIcon().equals(ii3))
			{
				b2.setIcon(ii); b1.setIcon(ii3);
			}  
			else if(b4.getIcon().equals(ii3))
			{
				b4.setIcon(ii); b1.setIcon(ii3);
			}  
		}//end of if  
	  
		if(e.getSource()==b3)
		{  
			Icon ii=b3.getIcon();  
			if(b2.getIcon().equals(ii3))
			{
				b2.setIcon(ii); b3.setIcon(ii3);
			}  
			else if(b6.getIcon().equals(ii3))
			{
				b6.setIcon(ii); b3.setIcon(ii3);
			}  
		}//end of if  
	  
		if(e.getSource()==b2)
		{  
			Icon ii=b2.getIcon();  
			if(b1.getIcon().equals(ii3))
			{
				b1.setIcon(ii); b2.setIcon(ii3);
			}  
			else if(b3.getIcon().equals(ii3))
			{ 
				b3.setIcon(ii); b2.setIcon(ii3);
			}  
			else if(b5.getIcon().equals(ii3))
			{
				b5.setIcon(ii); b2.setIcon(ii3);
			}  
		}//end of if  
	  
		if(e.getSource()==b4)
		{  
			Icon ii=b4.getIcon();  
			if(b1.getIcon().equals(ii3))
			{
				b1.setIcon(ii); b4.setIcon(ii3);
			}  
			else if(b7.getIcon().equals(ii3))
			{
				b7.setIcon(ii); b4.setIcon(ii3);
			}  
			else if(b5.getIcon().equals(ii3))
			{
				b5.setIcon(ii); b4.setIcon(ii3);
			}  
		}//end of if  
	  
		if(e.getSource()==b5)
		{  
			Icon ii=b5.getIcon();  
			if(b2.getIcon().equals(ii3))
			{
				b2.setIcon(ii); b5.setIcon(ii3);
			}  
			else if(b4.getIcon().equals(ii3))
			{
				b4.setIcon(ii); b5.setIcon(ii3);
			}  
			else if(b6.getIcon().equals(ii3))
			{
				b6.setIcon(ii); b5.setIcon(ii3);
			}  
			else if(b8.getIcon().equals(ii3))
			{
				b8.setIcon(ii); b5.setIcon(ii3);
			}  
		}//end of if  
	  
		if(e.getSource()==b6)
		{  
	  
			Icon ii=b6.getIcon();  
			if(b9.getIcon().equals(ii3))
			{
				b9.setIcon(ii); b6.setIcon(ii3);
			}  
			else if(b3.getIcon().equals(ii3))
			{
				b3.setIcon(ii); b6.setIcon(ii3);
			}  
			else if(b5.getIcon().equals(ii3))
			{
				b5.setIcon(ii); b6.setIcon(ii3);
			}  
	  
		}//end of if  
	  
		if(e.getSource()==b7)
		{  
			Icon ii=b7.getIcon();  
			if(b4.getIcon().equals(ii3))
			{
				b4.setIcon(ii); b7.setIcon(ii3);
			}  
			else if(b8.getIcon().equals(ii3))
			{
				b8.setIcon(ii); b7.setIcon(ii3);
			}  
		}//end of if  
	  
		if(e.getSource()==b8)
		{  
			Icon ii=b8.getIcon();  
			if(b7.getIcon().equals(ii3))
			{
				b7.setIcon(ii); b8.setIcon(ii3);
			}  
			else if(b9.getIcon().equals(ii3))
			{ 
				b9.setIcon(ii); b8.setIcon(ii3);
			}  
			else if(b5.getIcon().equals(ii3))
			{
				b5.setIcon(ii); b8.setIcon(ii3);
			}  
	  
		}//end of if  
	  
		if(e.getSource()==b9)
		{  
			Icon ii=b9.getIcon();  
			if(b6.getIcon().equals(ii3))
			{
				b6.setIcon(ii); b9.setIcon(ii3);
			}  
			else if(b8.getIcon().equals(ii3))
			{
				b8.setIcon(ii); b9.setIcon(ii3);
			}  
	  
		}//end of if  
		
		if(b1.getIcon().equals(ii1)&&b2.getIcon().equals(ii2)&&b3.getIcon()  
			.equals(ii3)&&b4.getIcon().equals(ii4)&&b5.getIcon().equals(ii5)  
			&&b6.getIcon().equals(ii6)&&b7.getIcon().equals(ii7)&&b8.getIcon()  
			.equals(ii8)&&b9.getIcon().equals(ii9))
			{   
			JOptionPane.showMessageDialog(Puzzle.this,"!!!you won!!!");  
		}  
	}//end of actionPerformed  
   
	public static void main(String[] args)
	{  
		new Puzzle();  
	}//end of main  
  
}//end of class