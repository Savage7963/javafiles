import java.awt.Frame.*;

New class extends Frame
{
	public New ()
	{
		Button btn= new Button("Cheese");
		Button bt= new Button("Butter");
		btn.setBounds(60,90,60,40);
		add(btn);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String a[])
	{
		New n = new New();
	}
}