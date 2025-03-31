package mypackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class JdialogExample {
   JDialog d;
    public JdialogExample(String state){
        JFrame frame = new JFrame();
        d = new JDialog(frame,"Pop-Up",true);

        d.setLayout(new FlowLayout());
        d.add( new JLabel ("You are in :"+state));
        JButton Jbutton = new JButton("OK");
        Jbutton.addActionListener((ActionEvent e)->
        {
           d.setVisible(false);
        });
        d.add(Jbutton);
        d.setSize(400,400);
        d.setVisible(true);
    }
}