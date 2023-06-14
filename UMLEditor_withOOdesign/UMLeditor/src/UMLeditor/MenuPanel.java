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
        if (e.getActionCommand() == "Rename"){
            JFrame f = new JFrame("New Object Name");
            f.setSize(400,300);
            String input = JOptionPane.showInputDialog("New name : ");

           if(input != null){
               Vector<BaseObject> graphics = CanvasMembers.getInstance();
               System.out.println(graphics);

               for(BaseObject obj : graphics){
                   if(obj.isSelected()){
                       obj.setName(input);
                   }
               }
           }

        }
        if (e.getActionCommand() == "Group") {
            GroupObject groupObject = new GroupObject(new Point(0,0));


            Vector<BaseObject> graphics = CanvasMembers.getInstance();
            graphics.addElement(groupObject);

        }
        if (e.getActionCommand() == "UnGroup"){

            Vector<BaseObject> graphics = CanvasMembers.getInstance();
            for(BaseObject obj : graphics){
                if(obj.isSelected() == true) obj.ungroup();
            }
        }
    }

}
