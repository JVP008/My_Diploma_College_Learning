import java.awt.*;
import javax.swing.*;
public class todolist extends JFrame {
public  todolist()
{   
    JFrame frame = new JFrame("To Do List");
    frame.setLayout(new GridBagLayout());
    setResizable(true);
    frame.setSize(200,200);
    frame.getContentPane().setBackground(Color.MAGENTA);
    frame.setVisible(true);
    JButton button = new JButton("Click me");    
    frame.add(button);
}
    public static void main(String[] args) {
        new todolist();
    }
}