import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainF extends JFrame {
    private JPanel mainPanel;
    private JButton settingsOfMachineButton;
    private JButton scheduleButton;
    private JButton dataReadingsButton;
    private JLabel label1;

    public MainF() {
     //   this.$$$setupUI$$$();
        this.setContentPane(this.mainPanel);
        this.setTitle("Snorring machine");
        this.setSize(700, 500);
        this.setResizable(false);
        this.mainPanel.setBackground(Color.gray);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
        this.label1.setFont(new Font("Serif", 1, 20));
        this.settingsOfMachineButton.setFont(new Font("Serif", 1, 16));
        this.settingsOfMachineButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame try2 = new try2();
                try2.setVisible(true);
            }
        });
        this.scheduleButton.setFont(new Font("Serif", 1, 16));
        this.scheduleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        this.dataReadingsButton.setFont(new Font("Serif", 1, 16));
        this.dataReadingsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame info = new info();
                info.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        new MainF();
    }
}
