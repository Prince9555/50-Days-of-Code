import java.awt.*;
import java.awt.event.*;

public class TVGUI extends Frame {
    private TV tv;

    private Button powerButton, channelUpButton, channelDownButton, volumeUpButton, volumeDownButton;
    private Label channelLabel, volumeLabel;

    public TVGUI() {
        tv = new TV();

        // Create GUI components
        powerButton = new Button("Power");
        channelUpButton = new Button("Channel Up");
        channelDownButton = new Button("Channel Down");
        volumeUpButton = new Button("Volume Up");
        volumeDownButton = new Button("Volume Down");

        channelLabel = new Label("Channel: " + tv.getChannel());
        volumeLabel = new Label("Volume: " + tv.getVolumeLevel());

        // Set up the layout
        setLayout(new GridLayout(3, 2));

        // Add components to the frame
        add(powerButton);
        add(channelUpButton);
        add(channelDownButton);
        add(volumeUpButton);
        add(volumeDownButton);
        add(channelLabel);
        add(volumeLabel);

        // Add action listeners to buttons
        powerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (tv.isOn()) {
                    tv.turnOff();
                    channelLabel.setText("Channel: ");
                    volumeLabel.setText("Volume: ");
                } else {
                    tv.turnOn();
                    updateLabels();
                }
            }
        });

        channelUpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tv.channelUp();
                updateLabels();
            }
        });

        channelDownButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tv.channelDown();
                updateLabels();
            }
        });

        volumeUpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tv.volumeUp();
                updateLabels();
            }
        });

        volumeDownButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tv.volumeDown();
                updateLabels();
            }
        });

        // Set frame properties
        setTitle("TV Controller");
        setSize(300, 150);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        setVisible(true);
    }

    private void updateLabels() {
        channelLabel.setText("Channel: " + tv.getChannel());
        volumeLabel.setText("Volume: " + tv.getVolumeLevel());
    }

    public static void main(String[] args) {
        new TVGUI();
    }
}
