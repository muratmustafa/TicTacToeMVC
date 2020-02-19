package mvc;

import java.awt.event.ActionListener;
import javax.swing.*;

public class View extends JFrame{

    private JTextField t1;
    private JTextField t2;
    private JTextField t3;
    private JButton b;
    
    private Model model;
    
    public View(Model model) {
        this.model = model;
        
        t1 = new JTextField(5);
        t2 = new JTextField(5);
        t3 = new JTextField(5);
        b = new JButton("+");
        
        t3.setEditable(false);
        
        JPanel panel = new JPanel();
        
        panel.add(t1);
        panel.add(t2);
        panel.add(b);
        panel.add(t3);
        
        this.getContentPane().add(panel);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public String getT1(){
        return t1.getText();
    }
    
    public String getT2(){
        return t2.getText();
    }
    
    public void setT3(String newT3){
        t3.setText(newT3);
    }
    
    public void addListener(ActionListener a){
        b.addActionListener(a);
    }
}
