import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{

    protected JButton okButton;
    protected JPanel mainPanel, buttonPanel;

    public MyFrame(String name){
        super(name);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI(){
        MyFrame msw = new MyFrame("My Simple Window");
        msw.addComponents();
        msw.setFrameFeatures();
    }

    protected void setFrameFeatures() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
    }

    protected void addComponents() {
        okButton = new JButton("OK");
        buttonPanel = new JPanel();
        buttonPanel.add(okButton);
        mainPanel = new JPanel();
        mainPanel.add(buttonPanel);

        setContentPane(mainPanel);
    }
}
