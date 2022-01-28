import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;


public class BodyInfoGUI extends JFrame{

    private JTextField Information;
    private JTextField weightText;
    private JLabel Weight;
    private JTextField heightText;
    private JLabel Height;
    private JButton nextBtn;
    private JPanel infoPanel;

    static public double WEIGHT;
    static public double HEIGHT;

    Scanner scanner = new Scanner(System.in);
    public BodyInfoGUI(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(infoPanel);
        this.pack();
        this.setVisible(true);

        nextBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //pull the info from the two Text boxes
                try{
                    WEIGHT = Integer.parseInt(weightText.getText());
                    HEIGHT = Integer.parseInt(heightText.getText());
                    JFrame frame = new BodyChangeGUI("Ideal body changes");
                    dispose();
                }catch(Exception exception){
                    JFrame frame = new BodyErrorGUI("Error");
                    dispose();
                }
            }
        });
    }

    public static void main(String[] args){

    }
}
