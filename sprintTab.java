package com.Pokeeee;

/**

 * Name: Pokeeee
 * Date: 7 / 19 / 2017
 * Program: sprintTab.java
 * Purpose: Sprint panel; code for all the options
 */

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

public class sprintTab
{
   private String[] settings;
   private settings settingsList;
   
   public sprintTab()
   {
       updateSettings();
   }
   
   public void updateSettings()
   {
       settings = new String[21];
       settingsList = new settings();
       try
       {
           settings = settingsList.getSettings();
       }
       catch(Exception e)
       {
       }
   }
   
   public JCheckBox getOmniDirection()
   {
       final JCheckBox omni = new JCheckBox("Omni-Directional");
       if(settings[12].equals("true"))
            omni.setSelected(true);
       omni.addItemListener(new ItemListener()
       {
         public void itemStateChanged(ItemEvent event) 
         {   
             settingsList.updateLine("Sprint.Omni= " + settings[12], 
             "Sprint.Omni= " + omni.isSelected());
         }
       });
       omni.setLocation(0, 0);
       omni.setSize(150, 20);
       return omni;
   }
}
