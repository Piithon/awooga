import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class errorChangeGUI extends JFrame{
    private JLabel Error;
    private JButton returnButton;
    private JPanel errorChangePanel;

    public errorChangeGUI(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(errorChangePanel);
        this.pack();
        this.setVisible(true);
        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new BodyChangeGUI("Ideal body changes");
                dispose();
            }
        });
    }
}
