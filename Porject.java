import java.applet.*;
import java.awt.*;
/*<applet code = Porject.class width = 500 height = 300> </applet>*/  

public class Porject extends Applet
{
    public void init()
    {
        setLayout(null);
        setLayout(new BorderLayout());
        TextField gwa = new TextField( 50 );
        Button mk = new Button("Dabao");
        
        add(gwa,BorderLayout.SOUTH);
        add(mk);
    }

}