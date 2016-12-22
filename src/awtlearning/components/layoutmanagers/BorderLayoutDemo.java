package awtlearning.components.layoutmanagers;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by denba on 08.12.2016.
 */
public class BorderLayoutDemo extends Applet {
    public void init(){
        setBackground(Color.CYAN);
        setLayout(new BorderLayout());

        add(new Button("This is across the top."),BorderLayout.NORTH);
        add(new Label("The footer message might go here."), BorderLayout.SOUTH);
        add(new Button("Right"), BorderLayout.EAST);
        add(new Button("Left"), BorderLayout.WEST);
        add(new TextArea("The reasonable nam adapts "+
                            "himself to the world\n" +
                            "the unreasonable one persists in " +
                            "trying to adapt the world to himself.\n" +
                            "Therefore all progress depends " +
                            "on the unreasonable man.\n\n" +
                            "         -George Bernard Shaw\n\n"), BorderLayout.CENTER);
    }

    public Insets getInsets(){
        return new Insets(10, 10, 10, 10);
    }
}
