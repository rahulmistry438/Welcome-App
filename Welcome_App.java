import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class App extends JFrame
{
	Container c;
	JLabel labName, labAns;
	JTextField txtName;
	JButton btnSubmit;

	App()
	{
		c = getContentPane();
		c.setBackground(Color.decode("#ADD8E6"));

		c.setLayout(new FlowLayout());

		labName = new JLabel("Enter name");
		txtName = new JTextField(10);
		btnSubmit = new JButton("Submit");
		labAns = new JLabel("");

		Font f = new Font("Arial", Font.BOLD, 40);
		labName.setFont(f);
		txtName.setFont(f);
		labAns.setFont(f);

		c.add(labName);
		c.add(txtName);
		btnSubmit.setFont(f);
		labAns.setFont(f);

		c.add(labName);
		c.add(txtName);
		c.add(btnSubmit);
		c.add(labAns);

		ActionListener a = (ae) -> {
			String name = txtName.getText();
			String msg = "";
			if(name.length() == 0)
				msg = "You did not enter any name";
			else
				msg = "Welcome " + name;
			labAns.setText(msg);
		};
		btnSubmit.addActionListener(a);
	}
}

class Welcome_App
{
	public static void main(String args[])
	{
		App a = new App();
		a.setSize(500, 400);
		a.setLocationRelativeTo(null);
		a.setTitle("Welcome App by J020_Rahul Mistry_PVPPCOE");
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setVisible(true);
	}
}
