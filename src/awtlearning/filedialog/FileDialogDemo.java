package awtlearning.filedialog;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by denba on 08.12.2016.
 */
class SampleFrame extends Frame {
    public SampleFrame(String title){
        super(title);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

public class FileDialogDemo {
    public static void main(String[] args) {
        Frame f = new SampleFrame("File Dialog Demo");
        f.setVisible(true);
        f.setSize(100, 100);

        FileDialog fd = new FileDialog(f, "File Dialog");
        fd. setVisible(true);
    }
}
