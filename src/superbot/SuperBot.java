
package superbot;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager;

/**
 *
 * @author Maarten
 */
public class SuperBot {

    static String OS = System.getProperty("os.name");
    public static void main(String[] args) throws Exception {
        if(OS.contains("Windows"))
        {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } else {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
        }
        
        new mainPanel().setVisible(true);
    }
}
