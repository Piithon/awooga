import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class decisionGUI extends JFrame {

    private JButton inputCaloriesButton;
    private JPanel decisionPanel;
    private JButton inputFoodButton;
    private JLabel decisionLabel;
    private JButton returnButton;

    public decisionGUI(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(decisionPanel);
        this.pack();
        this.setVisible(true);


        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new BodyChangeGUI("Ideal Body Changes");
                dispose();
            }
        });
        inputCaloriesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new inputCalorieGUI("Input Macros...");
                dispose();

            }
        });
    }
}
