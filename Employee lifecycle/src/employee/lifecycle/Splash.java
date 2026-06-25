package employee.lifecycle;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Splash extends JFrame implements ActionListener{

    Splash() {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        // Heading
        JLabel heading = new JLabel("EMPLOYEE LIFE CYCLE");
        heading.setBounds(80, 30, 1200, 60);
        heading.setFont(new Font("Serif", Font.PLAIN, 60));
        heading.setForeground(Color.BLACK);
        add(heading);

        // Image
        ImageIcon i1 = new ImageIcon(
                getClass().getResource("/icons/front.jpg")
        );

        Image i2 = i1.getImage().getScaledInstance(
                1100, 500, Image.SCALE_SMOOTH
        );

        ImageIcon i3 = new ImageIcon(i2);

        JLabel image = new JLabel(i3);
        image.setBounds(30, 100, 1100, 500);
        image.setLayout(null);
        add(image);

        // Button
        JButton clickhere = new JButton("Click Here To Continue");
        clickhere.setBounds(400, 400, 300, 50);
        clickhere.setFont(new Font("Tahoma", Font.BOLD, 20));
        clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.WHITE);
        clickhere.addActionListener(this);
        image.add(clickhere);

        // Frame settings
        setSize(1170, 650);
        setLocation(200, 50);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // Blinking heading
        Timer timer = new Timer(1000, e -> {
            heading.setVisible(!heading.isVisible());
        });
        timer.start();
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Splash();
    }
}