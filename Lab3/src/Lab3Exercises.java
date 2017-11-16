import javax.swing.JFrame;

public class Lab3Exercises {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Xavier E. Laureano Rivera");
        myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        myFrame.setLocationRelativeTo(null);
        myFrame.setSize(500, 280);
        myFrame.setVisible(true);
        MyPanelClass myPanel = new MyPanelClass();
        myFrame.getContentPane().add(myPanel);
    }
}