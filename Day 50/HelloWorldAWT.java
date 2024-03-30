import java.awt.*;

public class HelloWorldAWT extends Frame 
{
    public HelloWorldAWT() 
    {
        Label label = new Label("Hello, World!");
        add(label);
        setSize(200, 100);
        setVisible(true);
    }

    public static void main(String[] args) 
    {
        HelloWorldAWT a1=new HelloWorldAWT();
        HelloWorldAWT a2=new HelloWorldAWT();
        a2.setSize(500,600);
    }
}