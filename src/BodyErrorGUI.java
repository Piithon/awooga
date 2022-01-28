import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BodyErrorGUI extends JFrame{


    private JPanel Error;
    private JLabel ErrorMessage;
    private JButton returnButton;

    public BodyErrorGUI(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(Error);
        this.pack();
        this.setVisible(true);
        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new BodyInfoGUI("Enter Body Information");
                dispose();
            }
        });
    }
}
