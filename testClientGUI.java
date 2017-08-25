package com.Pokeeee;

/**

 * Name: Pokeeee

 * Date: 7 / 20 / 2017
 * Program: AJSGuildModGUI.java
 * Purpose: Brings everything together in the GUI
 */

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class testClientGUI extends JFrame
{
    private JFrame window;
    private JPanel[] panels;
    private JTabbedPane tabs; 
    private reachTab reach;
    private aimAssistTab aim;
    private triggerBotTab tb;
    private velocityTab vc;
    private autoClickerTab ac;
    private hitBoxesTab hb;
    private homeTab home;
    private keyBindsTab kb;
    private fullBrightTab fb;
    
    public testClientGUI()
    {
        tabs = new JTabbedPane(JTabbedPane.LEFT);
        reach = new reachTab();
        aim = new aimAssistTab();
        tb = new triggerBotTab();
        vc = new velocityTab();
        ac = new autoClickerTab();
        hb = new hitBoxesTab();
        kb = new keyBindsTab();
        home = new homeTab();
        fb = new fullBrightTab();
        createWindow();
        createPanels();
        createTabs();
        reachTab();
        aimAssistTab();
        triggerBotTab();
        velocityTab();
        autoClickerTab();
        hitBoxesTab();
        fullBrightTab();
        homeTab();
        keyBindsTab();
        window.pack();
        window.setMinimumSize(null);
    }
    
    public void createWindow()
    {
        window = new JFrame("AJS Guild Mod v1.0");
        window.setVisible(true);
    }
   
    public void createPanels()
    {
        panels = new JPanel[12];
        
        for(int i = 0; i < panels.length; i++)
        {
           panels[i] = new JPanel();
           panels[i].setLayout(null);
        }
    }
    
    public void createTabs()
    {   
        tabs.setPreferredSize(new Dimension(725, 236));
        tabs.add("Home", panels[0]);
        tabs.add("KeyBinds", panels[1]);
        tabs.add("Aim Assist", panels[2]);
        tabs.add("AutoClicker", panels[3]);
        tabs.add("Fastplace", panels[4]);
        tabs.add("Fullbright", panels[5]);
        tabs.add("HitBoxes", panels[6]);
        tabs.add("Reach", panels[7]);
        tabs.add("Sprint", panels[8]);
        tabs.add("TriggerBot", panels[9]);
        tabs.add("Velocity", panels[10]);
        tabs.add("W-Tap", panels[11]);
        window.add(tabs);
    }
    
    public void homeTab()
    {
        JLabel info = home.getInfo();
        JScrollPane modulesPane = home.getScrollPane();
        panels[0].add(home.getInfo());
        panels[0].add(home.getScrollPane());
    }
    
    public void keyBindsTab()
    {
        panels[1].add(kb.getAimAssist());
        panels[1].add(kb.getAutoClicker());
        panels[1].add(kb.getFastPlace());
        panels[1].add(kb.getFullBright());
        panels[1].add(kb.getHitBoxes());
        panels[1].add(kb.getReach());
        panels[1].add(kb.getSprint());
        panels[1].add(kb.getTriggerBot());
        panels[1].add(kb.getVelocity());
        panels[1].add(kb.getWTap());
        panels[1].add(kb.getAimScrollPane());
        panels[1].add(kb.getACScrollPane());
        panels[1].add(kb.getFBScrollPane());
        panels[1].add(kb.getFPScrollPane());
        panels[1].add(kb.getHBScrollPane());
        panels[1].add(kb.getReachScrollPane());
        panels[1].add(kb.getSprintScrollPane());
        panels[1].add(kb.getTBScrollPane());
        panels[1].add(kb.getVCScrollPane());
        panels[1].add(kb.getWTapScrollPane());
    }
    
    public void aimAssistTab()
    {
        JLabel rangeLB = aim.getRangeLB();
        final JSlider rangeSD = aim.getRangeSD();
        final JLabel rangeVal = aim.getRangeVal();
        JLabel horizSpeedLB = aim.getHorizSpeedLB();
        final JSlider horizSpeedSD = aim.getHorizSpeedSD();
        final JLabel horizSpeedVal = aim.getHorizSpeedVal();
        JLabel vertSpeedLB = aim.getVertSpeedLB();
        final JSlider vertSpeedSD = aim.getVertSpeedSD();
        final JLabel vertSpeedVal = aim.getVertSpeedVal();
        JLabel FOVLB = aim.getFOVLB();
        final JSlider FOVSD = aim.getFOVSD();
        final JLabel FOVVal = aim.getFOVVal();
        panels[2].add(rangeLB);
        panels[2].add(rangeSD);
        panels[2].add(horizSpeedLB);
        panels[2].add(horizSpeedSD);
        panels[2].add(vertSpeedLB);
        panels[2].add(vertSpeedSD);
        panels[2].add(FOVLB);
        panels[2].add(FOVSD);
        panels[2].add(rangeVal);
        panels[2].add(horizSpeedVal);
        panels[2].add(vertSpeedVal);
        panels[2].add(FOVVal);
        panels[2].add(aim.getClickAimBX());
        panels[2].add(aim.getInvisiblesBX());
        
        rangeSD.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent event) 
            {   
                rangeVal.setText("" + rangeSD.getValue() / 10.0);
            }
        });
        
        horizSpeedSD.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent event) 
            {   
                horizSpeedVal.setText("" + horizSpeedSD.getValue() / 10.0);
            }
        });
        
        vertSpeedSD.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent event) 
            {   
                vertSpeedVal.setText("" + vertSpeedSD.getValue() / 10.0);
            }
        });
        
        FOVSD.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent event) 
            {   
                FOVVal.setText("" + FOVSD.getValue() / 10.0);
            }
        });
        
    }
    
    public void autoClickerTab()
    {
        JLabel maxLB = ac.getMaxLB();
        final JSlider maxSD = ac.getMaxSD();
        final JLabel maxVal = ac.getMaxVal();
        JLabel minLB = ac.getMinLB();
        final JSlider minSD = ac.getMinSD();
        final JLabel minVal = ac.getMinVal();
        
        panels[3].add(maxLB);
        panels[3].add(maxSD);
        panels[3].add(maxVal);
        panels[3].add(minLB);
        panels[3].add(minSD);
        panels[3].add(minVal);
        panels[3].add(ac.getBlockHitBX());
        
        
        maxSD.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent event) 
            {   
                maxVal.setText("" + maxSD.getValue() / 10.0);
            }
        });
        
        minSD.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent event) 
            {   
                minVal.setText("" + minSD.getValue() / 10.0);
            }
        });
    }
    
    public void fastPlaceTab()
    {
        
    }
    
    public void fullBrightTab()
    {
        panels[5].add(fb.getBlindness());
    }
    
    public void hitBoxesTab()
    {
        JLabel HBLB = hb.getHBLB();
        final JSlider HBSD = hb.getHBSD();
        final JLabel HBVal = hb.getHBVal(); 
        panels[6].add(HBLB);
        panels[6].add(HBSD);
        panels[6].add(HBVal);  
        
        HBSD.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent event) 
            {   
                HBVal.setText("" + HBSD.getValue() / 1000.0);
            }
        });
    }
    
    public void reachTab()
    {
        JLabel rangeLB = reach.getRangeLB();
        final JSlider reachSD = reach.getReachSD();
        final JLabel reachVal = reach.getReachVal();
        panels[7].add(rangeLB);
        panels[7].add(reachSD);
        panels[7].add(reachVal);
        
        reachSD.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent event) 
            {   
                reachVal.setText("" + reachSD.getValue() / 10.0);
            }
        });
    }
    
    public void sprintTab()
    {
        
    }
    
    public void triggerBotTab()
    {
        JLabel maxLB = tb.getMaxLB();
        final JSlider maxSD = tb.getMaxSD();
        final JLabel maxVal = tb.getMaxVal();
        JLabel minLB = tb.getMinLB();
        final JSlider minSD = tb.getMinSD();
        final JLabel minVal = tb.getMinVal();
        JLabel rangeLB = tb.getRangeLB();
        final JSlider rangeSD = tb.getRangeSD();
        final JLabel rangeVal = tb.getRangeVal();
        JLabel FOVLB = tb.getFOVLB();
        final JSlider FOVSD = tb.getFOVSD();
        final JLabel FOVVal = tb.getFOVVal();
        
        panels[9].add(maxLB);
        panels[9].add(maxSD);
        panels[9].add(maxVal);
        panels[9].add(minLB);
        panels[9].add(minSD);
        panels[9].add(minVal);
        panels[9].add(rangeLB);
        panels[9].add(rangeSD);
        panels[9].add(rangeVal);
        panels[9].add(FOVLB);
        panels[9].add(FOVSD);
        panels[9].add(FOVVal);
        panels[9].add(tb.getKeepSprint());
        panels[9].add(tb.getHoldMouse());
        
        maxSD.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent event) 
            {   
                maxVal.setText("" + maxSD.getValue() / 10.0);
            }
        });
        
        minSD.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent event) 
            {   
                minVal.setText("" + minSD.getValue() / 10.0);
            }
        });
        
        rangeSD.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent event) 
            {   
                rangeVal.setText("" + rangeSD.getValue() / 10.0);
            }
        });
        
        FOVSD.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent event) 
            {   
                FOVVal.setText("" + FOVSD.getValue() / 10.0);
            }
        });
    }
    
    public void velocityTab()
    {
        JLabel HVLB = vc.getHVLB();
        final JSlider HVSD = vc.getHVSD();
        final JLabel HVVal = vc.getHVVal();
        JLabel VVLB = vc.getVVLB();
        final JSlider VVSD = vc.getVVSD();
        final JLabel VVVal = vc.getVVVal();
        panels[10].add(HVLB);
        panels[10].add(HVSD);
        panels[10].add(HVVal);
        panels[10].add(VVLB);
        panels[10].add(VVSD);
        panels[10].add(VVVal);
        
        HVSD.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent event) 
            {   
                HVVal.setText("" + HVSD.getValue() / 10.0 + "%");
            }
        });
        
        VVSD.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent event) 
            {   
                VVVal.setText("" + VVSD.getValue() / 10.0 + "%");
            }
        });
    }
    
    public void WTapTab()
    {
        
    }
}