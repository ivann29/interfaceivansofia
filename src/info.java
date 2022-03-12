import javax.swing.*;

public class info extends JFrame{
    private JButton temperatureButton;
    private JButton lightIntensityButton;
    private JLabel information;
    private JLabel db;
    private JLabel celsium;
    private JLabel light;
    private JPanel pann;
    private JButton button1;

    public info() {
        setContentPane(pann);
        setTitle("Sensor information");
        setSize(300, 380);
        setResizable(false);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setVisible(true);
    }

    //pack();
    public static void main ( String[] args){
        info myFrame2 = new info();


    }
}
