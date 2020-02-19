package mvc;

import java.awt.event.*;

public class Controller {

    Model model;
    View view;
    
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        this.view.addListener(new Listener());
    }
    
    class Listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            int a = Integer.parseInt(view.getT1());
            int b = Integer.parseInt(view.getT2());
            
            model.setValues(a, b);
            
            view.setT3(String.valueOf(model.getValue1() + model.getValue2()));
        }
    }
}
