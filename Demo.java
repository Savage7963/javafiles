import java.awt.*;
class Demo extends Frame
{
    public Demo ()
    {
        Button b = new Button("Ajunaved");
        b.setBounds(60, 90, 60 , 40);
        add(b);
        setSize(300,300);
        setLayout(null);
        setVisible(true);

        
    }
    public static void main(String args[])
    {
        Demo d = new Demo();
        
    }
}