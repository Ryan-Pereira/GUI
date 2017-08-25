package com.Pokeeee;

/**

 * Name: Pokeeee
 * Date: 7 / 19 / 2017
 * Program: hitBoxes.java
 * Purpose: HitBoxes panel; code for all the options
 */


import javax.swing.*;
import java.awt.*;
import java.util.Hashtable;
import javax.swing.event.*;
import java.awt.event.*;

public class hitBoxesTab
{
   private String[] settings;
   private settings settingsList;
    
   public hitBoxesTab()
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
   
   public Hashtable<Integer,JLabel> getHashTable()
   {
       Hashtable<Integer,JLabel> labelTable = new Hashtable<Integer,JLabel>();
       labelTable.put(new Integer(1000), new JLabel("1"));
       labelTable.put(new Integer(900), new JLabel("0.9"));
       labelTable.put(new Integer(800), new JLabel("0.8"));
       labelTable.put(new Integer(700), new JLabel("0.7"));
       labelTable.put(new Integer(600), new JLabel("0.6"));
       labelTable.put(new Integer(500), new JLabel("0.5"));
       labelTable.put(new Integer(400), new JLabel("0.4"));
       labelTable.put(new Integer(300), new JLabel("0.3"));
       labelTable.put(new Integer(200), new JLabel("0.2"));
       labelTable.put(new Integer(100), new JLabel("0.1"));
       labelTable.put(new Integer(0), new JLabel("0"));
       return labelTable;
   }
    
   public JLabel getHBLB()
    {
        JLabel HBLB = new JLabel("HitBox Extension");
        HBLB.setLocation(10, 0);
        HBLB.setSize(100, 20);
        return HBLB;
    }
    
    public JSlider getHBSD()
    {
        Hashtable<Integer,JLabel> labelTable = getHashTable();
        
        final JSlider HBSD = new JSlider(0, 1000, Integer.valueOf(settings[10]));
        HBSD.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent event) 
            {   
                if(!HBSD.getValueIsAdjusting())
                {
                    settingsList.updateLine("HitBox.Ext= " + settings[10], 
                    "HitBox.Ext= " + HBSD.getValue());
                }
            }
        });
        HBSD.setLabelTable(labelTable);
        HBSD.setLocation(8, 20);
        HBSD.setSize(250, 45);
        HBSD.setMajorTickSpacing(100);
        HBSD.setMinorTickSpacing(1);
        HBSD.setPaintLabels(true);
        
        return HBSD;
    }
    
    public JLabel getHBVal()
    {
        JLabel HBVal = new JLabel("" + getHBSD().getValue() / 1000.0);
        HBVal.setLocation(275, 20);
        HBVal.setSize(50, 20);
        
        return HBVal;
    }
}
