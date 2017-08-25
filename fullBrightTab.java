package com.Pokeeee;

/**

 * Name: Pokeeee
 * Date: 7 / 19 / 2017
 * Program: fullBrightTab.java
 * Purpose: FullBright panel; code for all the options
 */


import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

public class fullBrightTab
{
   private String[] settings;
   private settings settingsList;
    
   public fullBrightTab()
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
    
   public JCheckBox getBlindness()
   {
        final JCheckBox bl = new JCheckBox("Anti-Blindness");
        if(settings[9].equals("true"))
            bl.setSelected(true);
        bl.addItemListener(new ItemListener()
        {
          public void itemStateChanged(ItemEvent event) 
          {   
              settingsList.updateLine("FullBright.ABlind= " + settings[9], 
              "FullBright.ABlind= " + bl.isSelected());
          }
        });
        bl.setLocation(0, 0);
        bl.setSize(150, 20);
        return bl;
   }
}
