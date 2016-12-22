package swing;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by denba on 08.12.2016.
 */
class PaintPanel extends JPanel {
    Insets insets;

    Random rnd;

    public PaintPanel() {
        setBorder(BorderFactory.createLineBorder(Color.RED, 5));
        rnd = new Random();

    }

    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int x, y, x2, y2;

        int height = getHeight();
        int width = getWidth();

        insets = getInsets();
        for(int i = 0; i < 10; i++)
        {
            x = rnd.nextInt(width - insets.left);
            y = rnd.nextInt(height - insets.bottom);
            x2 = rnd.nextInt(width - insets.left);
            y2 = rnd.nextInt(height - insets.bottom);

            g.drawLine(x, y, x2, y2);
        }
    }
}

public class PaintDemo {
    JLabel jLabel;
    PaintPanel pp;

    public PaintDemo() {
        JFrame jFrame = new JFrame("Paint Demo");
        jFrame.setSize(200, 150);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pp = new PaintPanel();
        jFrame.add(pp);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PaintDemo();
            }
        });
    }
}
