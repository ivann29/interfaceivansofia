
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

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
    private boolean humIsTurnedON;
    private boolean buzzIsTurnedON;

    public try2() {
      //  this.$$$setupUI$$$();
        this.setContentPane(this.subPanel);
        this.setTitle("Settings");
        this.setSize(1000, 600);
        this.setResizable(false);
        this.setDefaultCloseOperation(1);
        this.p1.setBackground(Color.gray);
        this.p1.setBounds(0, 0, 1000, 300);
        this.labelS.setFont(new Font("Ariel", 1, 20));
        this.introTitle.setBorder(BorderFactory.createLineBorder(Color.black, 4));
        this.buzzer.setSize(100, 10);
        this.buzzer.setFont(new Font("Ariel", 1, 14));
        this.humidifier.setFont(new Font("Ariel", 1, 14));
        this.allOptions.setFont(new Font("Ariel", 1, 14));
        this.subPanel.setBackground(Color.lightGray);
        this.humIsTurnedON = false;
        this.buzzIsTurnedON = false;
        this.JTB1.setText("OFF");
        this.JTB1.setForeground(Color.white);
        this.JTB1.setBackground(Color.darkGray);
        this.buzzer.setText("The buzzer is currently turned off");
        this.buzzer.setForeground(Color.darkGray);
        this.checkAutomatic();
        this.JTB1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (try2.this.JTB1.isSelected()) {
                    try2.this.JTB1.setText("ON");
                    try2.this.JTB1.setBackground(Color.blue);
                    try2.this.buzzer.setText("The buzzer is currently turned on");
                    try2.this.buzzer.setForeground(Color.blue);
                    try2.this.subPanel.setBackground(Color.white);
                    if (try2.this.JTB2.getText().equals("ON")) {
                        try2.this.JTB3.setText("ON");
                        try2.this.JTB3.setBackground(Color.blue);
                        try2.this.allOptions.setText("All of the options are turned on");
                        try2.this.JTB1.setText("ON");
                        try2.this.JTB1.setBackground(Color.blue);
                        try2.this.buzzer.setText("The buzzer is currently turned on");
                        try2.this.JTB2.setText("ON");
                        try2.this.JTB2.setBackground(Color.blue);
                        try2.this.humidifier.setText("The buzzer is currently turned on");
                        try2.this.buzzer.setForeground(Color.blue);
                        try2.this.humidifier.setForeground(Color.blue);
                        try2.this.allOptions.setForeground(Color.blue);
                        try2.this.subPanel.setBackground(Color.white);
                    }
                } else {
                    try2.this.JTB1.setText("OFF");
                    try2.this.JTB1.setBackground(Color.darkGray);
                    try2.this.buzzer.setText("The buzzer is currently turned off");
                    try2.this.buzzer.setForeground(Color.darkGray);
                    if (try2.this.JTB2.getText().equals("OFF")) {
                        try2.this.JTB3.setText("OFF");
                        try2.this.JTB3.setBackground(Color.darkGray);
                        try2.this.allOptions.setText("All of the options are turned off");
                        try2.this.JTB1.setText("OFF");
                        try2.this.JTB1.setBackground(Color.darkGray);
                        try2.this.buzzer.setText("The buzzer is currently turned off");
                        try2.this.JTB2.setText("OFF");
                        try2.this.JTB2.setBackground(Color.darkGray);
                        try2.this.humidifier.setText("The buzzer is currently turned off");
                        try2.this.humidifier.setForeground(Color.darkGray);
                        try2.this.buzzer.setForeground(Color.darkGray);
                        try2.this.allOptions.setForeground(Color.darkGray);
                        try2.this.subPanel.setBackground(Color.gray);
                    }
                }

            }
        });
        this.JTB2.setText("OFF");
        this.JTB2.setBackground(Color.darkGray);
        this.JTB2.setForeground(Color.white);
        this.humidifier.setText("The humidifier is currently turned off");
        this.humidifier.setForeground(Color.darkGray);
        this.checkAutomatic();
        this.JTB2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (try2.this.JTB2.isSelected()) {
                    try2.this.JTB2.setText("ON");
                    try2.this.JTB2.setBackground(Color.blue);
                    try2.this.humidifier.setText("The humidifier is currently turned on");
                    try2.this.humidifier.setForeground(Color.blue);
                    try2.this.subPanel.setBackground(Color.white);
                    if (try2.this.JTB1.getText().equals("ON")) {
                        try2.this.JTB3.setText("ON");
                        try2.this.allOptions.setText("All of the options are turned on");
                        try2.this.JTB3.setBackground(Color.blue);
                        try2.this.JTB1.setText("ON");
                        try2.this.JTB1.setBackground(Color.blue);
                        try2.this.buzzer.setText("The buzzer is currently turned on");
                        try2.this.JTB2.setText("ON");
                        try2.this.JTB2.setBackground(Color.blue);
                        try2.this.humidifier.setText("The humidifier is currently turned on");
                        try2.this.buzzer.setForeground(Color.blue);
                        try2.this.humidifier.setForeground(Color.blue);
                        try2.this.allOptions.setForeground(Color.blue);
                        try2.this.subPanel.setBackground(Color.white);
                    }
                } else {
                    try2.this.JTB2.setText("OFF");
                    try2.this.JTB2.setBackground(Color.darkGray);
                    try2.this.JTB3.setText("OFF");
                    try2.this.humidifier.setText("The humidifier is currently turned off");
                    try2.this.humidifier.setForeground(Color.darkGray);
                    if (try2.this.JTB2.getText().equals("OFF")) {
                        try2.this.JTB3.setText("OFF");
                        try2.this.JTB3.setBackground(Color.darkGray);
                        try2.this.allOptions.setText("All of the options are turned off");
                        try2.this.JTB1.setText("OFF");
                        try2.this.JTB1.setBackground(Color.darkGray);
                        try2.this.buzzer.setText("The buzzer is currently turned off");
                        try2.this.JTB2.setText("OFF");
                        try2.this.JTB2.setBackground(Color.darkGray);
                        try2.this.humidifier.setText("The humidifier is currently turned off");
                        try2.this.humidifier.setForeground(Color.darkGray);
                        try2.this.buzzer.setForeground(Color.darkGray);
                        try2.this.allOptions.setForeground(Color.darkGray);
                        try2.this.subPanel.setBackground(Color.gray);
                    }
                }

            }
        });
        this.JTB3.setText("OFF");
        this.JTB3.setBackground(Color.darkGray);
        this.JTB3.setForeground(Color.white);
        this.allOptions.setText("All of the options are turned off");
        this.allOptions.setForeground(Color.darkGray);
        this.checkAutomatic();
        this.JTB3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (try2.this.JTB3.isSelected()) {
                    try2.this.JTB3.setText("ON");
                    try2.this.JTB3.setBackground(Color.blue);
                    try2.this.JTB1.setText("ON");
                    try2.this.allOptions.setText("All of the options are turned on");
                    try2.this.JTB1.setBackground(Color.blue);
                    try2.this.buzzer.setText("The buzzer is currently turned on");
                    try2.this.JTB2.setText("ON");
                    try2.this.JTB2.setBackground(Color.blue);
                    try2.this.humidifier.setText("The humidifier is currently turned on");
                    try2.this.buzzer.setForeground(Color.blue);
                    try2.this.humidifier.setForeground(Color.blue);
                    try2.this.allOptions.setForeground(Color.blue);
                    try2.this.subPanel.setBackground(Color.white);
                } else {
                    try2.this.JTB3.setText("OFF");
                    try2.this.JTB3.setBackground(Color.darkGray);
                    try2.this.allOptions.setText("All of the options are turned off");
                    try2.this.JTB1.setText("OFF");
                    try2.this.JTB1.setBackground(Color.darkGray);
                    try2.this.buzzer.setText("The buzzer is currently turned off");
                    try2.this.JTB2.setText("OFF");
                    try2.this.JTB2.setBackground(Color.darkGray);
                    try2.this.humidifier.setText("The humidifier is currently turned off");
                    try2.this.humidifier.setForeground(Color.darkGray);
                    try2.this.buzzer.setForeground(Color.darkGray);
                    try2.this.allOptions.setForeground(Color.darkGray);
                    try2.this.subPanel.setBackground(Color.gray);
                }

            }
        });
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new try2();
    }

    public void checkAutomatic() {
        String temperature = this.makeGETRequest("https://studev.groept.be/api/a21ib2c06/GetLatest");
        String noisiness = this.makeGETRequest("https://studev.groept.be/api/a21ib2c06/GetLatest");
        String brightness = this.makeGETRequest("https://studev.groept.be/api/a21ib2c06/GetLatest");
        String bright = this.parseJSON(brightness, "Brightness");
        String noise = this.parseJSON(noisiness, "Noise");
        String temp = this.parseJSON(temperature, "Temperature");
        Float brightInt = Float.valueOf(bright);
        Float noiseFloat = Float.valueOf(noise);
        Float tempFloat = Float.valueOf(temp);
        System.out.println(brightInt);
        System.out.println(noiseFloat);
        System.out.println(tempFloat);
        if (brightInt < 400.0F && noiseFloat > 30.0F && tempFloat > 21.0F) {
            this.JTB3.setText("ON");
            this.JTB3.setBackground(Color.blue);
            this.JTB1.setText("ON");
            this.allOptions.setText("All of the options are turned on");
            this.JTB1.setBackground(Color.blue);
            this.buzzer.setText("The buzzer is currently turned on");
            this.JTB2.setText("ON");
            this.JTB2.setBackground(Color.blue);
            this.humidifier.setText("The humidifier is currently turned on");
            this.buzzer.setForeground(Color.blue);
            this.humidifier.setForeground(Color.blue);
            this.allOptions.setForeground(Color.blue);
            this.subPanel.setBackground(Color.white);
        } else if (brightInt < 400.0F && noiseFloat > 30.0F && tempFloat < 21.0F) {
            this.JTB1.setText("ON");
            this.JTB1.setBackground(Color.blue);
            this.buzzer.setText("The buzzer is currently turned on");
            this.buzzer.setForeground(Color.blue);
            this.subPanel.setBackground(Color.white);
            if (this.JTB2.getText().equals("ON")) {
                this.JTB3.setText("ON");
                this.JTB3.setBackground(Color.blue);
                this.allOptions.setText("All of the options are turned on");
                this.JTB1.setText("ON");
                this.JTB1.setBackground(Color.blue);
                this.buzzer.setText("The buzzer is currently turned on");
                this.JTB2.setText("ON");
                this.JTB2.setBackground(Color.blue);
                this.humidifier.setText("The buzzer is currently turned on");
                this.buzzer.setForeground(Color.blue);
                this.humidifier.setForeground(Color.blue);
                this.allOptions.setForeground(Color.blue);
                this.subPanel.setBackground(Color.white);
            }
        }

    }

    public String makeGETRequest(String urlName) {
        BufferedReader rd = null;
        StringBuilder sb = null;
        String line = null;

        try {
            URL url = new URL(urlName);
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            sb = new StringBuilder();

            while((line = rd.readLine()) != null) {
                sb.append(line + "\n");
            }

            conn.disconnect();
            return sb.toString();
        } catch (MalformedURLException var7) {
            var7.printStackTrace();
        } catch (ProtocolException var8) {
            var8.printStackTrace();
        } catch (IOException var9) {
            var9.printStackTrace();
        }

        return "";
    }

    public String parseJSON(String jsonString, String key) {
        String var = "";

        try {
            JSONArray array = new JSONArray(jsonString);

            for(int i = 0; i < array.length(); ++i) {
                JSONObject curObject = array.getJSONObject(i);
                var = var + curObject.getString(key);
            }
        } catch (JSONException var7) {
            var7.printStackTrace();
        }

        return var;
    }
}
