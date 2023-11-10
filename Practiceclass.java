import java.awt.*;
class Practiceclass extends Frame
{
    public Practiceclass()
    {
        Label l1 = new Label("Enter");
        add(l1); // we add a add method to add in applet
        l1.setBounds(90, 90, 60 , 40); //this method helps to set the position i.e. bounds
        setLayout(null); 
        setVisible(true);

        // text one 
        TextField t1 = new TextField("Sanket");
        add(t1); // we add a add method to add in applet
        t1.setBounds(95,30 , 70 , 40); //this method helps to set the position i.e. bounds
        setLayout(null); 
        setVisible(true);

        //button one

         Button b = new Button("Ajunaved");
        b.setBounds(100,80, 90 , 50);
        add(b);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String a[])
    {
        Practiceclass d = new Practiceclass();
        //    Practiceclass d = new Practiceclass();
    }
}