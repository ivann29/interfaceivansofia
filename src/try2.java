import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class try2 extends JFrame {
    private JPanel subPanel;
    private JLabel labelH;
    private JLabel labelS;
    private JToggleButton JTB1;
    private JToggleButton JTB2;
    private JLabel buzzerimg;
    private JLabel humidifier;
    private JLabel buzzer;
    private JLabel allOptions;
    private JToggleButton JTB3;
    private JLabel introTitle;
    private JPanel p1;

    public try2() {

        setContentPane(subPanel);
        setTitle("Settings");
        setSize(1000, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        p1.setBackground(Color.gray);
        p1.setBounds(0,0,1000,300);

        labelS.setFont(new Font("Ariel", Font.BOLD, 20));
       // labelS.setBorder(BorderFactory.createLineBorder(Color.black, 5));
       // labelS.setPreferredSize(new Dimension(100,60));
        introTitle.setBorder(BorderFactory.createLineBorder(Color.black,4));

        JTB1.setText("OFF");
        JTB1.setForeground(Color.white);
        JTB1.setBackground(Color.darkGray);
        buzzer.setText("The buzzer is currently turned off");
        buzzer.setForeground(Color.darkGray);
        buzzer.setSize(100,10);
        buzzer.setFont(new Font("Ariel", Font.BOLD, 14));
        humidifier.setFont(new Font("Ariel", Font.BOLD, 14));
        allOptions.setFont(new Font("Ariel", Font.BOLD, 14));
        subPanel.setBackground(Color.lightGray);

        JTB1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(JTB1.isSelected()){
                    JTB1.setText("ON");
                    JTB1.setBackground(Color.blue);
                    buzzer.setText("The buzzer is currently turned on");
                    buzzer.setForeground(Color.blue);
                    subPanel.setBackground(Color.white);
                    if(JTB2.getText().equals("ON")){
                        JTB3.setText("ON");
                        JTB3.setBackground(Color.blue);
                        allOptions.setText("All of the options are turned on");
                        JTB1.setText("ON");
                        JTB1.setBackground(Color.blue);
                        buzzer.setText("The buzzer is currently turned on");
                        JTB2.setText("ON");
                        JTB2.setBackground(Color.blue);
                        humidifier.setText("The buzzer is currently turned on");
                        buzzer.setForeground(Color.blue);
                        humidifier.setForeground(Color.blue);
                        allOptions.setForeground(Color.blue);
                        subPanel.setBackground(Color.white);
                    }
                }else{
                    JTB1.setText("OFF");
                    JTB1.setBackground(Color.darkGray);
                    buzzer.setText("The buzzer is currently turned off");
                    buzzer.setForeground(Color.darkGray);
                    if(JTB2.getText().equals("OFF")){
                        JTB3.setText("OFF");
                        JTB3.setBackground(Color.darkGray);
                        allOptions.setText("All of the options are turned off");
                        JTB1.setText("OFF");
                        JTB1.setBackground(Color.darkGray);
                        buzzer.setText("The buzzer is currently turned off");
                        JTB2.setText("OFF");
                        JTB2.setBackground(Color.darkGray);
                        humidifier.setText("The buzzer is currently turned off");
                        humidifier.setForeground(Color.darkGray);
                        buzzer.setForeground(Color.darkGray);
                        allOptions.setForeground(Color.darkGray);
                        subPanel.setBackground(Color.gray);
                    }
                    //subPanel.setBackground(Color.lightGray);
                }

            }
        });

        JTB2.setText("OFF");
        JTB2.setBackground(Color.darkGray);
        JTB2.setForeground(Color.white);
        humidifier.setText("The buzzer is currently turned off");
        humidifier.setForeground(Color.darkGray);

        JTB2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            { if(JTB2.isSelected()){
                    JTB2.setText("ON");
                    JTB2.setBackground(Color.blue);
                    humidifier.setText("The buzzer is currently turned on");
                    humidifier.setForeground(Color.blue);
                    subPanel.setBackground(Color.white);
                    if(JTB1.getText().equals("ON")){
                        JTB3.setText("ON");
                        allOptions.setText("All of the options are turned on");
                        JTB3.setBackground(Color.blue);
                        JTB1.setText("ON");
                        JTB1.setBackground(Color.blue);
                        buzzer.setText("The buzzer is currently turned on");
                        JTB2.setText("ON");
                        JTB2.setBackground(Color.blue);
                        humidifier.setText("The buzzer is currently turned on");
                        buzzer.setForeground(Color.blue);
                        humidifier.setForeground(Color.blue);
                        allOptions.setForeground(Color.blue);
                        subPanel.setBackground(Color.white);
                    }
                }else{
                    JTB2.setText("OFF");
                    JTB2.setBackground(Color.darkGray);
                    JTB3.setText("OFF");
                    humidifier.setText("The buzzer is currently turned off");
                    humidifier.setForeground(Color.darkGray);
                if(JTB2.getText().equals("OFF")){
                    JTB3.setText("OFF");
                    JTB3.setBackground(Color.darkGray);
                    allOptions.setText("All of the options are turned off");
                    JTB1.setText("OFF");
                    JTB1.setBackground(Color.darkGray);
                    buzzer.setText("The buzzer is currently turned off");
                    JTB2.setText("OFF");
                    JTB2.setBackground(Color.darkGray);
                    humidifier.setText("The buzzer is currently turned off");
                    humidifier.setForeground(Color.darkGray);
                    buzzer.setForeground(Color.darkGray);
                    allOptions.setForeground(Color.darkGray);
                    subPanel.setBackground(Color.gray);
                }

                  //  subPanel.setBackground(Color.lightGray);
                 //   subPanel.setBackground(Color.gray);
                }
            }
        });

        JTB3.setText("OFF");
        JTB3.setBackground(Color.darkGray);
        JTB3.setForeground(Color.white);
        allOptions.setText("All of the options are turned off");
        allOptions.setForeground(Color.darkGray);

        JTB3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(JTB3.isSelected() ){
                    JTB3.setText("ON");
                    JTB3.setBackground(Color.blue);
                    JTB1.setText("ON");
                    allOptions.setText("All of the options are turned on");
                    JTB1.setBackground(Color.blue);
                    buzzer.setText("The buzzer is currently turned on");
                    JTB2.setText("ON");
                    JTB2.setBackground(Color.blue);
                    humidifier.setText("The buzzer is currently turned on");
                    buzzer.setForeground(Color.blue);
                    humidifier.setForeground(Color.blue);
                    allOptions.setForeground(Color.blue);
                    subPanel.setBackground(Color.white);
                }else{
                    JTB3.setText("OFF");
                    JTB3.setBackground(Color.darkGray);
                    allOptions.setText("All of the options are turned off");
                    JTB1.setText("OFF");
                    JTB1.setBackground(Color.darkGray);
                    buzzer.setText("The buzzer is currently turned off");
                    JTB2.setText("OFF");
                    JTB2.setBackground(Color.darkGray);
                    humidifier.setText("The buzzer is currently turned off");
                    humidifier.setForeground(Color.darkGray);
                    buzzer.setForeground(Color.darkGray);
                    allOptions.setForeground(Color.darkGray);
                    subPanel.setBackground(Color.gray);
                }

            }
        });
        setVisible(true);
    }


        //pack();
        public static void main ( String[] args){
            try2 myFrame1 = new try2();


        }
}
