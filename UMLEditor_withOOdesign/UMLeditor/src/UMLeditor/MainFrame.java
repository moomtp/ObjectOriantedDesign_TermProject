package UMLeditor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

public class MainFrame extends JFrame {
    ButtonPanel btnPanel;
    DrawPanel drwPanel;
    MenuPanel menuPanel;


    public MainFrame() {
        super("UMLeditor");
        drwPanel = new DrawPanel();
        btnPanel = new ButtonPanel();
        menuPanel = new MenuPanel(this);

        init();

    }

    private void init(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,900,500);

        this.setJMenuBar(menuPanel);
        this.add(btnPanel, BorderLayout.WEST);
        this.add(drwPanel, BorderLayout.CENTER);

        this.setVisible(true);


    }


}
