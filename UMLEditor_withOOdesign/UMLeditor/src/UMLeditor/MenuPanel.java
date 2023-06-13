package UMLeditor;

import Object.*;
import UMLeditor.Singleton.CanvasMembers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

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
        if (e.getActionCommand()=="Rename"){
            Vector<BaseObject> graphics = CanvasMembers.getInstance();
            System.out.println(graphics);

        }
        if (e.getActionCommand() == "Group") {
            GroupObject groupObject = new GroupObject(new Point(0,0));


            Vector<BaseObject> graphics = CanvasMembers.getInstance();
            graphics.addElement(groupObject);


            /*
            // foreach object in canvasMember
            // if obj.isSelected
            // addMember(obj)
            // init group frame
            // push into canvas
            BaseObject group = n ew groupObject();

            // a group object who has parent group can't be selected
            // some function have to be overrided :
            // move , select, findPort, ungroup, draw
             */

        }
        if (e.getActionCommand() == "UnGroup"){

            Vector<BaseObject> graphics = CanvasMembers.getInstance();
            for(BaseObject obj : graphics){
                if(obj.isSelected() == true) obj.ungroup();
            }
            System.out.println(graphics);
        }
    }

}
