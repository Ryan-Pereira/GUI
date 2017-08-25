package com.Pokeeee;

/**

 * Name: Pokeeee
 * Date: 7 / 19 / 2017
 * Program: triggerBotTab.java
 * Purpose: TriggerBot panel; code for all the options
 */

import javax.swing.*;
import java.awt.*;
import java.util.Hashtable;
import javax.swing.event.*;
import java.awt.event.*;

public class triggerBotTab
{
    private String[] settings;
    private settings settingsList;
    
    public triggerBotTab()
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
    
    public Hashtable<Integer,JLabel> getHashTable()
    {
        Hashtable<Integer,JLabel> labelTable = new Hashtable<Integer,JLabel>();
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
        final JSlider maxSD = new JSlider(0, 200, Integer.valueOf(settings[13]));
        maxSD.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent event) 
            {   
                if(!maxSD.getValueIsAdjusting())
                {
                    settingsList.updateLine("TriggerBot.Max= " + settings[13], 
                    "TriggerBot.Max= " + maxSD.getValue());
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
        final JSlider minSD = new JSlider(0, 200, Integer.valueOf(settings[14]));
        minSD.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent event) 
            {   
                if(!minSD.getValueIsAdjusting())
                {
                    settingsList.updateLine("TriggerBot.Min= " + settings[14], 
                    "TriggerBot.Min= " + minSD.getValue());
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
    
    public JSlider getRangeSD()
    {
        Hashtable<Integer,JLabel> labelTable = getHashTable();
        final JSlider rangeSD = new JSlider(30, 80, Integer.valueOf(settings[15]));
        rangeSD.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent event) 
            {   
                if(!rangeSD.getValueIsAdjusting())
                {
                    settingsList.updateLine("TriggerBot.Range= " + settings[15], 
                    "TriggerBot.Range= " + rangeSD.getValue());
                }
            }
        });
        rangeSD.setLabelTable(labelTable);
        rangeSD.setLocation(320, 20);
        rangeSD.setSize(150, 45);
        rangeSD.setMajorTickSpacing(10);
        rangeSD.setMinorTickSpacing(1);
        rangeSD.setPaintLabels(true);
        rangeSD.setPaintTicks(true); 
        return rangeSD;
    }
    
    public JLabel getRangeVal()
    {
        JLabel reachVal = new JLabel("" + getRangeSD().getValue() / 10.0);
        reachVal.setLocation(500, 20);
        reachVal.setSize(50, 20);
        return reachVal;
    }
    
    public JLabel getFOVLB()
    {
        JLabel fovLB = new JLabel("Field of View");
        fovLB.setLocation(320, 80);
        fovLB.setSize(250, 20);
        return fovLB;
    }
    
    public JSlider getFOVSD()
    {
        Hashtable<Integer,JLabel> labelTableFOV = getHashTableFOV();
        final JSlider fovSD = new JSlider(0, 3600, Integer.valueOf(settings[16]));
        fovSD.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent event) 
            {   
                if(!fovSD.getValueIsAdjusting())
                {
                    settingsList.updateLine("TriggerBot.FOV= " + settings[16], 
                    "TriggerBot.FOV= " + fovSD.getValue());
                }
            }
        });
        fovSD.setLabelTable(labelTableFOV);
        fovSD.setLocation(320, 100);
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
        fovVal.setLocation(580, 100);
        fovVal.setSize(50, 20);
        return fovVal;
    }
    
    public JCheckBox getKeepSprint()
    {
        final JCheckBox ks = new JCheckBox("Keep Sprint");
        if(settings[17].equals("true"))
            ks.setSelected(true);
        ks.addItemListener(new ItemListener()
        {
          public void itemStateChanged(ItemEvent event) 
          {   
              settingsList.updateLine("TriggerBot.KeepSprint= " + settings[17], 
              "TriggerBot.KeepSprint= " + ks.isSelected());
          }
        });
        ks.setLocation(0, 160);
        ks.setSize(150, 20);
        return ks;
    }
    
    public JCheckBox getHoldMouse()
    {
        final JCheckBox hm = new JCheckBox("Hold Mouse");
        if(settings[18].equals("true"))
            hm.setSelected(true);
        hm.addItemListener(new ItemListener()
        {
          public void itemStateChanged(ItemEvent event) 
          {   
              settingsList.updateLine("TriggerBot.HoldMouse= " + settings[18], 
              "TriggerBot.HoldMouse= " + hm.isSelected());
          }
        });
        hm.setLocation(0, 185);
        hm.setSize(150, 20);
        return hm;
    }
}
