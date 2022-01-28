import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BodyChangeGUI extends JFrame{

    private JComboBox bodybuildCombo;
    private JPanel changePanel;
    private JComboBox workoutCombo;
    private JLabel pickWeightLabel;
    private JLabel pickWorkoutLabel;
    private JButton continueButton;
    private JButton returnButton;

    static public String WEIGHTLABEL;
    static public String EXERCISELABEL;

    public BodyChangeGUI(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(changePanel);
        this.pack();
        this.setVisible(true);

        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //goes back
                JFrame frame = new BodyInfoGUI("Enter Body Information");
                dispose();
            }
        });
        continueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //pulls the info from the two comboboxes
                WEIGHTLABEL = String.valueOf(bodybuildCombo.getSelectedItem());
                EXERCISELABEL = String.valueOf(workoutCombo.getSelectedItem());

                //testing
                //System.out.print(weightLabel);



                //make sure they pick something
                if(WEIGHTLABEL == "-Select-" || EXERCISELABEL == "-Select-" ){
                   JFrame frame = new errorChangeGUI("Reselect...");
                   dispose();
                }

                else {
                    JFrame frame = new decisionGUI("Enter...");
                    dispose();
                }
            }
        });
    workoutCombo.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    } );
        bodybuildCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

}
