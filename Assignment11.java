import java.awt.*;
import java.awt.event.ActionEvent;

class RegistrationForm extends Frame {
    public RegistrationForm() {
        Font f = new Font("Verdana",Font.PLAIN, 15);
        setTitle("Jayesh's GUI");
        setBounds(400, 400, 400, 400);
        setLayout(new FlowLayout());

        Label Usernamelabel = new Label("User Name : ");
        TextField UsernameField = new TextField(20);
        Usernamelabel.setFont(f);
        UsernameField.setBackground(new Color(220,222,225));

        Label passwordLabel = new Label("Password:");
        TextField passwordField = new TextField(20);
        passwordField.setBackground(new Color(220,222,225));
        passwordLabel.setFont(f);
        Label choiceLabel = new Label("Enter Semester");
        Choice c = new Choice();
        c.setBackground(Color.lightGray);

        Button button = new Button("Submit");
        button.setBackground(Color.green);
        button.setFont(new Font("MV BOLI", Font.PLAIN, 16));

        CheckboxGroup checkboxGroup = new CheckboxGroup();
        Label label3 = new Label("Gender : ");
        label3.setFont(f);
        
        Label AddressLabel = new Label("Address");
        TextArea AddressArea= new TextArea("",20,20);
        Checkbox checkbox1 = new Checkbox("Male", checkboxGroup, false);
        Checkbox checkbox2 = new Checkbox("Female", checkboxGroup, false);

        checkbox1.setSize(100, 100);
        checkbox2.setSize(100, 100);

        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        c.add("5");
        c.add("6");


        button.addActionListener((ActionEvent e) -> {
            System.out.println("Name : " + UsernameField.getText());
            System.out.println("Password : " + passwordField.getText());
            System.out.println("Semester : "+c.getSelectedItem());
            System.out.println("Address : "+AddressArea.getText());
        });
       
        add(Usernamelabel);
        add(UsernameField);
        add(passwordLabel);
        add(passwordField);
        add(label3);
        add(checkbox1);
        add(checkbox2);
        add(button);
        add(choiceLabel);
        add(c);
        add(AddressLabel);
        add(AddressArea);
        setVisible(true);
    }
}

public class Assignment11 {
    public static void main(String[] args) {
        new RegistrationForm();
    }
}