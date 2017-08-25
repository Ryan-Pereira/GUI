package com.Pokeeee;

/**

 * Name: Pokeeee
 * Date: 7 / 19 / 2017
 * Program: reach.java
 * Purpose: Reach panel; code for all the options
 */

import javax.swing.*;
import java.awt.*;
import java.util.Hashtable;
import javax.swing.event.*;
import java.awt.event.*;

public class reachTab
{      
    private String[] settings;
    private settings settingsList;
    
    public reachTab()
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
        labelTable.put(new Integer(60), new JLabel("6"));
        labelTable.put(new Integer(50), new JLabel("5"));
        labelTable.put(new Integer(40), new JLabel("4"));
        labelTable.put(new Integer(30), new JLabel("3"));
        labelTable.put(new Integer(20), new JLabel("2"));
        labelTable.put(new Integer(10), new JLabel("1"));
        labelTable.put(new Integer(0), new JLabel("0"));
        return labelTable;
    }
    
    public JLabel getRangeLB()
    {
        JLabel rangeLB = new JLabel("Range");
        rangeLB.setLocation(10, 0);
        rangeLB.setSize(50, 20);
        return rangeLB;
    }
    
    public JSlider getReachSD()
    {
        Hashtable<Integer,JLabel> labelTable = getHashTable();
        
        final JSlider reachSD = new JSlider(30, 60, Integer.valueOf(settings[11]));
        reachSD.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent event) 
            {   
                if(!reachSD.getValueIsAdjusting())
                {
                    settingsList.updateLine("Reach.Range= " + settings[11], 
                    "Reach.Range= " + reachSD.getValue());
                }
            }
        });
        reachSD.setLabelTable(labelTable);
        reachSD.setLocation(8, 20);
        reachSD.setSize(150, 45);
        reachSD.setMajorTickSpacing(10);
        reachSD.setMinorTickSpacing(1);
        reachSD.setPaintLabels(true);
        reachSD.setPaintTicks(true);
        
        return reachSD;
    }
    
    public JLabel getReachVal()
    {
        JLabel reachVal = new JLabel("" + getReachSD().getValue() / 10.0);
        reachVal.setLocation(175, 20);
        reachVal.setSize(50, 20);
        
        return reachVal;
    }
}
