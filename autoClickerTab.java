package com.Pokeeee;

/**

 * Name: Pokeeee
 * Date: 7 / 19 / 2017
 * Program: autoClickerTab.java
 * Purpose: AutoClicker panel; code for all the options
 */

import javax.swing.*;
import java.awt.*;
import java.util.Hashtable;
import javax.swing.event.*;
import java.awt.event.*;

public class autoClickerTab
{
    private String[] settings;
    private settings settingsList;
    
    public autoClickerTab()
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
    
    public Hashtable<Integer,JLabel> getHashTableEvens()
    {
        Hashtable<Integer,JLabel> labelTable = new Hashtable<Integer,JLabel>();
        labelTable.put(new Integer(200), new JLabel("20"));
        labelTable.put(new Integer(180), new JLabel("18"));
        labelTable.put(new Integer(160), new JLabel("16"));
        labelTable.put(new Integer(140), new JLabel("14"));
        labelTable.put(new Integer(120), new JLabel("12"));
        labelTable.put(new Integer(100), new JLabel("10"));
        labelTable.put(new Integer(80), new JLabel("8"));
        labelTable.put(new Integer(60), new JLabel("6"));
        labelTable.put(new Integer(40), new JLabel("4"));
        labelTable.put(new Integer(20), new JLabel("2"));
        labelTable.put(new Integer(0), new JLabel("0"));
        return labelTable;
    }
    
    public JLabel getMaxLB()
    {
        JLabel maxLB = new JLabel("Maximum");
        maxLB.setLocation(10, 0);
        maxLB.setSize(100, 20);
        
        return maxLB;
    }
    
    public JSlider getMaxSD()
    {
        Hashtable<Integer,JLabel> labelTable = getHashTableEvens();
        
        final JSlider maxSD = new JSlider(0, 200, Integer.valueOf(settings[6]));
        maxSD.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent event) 
            {   
                if(!maxSD.getValueIsAdjusting())
                {
                    settingsList.updateLine("AutoClicker.Max= " + settings[6], 
                    "AutoClicker.Max= " + maxSD.getValue());
                }
            }
        });
        maxSD.setLabelTable(labelTable);
        maxSD.setLocation(8, 20);
        maxSD.setSize(250, 45);
        maxSD.setMajorTickSpacing(20);
        maxSD.setMinorTickSpacing(1);
        maxSD.setPaintLabels(true);
        maxSD.setPaintTicks(true);
        
        return maxSD;
    }
    
    public JLabel getMinLB()
    {
        JLabel minLB = new JLabel("Minimum");
        minLB.setLocation(10, 80);
        minLB.setSize(100, 20);
        
        return minLB;
    }
    
    public JLabel getMaxVal()
    {
        JLabel maxVal = new JLabel("" + getMaxSD().getValue() / 10.0);
        maxVal.setLocation(280, 20);
        maxVal.setSize(50, 20);
        
        return maxVal;
    }
    
    public JSlider getMinSD()
    {
        Hashtable<Integer,JLabel> labelTable = getHashTableEvens();
        
        final JSlider minSD = new JSlider(0, 200, Integer.valueOf(settings[7]));
        minSD.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent event) 
            {   
                if(!minSD.getValueIsAdjusting())
                {
                    settingsList.updateLine("AutoClicker.Min= " + settings[7], 
                    "AutoClicker.Min= " + minSD.getValue());
                }
            }
        });
        minSD.setLabelTable(labelTable);
        minSD.setLocation(8, 100);
        minSD.setSize(250, 45);
        minSD.setMajorTickSpacing(20);
        minSD.setMinorTickSpacing(1);
        minSD.setPaintLabels(true);
        minSD.setPaintTicks(true);
        
        return minSD;
    }
    
    public JLabel getMinVal()
    {
        JLabel minVal = new JLabel("" + getMinSD().getValue() / 10.0);
        minVal.setLocation(280, 100);
        minVal.setSize(50, 20);
        
        return minVal;
    }
    
    public JLabel getRangeLB()
    {
        JLabel rangeLB = new JLabel("Range");
        rangeLB.setLocation(320, 0);
        rangeLB.setSize(50, 20);
        return rangeLB;
    }
    
    public JCheckBox getBlockHitBX()
    {
        final JCheckBox bh = new JCheckBox("BlockHit");
        if(settings[8].equals("true"))
            bh.setSelected(true);
        bh.addItemListener(new ItemListener()
        {
          public void itemStateChanged(ItemEvent event) 
          {   
              settingsList.updateLine("AutoClicker.BlockHit= " + settings[8], 
              "AutoClicker.BlockHit= " + bh.isSelected());
          }
        });
        bh.setLocation(310, 20);
        bh.setSize(150, 15);
        return bh;
    }
}
