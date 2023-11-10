import java.awt.*;
import java.applet.*;
/*<applet code = CheckboxGroup_Demo.class width = 500 height = 300> </applet>*/  
public class CheckboxGroup_Demo extends Applet 
{
    public void init()
    {
        // CheckboxGroup cbg = new CheckboxGroup();
        Checkbox ch1 = new Checkbox("Naved" , false  );
        Checkbox ch2= new Checkbox("Atharva" , false );
        Checkbox ch3 = new Checkbox(" Abhishek" , false );
        Checkbox ch4 = new Checkbox("Bella" , true);

        add(ch1);
        add(ch2);
        add(ch3);
        add(ch4);
    }
}