import javax.swing.*;

public class MyFrameV2 extends MyFrame{

    protected JButton cancelButton;

    public MyFrameV2(String name) {
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
        MyFrameV2 msw = new MyFrameV2("My Simple Window V2");
        msw.addComponents();
        msw.setFrameFeatures();
    }

    @Override
    protected void addComponents() {
        super.addComponents();

        cancelButton = new JButton("Cancel");

        buttonPanel.add(cancelButton);
        buttonPanel.add(okButton);
    }
}
