import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class login extends Applet implements ActionListener {
	
	TextField t1 , t2 ;
	Label l1 , l2 , l3 ;
	Button b1 ;
	
	public void init() {
		l1 = new Label("Enter username:");
		t1 = new TextField(20);
		add(l1);
		add(t1);
		
		l2 = new Label("Enter Password");
		t2 = new TextField(20);
		t2.setEchoChar('*');
		add(l2);
		add(t2);
		
		b1 = new Button("LOGIN");
		add(b1);
		b1.addActionListener(this);
		l3 = new Label("Please login");
		add(l3);
	} 
	
	public void actionPerformed (ActionEvent event) {
		if(event.getSource() == b1 ) 
			if (t1.getText().equals("kunal") && t2.getText().equals("12345"))
			{
				l3.setText("login Success!!");
			} else {
				
				l3.setText("Login failed!!");
			}	
		}
	}
	
/*
<applet code="login" width = 300 height = 300>
</applet>
*/
