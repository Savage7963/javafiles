import java.awt.*;
import java.applet.*;
/* 
	<applet code = "Textfield_demo" width="500" height = "500" > </applet>
*/

public class Textfield_demo extends Applet 
{
	 public void init()
	{ 
		TextField tf1=new TextField("this is text field ");
		TextField tf2=new TextField("Passowrd");
		tf2.setEchoChar('*');
		add(tf1);
		add(tf2);
	}
}