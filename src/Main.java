import java.awt.Color;
// import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        // Create a JFrame window
        JFrame obj = new JFrame();
        
        // Create an instance of the Gameplay class
        Gameplay gamePlay = new Gameplay();

        // Set JFrame properties
        obj.setBounds(10, 10, 700, 600);
        obj.setTitle("Breakout Ball");
        obj.setResizable(false);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add the Gameplay object to the JFrame
        obj.add(gamePlay);
        
        // Make the JFrame visible
        obj.setVisible(true);
    }
}
