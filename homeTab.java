package com.Pokeeee;

/**

 * Name: Pokeeee
 * Date: 7 / 19 / 2017
 * Program: AJSGuildModGUI.java
 * Purpose: Home page; shows all active modules
 */

import javax.swing.*;
import java.awt.*;

public class homeTab
{
    public JLabel getInfo()
    {
        JLabel info = new JLabel();
        info.setText("Active Modules - Client by FIVAN NUGGET");
        info.setSize(800, 20);
        info.setLocation(0, 0);
        info.setVisible(true);
        return info;
    }
    
    public JTextArea getActiveModules()
    {
        JTextArea modules = new JTextArea("Modules\n");
        modules.setEditable(false);
        modules.append("Test\n");
        modules.setVisible(true);
        return modules;
    }
    
    public JScrollPane getScrollPane()
    {
        JScrollPane scrollPane = new JScrollPane(getActiveModules());
        scrollPane.setSize(500, 200);
        scrollPane.setLocation(0, 20);
        scrollPane.setVisible(true);
        return scrollPane;
    }
}
