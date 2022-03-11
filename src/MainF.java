import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainF extends JFrame{
    private JPanel mainPanel;
    private JButton settingsOfMachineButton;
    private JButton schedruleButton;
    private JButton dataReadingsButton;
    private JLabel label1;

    public MainF(String titleProject ){
        super(titleProject);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        label1.setFont(new Font("Serif", Font.BOLD, 20));
        settingsOfMachineButton.setFont(new Font("Serif", Font.BOLD, 16));
        settingsOfMachineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //go onto the settings for turning on and off the humidifier and buzzer
            }
        });
        schedruleButton.setFont(new Font("Serif", Font.BOLD, 16));
        schedruleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //go onto a page that can make the activators work for a period in time
            }
        });
        dataReadingsButton.setFont(new Font("Serif", Font.BOLD, 16));
        dataReadingsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //get some readings updated every 10 sec from the database
            }
        });

    }
    public static void main ( String[] args){
        JFrame frame = new MainF("Snoring Machine");
        frame.setVisible(true);
    }


}
