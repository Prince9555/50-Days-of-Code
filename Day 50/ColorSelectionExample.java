import java.awt.*;
import java.awt.event.*;

public class ColorSelectionExample {
    private Frame frame;
    private Label label;
    private CheckboxGroup colorGroup;
    private Checkbox redCheckbox, greenCheckbox, blueCheckbox;

    public ColorSelectionExample() {
        frame = new Frame("Color Selection");
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());
        
        // Create label
        label = new Label("Select a color:");
        frame.add(label);
        
        // Create checkbox group
        colorGroup = new CheckboxGroup();
        
        // Create radio buttons
        redCheckbox = new Checkbox("Red", colorGroup, false);
        greenCheckbox = new Checkbox("Green", colorGroup, false);
        blueCheckbox = new Checkbox("Blue", colorGroup, false);
        
        // Add radio buttons to the frame
        frame.add(redCheckbox);
        frame.add(greenCheckbox);
        frame.add(blueCheckbox);

        // Add item listener to handle radio button selection
        ItemListener itemListener = new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String color = ((Checkbox) e.getItem()).getLabel();
                    label.setText("You selected " + color);
                }
            }
        };

        redCheckbox.addItemListener(itemListener);
        greenCheckbox.addItemListener(itemListener);
        blueCheckbox.addItemListener(itemListener);

        // Add window listener to handle window closing event
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ColorSelectionExample();
    }
}