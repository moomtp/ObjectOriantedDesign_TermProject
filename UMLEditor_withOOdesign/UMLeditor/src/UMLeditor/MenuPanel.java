package UMLeditor;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPanel extends JMenuBar implements ActionListener  {

    JMenu editMenu;
    public MenuPanel(MainFrame mainFrame){
        editMenu = new JMenu("Edit");
        this.add(editMenu);
        addMenuItem(editMenu , "Group", "Group");
        addMenuItem(editMenu, "UnGroup", "UnGroup");
        addMenuItem(editMenu, "change object name", "Rename");
    }


    public void addMenuItem(JMenu menu, String title, String action){
        JMenuItem GroupMenuItem = new JMenuItem(title);
        GroupMenuItem.setActionCommand(action);
        menu.add(GroupMenuItem);
        GroupMenuItem.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
        if (e.getActionCommand()=="Rename"){}
        if (e.getActionCommand() == "Group") {}
        if (e.getActionCommand() == "UnGroup"){}
    }

}
