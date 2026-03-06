import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Amazon");

        JButton button = new JButton("Click Me");
        button.setBounds(100,100,100,40);

        frame.add(button);

        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}