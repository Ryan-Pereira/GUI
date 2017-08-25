package com.Pokeeee;

/**

 * Name: Pokeeee
 * Date: 7 / 19 / 2017
 * Program: velocityTab.java
 * Purpose: Velocity panel; code for all the options
 */

import javax.swing.*;
import java.awt.*;
import java.util.Hashtable;
import javax.swing.event.*;
import java.awt.event.*;

public class velocityTab
{
    private String[] settings;
    private settings settingsList;
    
    public velocityTab()
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
        labelTable.put(new Integer(1000), new JLabel("100"));
        labelTable.put(new Integer(900), new JLabel("90"));
        labelTable.put(new Integer(800), new JLabel("80"));
        labelTable.put(new Integer(700), new JLabel("70"));
        labelTable.put(new Integer(600), new JLabel("60"));
        labelTable.put(new Integer(500), new JLabel("50"));
        labelTable.put(new Integer(400), new JLabel("40"));
        labelTable.put(new Integer(300), new JLabel("30"));
        labelTable.put(new Integer(200), new JLabel("20"));
        labelTable.put(new Integer(100), new JLabel("10"));
        labelTable.put(new Integer(0), new JLabel("0"));
        return labelTable;
    }
    
    public JLabel getHVLB()
    {
        JLabel HVLB = new JLabel("Horizontal");
        HVLB.setLocation(10, 0);
        HVLB.setSize(100, 20);
        
        return HVLB;
    }
    
    public JSlider getHVSD()
    {
        Hashtable<Integer,JLabel> labelTable = getHashTable();
        
        final JSlider HVSD = new JSlider(0, 1000, Integer.valueOf(settings[19]));
        HVSD.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent event) 
            {   
                if(!HVSD.getValueIsAdjusting())
                {
                    settingsList.updateLine("Velocity.Horizontal= " + settings[19], 
                    "Velocity.Horizontal= " + HVSD.getValue());
                }
            }
        });
        HVSD.setLabelTable(labelTable);
        HVSD.setLocation(8, 20);
        HVSD.setSize(250, 45);
        HVSD.setMajorTickSpacing(10);
        HVSD.setMinorTickSpacing(1);
        HVSD.setPaintLabels(true);
        HVSD.setPaintTicks(true);
        
        return HVSD;
    }
    
    public JLabel getHVVal()
    {
        JLabel HVVal = new JLabel("" + getHVSD().getValue() / 10.0 + "%");
        HVVal.setLocation(275, 20);
        HVVal.setSize(50, 20);
        
        return HVVal;
    }
    
    public JLabel getVVLB()
    {
        JLabel VVLB = new JLabel("Vertical");
        VVLB.setLocation(10, 80);
        VVLB.setSize(100, 20);
        
        return VVLB;
    }
    
    public JSlider getVVSD()
    {
        Hashtable<Integer,JLabel> labelTable = getHashTable();
        
        final JSlider VVSD = new JSlider(0, 1000, Integer.valueOf(settings[20]));
        VVSD.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent event) 
            {   
                if(!VVSD.getValueIsAdjusting())
                {
                    settingsList.updateLine("Velocity.Vertical= " + settings[20], 
                    "Velocity.Vertical= " + VVSD.getValue());
                }
            }
        });
        VVSD.setLabelTable(labelTable);
        VVSD.setLocation(8, 100);
        VVSD.setSize(250, 45);
        VVSD.setMajorTickSpacing(10);
        VVSD.setMinorTickSpacing(1);
        VVSD.setPaintLabels(true);
        VVSD.setPaintTicks(true);
        
        return VVSD;
    }
    
    public JLabel getVVVal()
    {
        JLabel VVVal = new JLabel("" + getVVSD().getValue() / 10.0 + "%");
        VVVal.setLocation(275, 100);
        VVVal.setSize(50, 20);
        
        return VVVal;
    }
}
