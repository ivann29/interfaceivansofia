
    //import required classes and packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;

    //create CreateLoginForm class to create login form
//class extends JFrame to create a window where our component add
//class implements ActionListener to perform an action on button click
    class CreateLoginForm extends JFrame implements ActionListener
    {
        //initialize button, panel, label, and text field
        JButton b1;
        JPanel newPanel;
        JPanel newPanelError;
        JLabel errorMessage;
        JLabel userLabel, passLabel;
        JLabel errorLabel;
        final JTextField  textField1, textField2;
        private Object messagebox;

        //calling constructor
        CreateLoginForm()
        {

            //create label for username
            userLabel = new JLabel();
            userLabel.setText("Username");      //set label value for textField1

            //create text field to get username from the user
            textField1 = new JTextField(15);    //set length of the text

            //create label for password
            passLabel = new JLabel();
            passLabel.setText("Password");      //set label value for textField2

            //create text field to get password from the user
            textField2 = new JPasswordField(15);    //set length for the password

            //create submit button
            b1 = new JButton("SUBMIT"); //set label to button

            //create panel to put form elements
            newPanel = new JPanel(new GridLayout(3, 1));
            newPanel.add(userLabel);    //set username label to panel
            newPanel.add(textField1);   //set text field to panel
            newPanel.add(passLabel);    //set password label to panel
            newPanel.add(textField2);   //set text field to panel
            newPanel.add(b1);           //set button to panel

            //set border to panel
            add(newPanel, BorderLayout.CENTER);

            //perform action on button click
            b1.addActionListener(this);     //add action listener to button
            setTitle("LOGIN FORM");         //set title to the login form

            //create the label for the error message
            errorLabel = new JLabel();
            errorLabel.setText("");
        }

        //define abstract method actionPerformed() which will be called on button click
        public void actionPerformed(ActionEvent ae)     //pass action listener as a parameter
        {
            String userValue = textField1.getText();        //get user entered username from the textField1
            String passValue = textField2.getText();        //get user entered pasword from the textField2

            //check whether the credentials are authentic or not
            if (userValue.equals("student") && passValue.equals("student")) {  //if authentic, navigate user to a new page

                //create instance of the NewPage
                
                MainF myFrame = new MainF();
            }
            else if (userValue.compareTo("student")!=0 && passValue.compareTo("Student")!=0){
                //show error message
                JOptionPane.showMessageDialog(this, "Username and/or Password are not correct, try again");
            }
        }
    }
    //create the main class
    class LoginFormDemo
    {
        //main() method start
        public static void main(String arg[])
        {
            try
            {
                //create instance of the CreateLoginForm
                CreateLoginForm form = new CreateLoginForm();
                form.setSize(300,100);  //set size of the frame
                form.setResizable(false);
                form.setVisible(true);
                form.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//make form visible to the user
            }
            catch(Exception e)
            {
                //handle exception
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }


