import java.awt.FlowLayout;

import javax.swing.JFrame;

import hu.szit.inputpanel.InputPanel;

public class Mainwindow extends JFrame {
    InputPanel inputPanel;

    public Mainwindow() {
        this.inputPanel = new InputPanel();
        this.inputPanel.setText("Minta");
        this.inputPanel.setValue("érték");

        this.setLayout(new FlowLayout());
        this.add(this.inputPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setVisible(true);      
    }

}
