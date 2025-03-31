package  mypackage;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;
public class Assignment13  extends JFrame{
    public Assignment13()
    {
        setTitle("Jayesh's GUI");
        setLayout(new GridBagLayout());
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String states[] = {"Mumbai","Banglore","Pune","Solaput"};
        JComboBox comboBox = new JComboBox<String>(states);
        comboBox.addActionListener((ActionEvent e) ->
        {
            String state = (" "+comboBox.getSelectedItem());
            new JdialogExample(state);
        });
        add(comboBox);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Assignment13();
    }
}