import javax.swing.*;

public class try2 extends JFrame {
    private JPanel subPanel;
    private JCheckBox wakesThePersonUpCheckBox;
    private JLabel labelH;
    private JLabel labelS;
    private JCheckBox improvesTheQualityOfCheckBox;
    private JLabel buzz;

    public try2() {
        setContentPane(subPanel);
        setTitle("Settings");
        setSize(450, 300);
        setResizable(false);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setVisible(true);
    }

        //pack();
        public static void main ( String[] args){
            try2 myFrame1 = new try2();


        }
}
