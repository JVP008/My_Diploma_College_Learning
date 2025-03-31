import  java.awt.*;
import javax.swing.*;

public class ASSIGNMENT_NO_15 extends JFrame
{
    ASSIGNMENT_NO_15() {
        setLayout(new GridBagLayout());
        String Sem[] = {"1", "2", "3", "4", "5", "6"};
        String[] Branch = {"CM", "ME", "EJ", "EE", "CE"};
        JList list1 = new JList(Sem);
        JList list2 = new JList(Branch);
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        p1.add(list1);
        p2.add(list2);
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.add("BRANCH", p1);
        tabbedPane.add("SEM", p2);
        add(tabbedPane);
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args)
    {
      new ASSIGNMENT_NO_15();
    }
    }
