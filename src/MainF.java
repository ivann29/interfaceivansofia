import javax.swing.*;
import javax.swing.text.DefaultCaret;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainF extends JFrame{
    private JPanel mainPanel;
    private JButton settingsOfMachineButton;
    private JButton scheduleButton;
    private JButton dataReadingsButton;
    private JLabel label1;

    public MainF( ){
        setContentPane(mainPanel);
        setTitle("Snorring machine");
        setSize(450,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        //pack();

        label1.setFont(new Font("Serif", Font.BOLD, 20));
        settingsOfMachineButton.setFont(new Font("Serif", Font.BOLD, 16));
        settingsOfMachineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                EventQueue.invokeLater(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        JFrame frame = new JFrame("Test");
                        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        try
                        {
                            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        JPanel panel = new JPanel();
                        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                        panel.setOpaque(true);
                        JTextArea textArea = new JTextArea(15, 50);
                        textArea.setWrapStyleWord(true);
                        textArea.setEditable(false);
                        textArea.setFont(Font.getFont(Font.SANS_SERIF));
                        JScrollPane scroller = new JScrollPane(textArea);
                        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
                        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
                        JPanel inputpanel = new JPanel();
                        inputpanel.setLayout(new FlowLayout());
                        JTextField input = new JTextField(20);
                        JButton button = new JButton("Enter");
                        DefaultCaret caret = (DefaultCaret) textArea.getCaret();
                        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
                        panel.add(scroller);
                        inputpanel.add(input);
                        inputpanel.add(button);
                        panel.add(inputpanel);
                        frame.getContentPane().add(BorderLayout.CENTER, panel);
                        frame.pack();
                        frame.setLocationByPlatform(true);
                        frame.setVisible(true);
                        frame.setResizable(false);
                        input.requestFocus();
                    }
                });
            }
        });
        scheduleButton.setFont(new Font("Serif", Font.BOLD, 16));
        scheduleButton.addActionListener(new ActionListener() {
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
        MainF myFrame = new MainF();

    }


}
