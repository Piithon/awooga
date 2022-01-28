import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class inputCalorieGUI extends JFrame {


    private JTextField calorieTxt;
    private JPanel inputMacroPanel;
    private JButton enterBtn;
    private JLabel enterLabel;
    private JLabel caloriesLabel;
    private JTextField fatsTxt;
    private JLabel fatsLabel;
    private JLabel carbsLabel;
    private JLabel proteinLabel;
    private JTextField proteinTxt;
    private JTextField carbTxt;

    private String weightLabel;
    private String exerciseLabel;

    static public double TOTALCARBS;
    static public double TOTALCALORIES;
    static public double TOTALFATS;
    static public double TOTALPROTEINS;

    public inputCalorieGUI(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(inputMacroPanel);
        this.pack();
        this.setVisible(true);

        this.weightLabel = BodyChangeGUI.WEIGHTLABEL;
        this.exerciseLabel = BodyChangeGUI.EXERCISELABEL;


        enterBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //pulls text from all entries
                try{
                    TOTALCALORIES = Integer.parseInt(calorieTxt.getText());
                    TOTALCARBS = Integer.parseInt(carbTxt.getText());
                    TOTALFATS = Integer.parseInt(fatsTxt.getText());
                    TOTALPROTEINS = Integer.parseInt(proteinTxt.getText());
                    JFrame frame = new inputVerificationGUI("verify...");
                    dispose();

                }catch(Exception exception){

                }
            }
        });
    }
}
