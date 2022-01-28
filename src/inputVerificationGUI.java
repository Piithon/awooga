import javax.swing.*;

public class inputVerificationGUI extends JFrame {
    private JPanel verificationPanel;
    private JLabel verifyLabel;

    private String weightLabel;
    private String exerciseLabel;

    private double totalCarbs;
    private double totalCalories;
    private double totalFats;
    private double totalProteins;

    private double height;
    private double weight;

    public inputVerificationGUI(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(verificationPanel);
        this.pack();
        this.setVisible(true);

        //gets the data from all other GUIs
        //BodyChangeGUI
        this.weightLabel = BodyChangeGUI.WEIGHTLABEL;
        this.exerciseLabel = BodyChangeGUI.EXERCISELABEL;

        //inputCalorieGUI
        this.totalCalories = inputCalorieGUI.TOTALCALORIES;
        this.totalCarbs = inputCalorieGUI.TOTALCARBS;
        this.totalFats = inputCalorieGUI.TOTALFATS;
        this.totalProteins = inputCalorieGUI.TOTALPROTEINS;

        //BodyInfoGUI
        this.weight = BodyInfoGUI.WEIGHT;
        this.height = BodyInfoGUI.HEIGHT;


    }
}
