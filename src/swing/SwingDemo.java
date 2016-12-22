package swing;

import javax.swing.*;

/**
 * Created by denba on 08.12.2016.
 */
public class SwingDemo {

    public SwingDemo() {

        JFrame jFrame = new JFrame("A Simple Swing Application");
        jFrame.setSize(275, 100);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel jLabel = new JLabel("Swing means powerful GUIs.");

        jFrame.add(jLabel);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
}
