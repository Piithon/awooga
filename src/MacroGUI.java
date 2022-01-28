import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MacroGUI extends JFrame{
    private JPanel mainPanel;
    private JButton startButton;
    private JLabel startLabel;

    public MacroGUI(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // moves into the next GUI
                JFrame frame = new BodyInfoGUI("Enter Body Information");
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new MacroGUI("Macro GUI start page");
        frame.setVisible(true);

    }
}
