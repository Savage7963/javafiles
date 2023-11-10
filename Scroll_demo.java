import java.awt.*;
import java.applet.*;
/* 
	<applet code = "Scroll_demo" width="500" height = "500" > </applet>
*/

public class Scroll_demo extends Applet 
{
	 public void init()
	{
		Scrollbar sb1=new Scrollbar(Scrollbar.VERTICAL,023,1,0,220);
		Scrollbar sb2=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,50);
		add(sb1);
		add(sb2);
	}
}