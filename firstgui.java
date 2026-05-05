import javax.swing.*;

public class firstgui {
    public static void main(String[] args) {

        JFrame frame = new JFrame("the neoncode buttn");
        JButton button = new JButton("neon makes me");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(100, 100);
        frame.add(button); 
        frame.setVisible(true);
    }
}