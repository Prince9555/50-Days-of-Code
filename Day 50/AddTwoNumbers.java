import java.awt.*;
import java.awt.event.*;

public class AddTwoNumbers extends Frame implements ActionListener 
{
    private TextField numField1, numField2;
    private Label resultLabel;

    public AddTwoNumbers() 
    {
        setLayout(new FlowLayout());

        // Text fields for inputting numbers
        numField1 = new TextField(10);
        numField2 = new TextField(10);
        add(new Label("Enter first number:"));
        add(numField1);
        add(new Label("Enter second number:"));
        add(numField2);

        // Button for calculating the sum
        Button addButton = new Button("Add");
        add(addButton);

        // Label to display the result
        resultLabel = new Label("Result: ");
        add(resultLabel);

        // Register the AddTwoNumbers instance as the ActionListener for the button
        addButton.addActionListener(this);

        setSize(650, 150);
        setVisible(true);
    }

    // Implementing the actionPerformed method defined in the ActionListener interface
    public void actionPerformed(ActionEvent e) 
    {
        
                // Get the numbers from text fields and calculate their sum
                int num1 = Integer.parseInt(numField1.getText());
                int num2 = Integer.parseInt(numField2.getText());
                int sum = num1 + num2;

                // Display the result
                resultLabel.setText("Result: " + sum);
            
           
        }
    

    public static void main(String[] args) 
    {
        new AddTwoNumbers();
    }
}