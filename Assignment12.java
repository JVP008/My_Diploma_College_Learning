import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class Demo extends Frame {
    public Demo() {
        setTitle("Demo Frame");
        setLayout(new GridBagLayout());
        Label lb = new Label("Demo");
        lb.setBackground(Color.yellow);
        lb.setText("Demo");

        Button b = new Button("Click me");
        b.setBackground(Color.cyan);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                lb.setText("Clicked");
            }
        });
        add(lb);
        add(b);


        setSize(500, 500);
        setVisible(true);
    }
}

public class Assignment12 {
    public static void main(String[] args) {
        new Demo();
    }
}
