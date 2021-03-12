import javax.swing.*;
import java.awt.*;

public class MyFrameV3 extends MyFrameV2{

    protected JLabel nameLabel;
    protected JTextField nameTextField;
    protected JPanel namePanel;

    public MyFrameV3(String name) {
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
        MyFrameV3 msw = new MyFrameV3("My Simple Window V3");
        msw.addComponents();
        msw.setFrameFeatures();
    }

    @Override
    protected void addComponents() {
        super.addComponents();

        namePanel = new JPanel(new GridLayout(0, 2));
        nameLabel = new JLabel("Name:");
        nameTextField = new JTextField(10);
        namePanel.add(nameLabel);
        namePanel.add(nameTextField);

        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(namePanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);


    }
}
