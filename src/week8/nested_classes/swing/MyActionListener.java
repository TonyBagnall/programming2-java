package week8.nested_classes.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("HELLO WOLRD, up the Arsenal");
    }
}