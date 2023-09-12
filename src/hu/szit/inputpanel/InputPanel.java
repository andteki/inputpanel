package hu.szit.inputpanel;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Az InputPanel egy Swing komponens, ami segít
 * bekérni egy értéket. Van egy felirata és
 * egy beviteli mezője.
 * @author Sallai András
 * @version 1.0
 * @since 2023-09-12
 */
public class InputPanel extends JPanel {
    
    JLabel label;
    JTextField field;
    /**
     * Paraméter nélküli konstruktor
     */    
    public InputPanel() {
        initComponent();
        setupComponents();
        addComponent();
    }
    private void initComponent() {
        this.label = new JLabel();
        this.field = new JTextField();
    }
    private void setupComponents() {
        this.field.setPreferredSize(new Dimension(100, 25));
    }
    private void addComponent() {
        this.add(this.label);
        this.add(this.field);
    }
    /**
     * A komponens szövegének beállítása
     * @param text A felirat szövege
     */    
    public void setText(String text) {
        this.label.setText(text);
    }
    /**
     * A komponens szövege lekérdezhető
     * @return A komponens szövegét adja
     */    
    public String getText() {
        return this.label.getText();
    }
    /**
     * A komponens értékének beállítása
     * @param value A komponens értéke
     */    
    public void setValue(String text) {
        this.field.setText(text);
    }
    /**
     * A komponens értékének lekérdezése
     * @return A komponens értékét adja
     */    
    public String getValue() {
        return this.field.getText();
    }
}
