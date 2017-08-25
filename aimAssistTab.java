package com.Pokeeee;

/**

 * Name: Pokeeee
 * Date: 7 / 19 / 2017
 * Program: aimAssistTab.java
 * Purpose: Aim Assist panel; code for all the options
 */


import javax.swing.*;
import java.awt.*;
import java.util.Hashtable;
import javax.swing.event.*;
import java.awt.event.*;

public class aimAssistTab
{
    private String[] settings;
    private settings settingsList;
    
    public aimAssistTab()
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
    
    public Hashtable<Integer,JLabel> getHashTableFOV()
    {
        Hashtable<Integer,JLabel> labelTable = new Hashtable<Integer,JLabel>();
        labelTable.put(new Integer(3600), new JLabel("360"));
        labelTable.put(new Integer(3000), new JLabel("300"));
        labelTable.put(new Integer(2400), new JLabel("240"));
        labelTable.put(new Integer(1800), new JLabel("180"));
        labelTable.put(new Integer(1200), new JLabel("120"));
        labelTable.put(new Integer(600), new JLabel("60"));
        labelTable.put(new Integer(0), new JLabel("0"));
        return labelTable;
    }
    
    public Hashtable<Integer,JLabel> getHashTable()
    {
        Hashtable<Integer,JLabel> labelTable = new Hashtable<Integer,JLabel>();
        labelTable.put(new Integer(200), new JLabel("20"));
        labelTable.put(new Integer(190), new JLabel("19"));
        labelTable.put(new Integer(180), new JLabel("18"));
        labelTable.put(new Integer(170), new JLabel("17"));
        labelTable.put(new Integer(160), new JLabel("16"));
        labelTable.put(new Integer(150), new JLabel("15"));
        labelTable.put(new Integer(140), new JLabel("14"));
        labelTable.put(new Integer(130), new JLabel("13"));
        labelTable.put(new Integer(120), new JLabel("12"));
        labelTable.put(new Integer(110), new JLabel("11"));
        labelTable.put(new Integer(100), new JLabel("10"));
        labelTable.put(new Integer(90), new JLabel("9"));
        labelTable.put(new Integer(80), new JLabel("8"));
        labelTable.put(new Integer(70), new JLabel("7"));
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
        rangeLB.setVisible(true);
        return rangeLB;
    }
    
