import java.awt.*;
import java.awt.event.*;

public class ClickCounter extends Frame implements ActionListener//Step-1 
{
    private int count = 0;
    private Label countLabel;

    public ClickCounter() 
    {
        setLayout(new FlowLayout());
        Button button = new Button("Click Me!");
        countLabel = new Label("Count: 0");
        add(button);
        add(countLabel);

        // Step-2 Register ClickCounter instance as the ActionListener for the button
        button.addActionListener(this);

        setSize(200, 100);
        setVisible(true);
    }

    // Implementing the actionPerformed method defined in the ActionListener interface
    public void actionPerformed(ActionEvent e) 
    {
            count++;
            countLabel.setText("Count: " + count);
       
    }

    public static void main(String[] args)
     {
        new ClickCounter();
    }
}