    public JSlider getRangeSD()
    {
        Hashtable<Integer,JLabel> labelTable = getHashTable();
        final JSlider rangeSD = new JSlider(0, 80, Integer.valueOf(settings[0]));
        rangeSD.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent event) 
            {   
                if(!rangeSD.getValueIsAdjusting())
                {
                    settingsList.updateLine("AimAssist.Range= " + settings[0], 
                    "AimAssist.Range= " + rangeSD.getValue());
                }
            }
        });
        rangeSD.setLabelTable(labelTable);
        rangeSD.setLocation(8, 20);
        rangeSD.setSize(250, 45);
        rangeSD.setMajorTickSpacing(10);
        rangeSD.setMinorTickSpacing(1);
        rangeSD.setPaintLabels(true);
        rangeSD.setPaintTicks(true);
        return rangeSD;
    }
    
    public JLabel getRangeVal()
    {
        JLabel rangeVal = new JLabel("" + getRangeSD().getValue() / 10.0);
        rangeVal.setLocation(275, 20);
        rangeVal.setSize(50, 20);
        return rangeVal;
    }
    
    public JLabel getHorizSpeedLB()
    {
        JLabel horizSpeedLB = new JLabel("Horizontal Speed");
        horizSpeedLB.setLocation(10, 80);
        horizSpeedLB.setSize(150, 20);
        
        return horizSpeedLB;
    }
    
    public JSlider getHorizSpeedSD()
    {
        Hashtable<Integer,JLabel> labelTable = getHashTable();
        
        final JSlider horizSpeedSD = new JSlider(10, 100, Integer.valueOf(settings[1]));
        horizSpeedSD.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent event) 
            {   
                if(!horizSpeedSD.getValueIsAdjusting())
                {
                    settingsList.updateLine("AimAssist.HSpeed= " + settings[1], 
                    "AimAssist.HSpeed= " + horizSpeedSD.getValue());
                }
            }
        });
        horizSpeedSD.setLabelTable(labelTable);
        horizSpeedSD.setLocation(8, 100);
        horizSpeedSD.setSize(250, 45);
        horizSpeedSD.setMajorTickSpacing(10);
        horizSpeedSD.setMinorTickSpacing(1);
        horizSpeedSD.setPaintLabels(true);
        horizSpeedSD.setPaintTicks(true);
        
        return horizSpeedSD;
    }
    
    public JLabel getHorizSpeedVal()
    {
        JLabel horizSpeedVal = new JLabel("" + getHorizSpeedSD().getValue() / 10.0);
        horizSpeedVal.setLocation(275, 100);
        horizSpeedVal.setSize(50, 20);
        
        return horizSpeedVal;
    }
    
    public JLabel getFOVLB()
    {
        JLabel fovLB = new JLabel("Field of View");
        fovLB.setLocation(320, 0);
        fovLB.setSize(250, 20);
        
        return fovLB;
    }
    
    public JSlider getFOVSD()
    {
        Hashtable<Integer,JLabel> labelTableFOV = getHashTableFOV();
        
        final JSlider fovSD = new JSlider(0, 3600, Integer.valueOf(settings[2]));
        fovSD.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent event) 
            {   
                if(!fovSD.getValueIsAdjusting())
                {
                    settingsList.updateLine("AimAssist.FOV= " + settings[2], 
                    "AimAssist.FOV= " + fovSD.getValue());
                }
            }
        });
        fovSD.setLabelTable(labelTableFOV);
        fovSD.setLocation(320, 20);
        fovSD.setSize(250, 45);
        fovSD.setMajorTickSpacing(600);
        fovSD.setMinorTickSpacing(60);
        fovSD.setPaintLabels(true);
        fovSD.setPaintTicks(true);
        
        return fovSD;
    }
    
    public JLabel getFOVVal()
    {
        JLabel fovVal = new JLabel("" + getFOVSD().getValue() / 10.0);
        fovVal.setLocation(580, 20);
        fovVal.setSize(50, 20);
        
        return fovVal;
    }
    
    public JLabel getVertSpeedLB()
    {
        JLabel vertSpeedLB = new JLabel("Vertical Speed");
        vertSpeedLB.setLocation(320, 80);
        vertSpeedLB.setSize(150, 20);
        
        return vertSpeedLB;
    }
    
    public JSlider getVertSpeedSD()
    {
        Hashtable<Integer,JLabel> labelTable = getHashTable();
        
        final JSlider vertSpeedSD = new JSlider(10, 100, Integer.valueOf(settings[3]));
        vertSpeedSD.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent event) 
            {   
                if(!vertSpeedSD.getValueIsAdjusting())
                {
                    settingsList.updateLine("AimAssist.VSpeed= " + settings[3], 
                    "AimAssist.VSpeed= " + vertSpeedSD.getValue());
                }
            }
        });
        vertSpeedSD.setLabelTable(labelTable);
        vertSpeedSD.setLocation(320, 100);
        vertSpeedSD.setSize(250, 45);
        vertSpeedSD.setMajorTickSpacing(10);
        vertSpeedSD.setMinorTickSpacing(1);
        vertSpeedSD.setPaintLabels(true);
        vertSpeedSD.setPaintTicks(true);
        
        return vertSpeedSD;
    }
    
    public JLabel getVertSpeedVal()
    {
        JLabel vertSpeedVal = new JLabel("" + getVertSpeedSD().getValue() / 10.0);
        vertSpeedVal.setLocation(590, 100);
        vertSpeedVal.setSize(50, 20);
        
        return vertSpeedVal;
    }
     
    
    public JCheckBox getClickAimBX()
    {
        final JCheckBox ca = new JCheckBox("Click-Aim");
        if(settings[4].equals("true"))
            ca.setSelected(true);
        ca.addItemListener(new ItemListener()
        {
          public void itemStateChanged(ItemEvent event) 
          {   
              settingsList.updateLine("AimAssist.Click-Aim= " + settings[4], 
              "AimAssist.Click-Aim= " + ca.isSelected());
          }
        });
        ca.setLocation(0, 160);
        ca.setSize(150, 20);
        return ca;
    }
    
    public JCheckBox getInvisiblesBX()
    {
        final JCheckBox inv = new JCheckBox("Invisibles");
        if(settings[5].equals("true"))
            inv.setSelected(true);
        inv.addItemListener(new ItemListener()
        {
          public void itemStateChanged(ItemEvent event) 
          {   
              settingsList.updateLine("AimAssist.Invisibles= " + settings[5], 
              "AimAssist.Invisibles= " + inv.isSelected());
          }
        });
        inv.setLocation(0, 185);
        inv.setSize(150, 20);
        return inv;
    }
}
