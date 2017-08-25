package com.Pokeeee;

/**

 * Name: Pokeeee
 * Date: 7 / 19 / 2017
 * Program: AJSGuildModGUI.java
 * Purpose: Binds
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class keyBindsTab
{   
    private char[] binds;
    private binds bindsList;
    public keyBindsTab()
    {
        updateBinds();
    }
    
    public void updateBinds()
    {
        binds = new char[10];
        bindsList = new binds();
        try
        {
            binds = bindsList.getBinds();
        }
        catch(Exception e)
        {
        }
    }
      
    public JLabel getAimAssist()
    {
        JLabel aimAssist = new JLabel();
        aimAssist.setText("Aim Assist: ");
        aimAssist.setSize(200, 20);
        aimAssist.setLocation(0, 0);
        return aimAssist;
    }
    
    public JTextField getAimBind()
    {
        final JTextField aimBind = new JTextField();
        aimBind.setDocument(new JTextFieldLimit(1));
        aimBind.setText(Character.toString(binds[0]));
        aimBind.addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent ke) 
        { 
           if(!((ke.getKeyCode()== 8) || ke.getKeyCode() == 16 || ke.getKeyCode() == 0) 
                 && aimBind.getText().equals(""))
           {
               bindsList.updateLine(
               "AimAssist= " + Character.toString(binds[0]),
               "AimAssist= " + Character.toString(ke.getKeyChar()));
               updateBinds();
           }
        }
        });
        return aimBind;
    }
    
    public JScrollPane getAimScrollPane()
    {
        JScrollPane scrollPane = new JScrollPane(getAimBind());
        scrollPane.setSize(30, 25);
        scrollPane.setLocation(80, 0);
        return scrollPane;
    }
    
    public char getAimKey()
    {
        return binds[0];
    }
    
    public JLabel getAutoClicker()
    {
        JLabel AutoClicker = new JLabel();
        AutoClicker.setText("AutoClicker: ");
        AutoClicker.setSize(200, 20);
        AutoClicker.setLocation(0, 40);
        return AutoClicker;
    }
    
    public JTextField getACBind()
    {
        final JTextField acBind = new JTextField();
        acBind.setDocument(new JTextFieldLimit(1));
        acBind.setText(Character.toString(binds[1]));
        acBind.addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent ke) 
        { 
           if(!((ke.getKeyCode()== 8) || ke.getKeyCode() == 16 || ke.getKeyCode() == 0) 
                 && acBind.getText().equals(""))
           {
               bindsList.updateLine(
               "AutoClicker= " + Character.toString(binds[1]),
               "AutoClicker= " + Character.toString(ke.getKeyChar()));
               updateBinds();
           }
        }
        });
        return acBind;
    }
    
    public JScrollPane getACScrollPane()
    {
        JScrollPane scrollPane = new JScrollPane(getACBind());
        scrollPane.setSize(30, 25);
        scrollPane.setLocation(80, 40);
        return scrollPane;
    }
    
    public JLabel getFastPlace()
    {
        JLabel FastPlace = new JLabel();
        FastPlace.setText("FastPlace: ");
        FastPlace.setSize(200, 20);
        FastPlace.setLocation(0, 80);
        return FastPlace;
    }
    
    public JTextField getFPBind()
    {
        final JTextField fpBind = new JTextField();
        fpBind.setDocument(new JTextFieldLimit(1));
        fpBind.setText(Character.toString(binds[2]));
        fpBind.addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent ke) 
        { 
           if(!((ke.getKeyCode()== 8) || ke.getKeyCode() == 16 || ke.getKeyCode() == 0) 
                 && fpBind.getText().equals(""))
           {
               bindsList.updateLine(
               "FastPlace= " + Character.toString(binds[2]),
               "FastPlace= " + Character.toString(ke.getKeyChar()));
               updateBinds();
           }
        }
        });
        return fpBind;
    }
    
    public JScrollPane getFPScrollPane()
    {
        JScrollPane scrollPane = new JScrollPane(getFPBind());
        scrollPane.setSize(30, 25);
        scrollPane.setLocation(80, 80);
        return scrollPane;
    }
    
    public JLabel getFullBright()
    {
        JLabel FullBright = new JLabel();
        FullBright.setText("FullBright: ");
        FullBright.setSize(200, 20);
        FullBright.setLocation(0, 120);
        return FullBright;
    }
    
    public JTextField getFBBind()
    {
        final JTextField fbBind = new JTextField();
        fbBind.setDocument(new JTextFieldLimit(1));
        fbBind.setText(Character.toString(binds[3]));
        fbBind.addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent ke) 
        { 
           if(!((ke.getKeyCode()== 8) || ke.getKeyCode() == 16 || ke.getKeyCode() == 0) 
                 && fbBind.getText().equals(""))
           {
               bindsList.updateLine(
               "FullBright= " + Character.toString(binds[3]),
               "FullBright= " + Character.toString(ke.getKeyChar()));
               updateBinds();
           }
        }
        });
        return fbBind;
    }
    
    public JScrollPane getFBScrollPane()
    {
        JScrollPane scrollPane = new JScrollPane(getFBBind());
        scrollPane.setSize(30, 25);
        scrollPane.setLocation(80, 120);
        return scrollPane;
    }
    
    public JLabel getHitBoxes()
    {
        JLabel HitBoxes = new JLabel();
        HitBoxes.setText("HitBoxes: ");
        HitBoxes.setSize(200, 20);
        HitBoxes.setLocation(0, 160);
        return HitBoxes;
    }
    
    public JTextField getHBBind()
    {
        final JTextField hbBind = new JTextField();
        hbBind.setDocument(new JTextFieldLimit(1));
        hbBind.setText(Character.toString(binds[4]));
        hbBind.addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent ke) 
        { 
           if(!((ke.getKeyCode()== 8) || ke.getKeyCode() == 16 || ke.getKeyCode() == 0) 
                 && hbBind.getText().equals(""))
           {
               bindsList.updateLine(
               "HitBoxes= " + Character.toString(binds[4]),
               "HitBoxes= " + Character.toString(ke.getKeyChar()));
               updateBinds();
           }
        }
        });
        return hbBind;
    }
    
    public JScrollPane getHBScrollPane()
    {
        JScrollPane scrollPane = new JScrollPane(getHBBind());
        scrollPane.setSize(30, 25);
        scrollPane.setLocation(80, 160);
        return scrollPane;
    }
    
    public JLabel getReach()
    {
        JLabel Reach = new JLabel();
        Reach.setText("Reach: ");
        Reach.setSize(200, 20);
        Reach.setLocation(0, 200);
        return Reach;
    }
    
    public JTextField getReachBind()
    {
        final JTextField reachBind = new JTextField();
        reachBind.setDocument(new JTextFieldLimit(1));
        reachBind.setText(Character.toString(binds[5]));
        reachBind.addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent ke) 
        { 
           if(!((ke.getKeyCode()== 8) || ke.getKeyCode() == 16 || ke.getKeyCode() == 0) 
                 && reachBind.getText().equals(""))
           {
               bindsList.updateLine(
               "Reach= " + Character.toString(binds[5]),
               "Reach= " + Character.toString(ke.getKeyChar()));
               updateBinds();
           }
        }
        });
        return reachBind;
    }
    
    public JScrollPane getReachScrollPane()
    {
        JScrollPane scrollPane = new JScrollPane(getReachBind());
        scrollPane.setSize(30, 25);
        scrollPane.setLocation(80, 200);
        return scrollPane;
    }
    
    public JLabel getSprint()
    {
        JLabel Sprint = new JLabel();
        Sprint.setText("Sprint: ");
        Sprint.setSize(200, 20);
        Sprint.setLocation(150, 0);
        return Sprint;
    }
    
    public JTextField getSprintBind()
    {
        final JTextField sprintBind = new JTextField();
        sprintBind.setDocument(new JTextFieldLimit(1));
        sprintBind.setText(Character.toString(binds[6]));
        sprintBind.addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent ke) 
        { 
           if(!((ke.getKeyCode()== 8) || ke.getKeyCode() == 16 || ke.getKeyCode() == 0) 
                 && sprintBind.getText().equals(""))
           {
               bindsList.updateLine(
               "Sprint= " + Character.toString(binds[6]),
               "Sprint= " + Character.toString(ke.getKeyChar()));
               updateBinds();
           }
        }
        });
        return sprintBind;
    }
    
    public JScrollPane getSprintScrollPane()
    {
        JScrollPane scrollPane = new JScrollPane(getSprintBind());
        scrollPane.setSize(30, 25);
        scrollPane.setLocation(220, 0);
        return scrollPane;
    }
    
    public JLabel getTriggerBot()
    {
        JLabel TriggerBot = new JLabel();
        TriggerBot.setText("TriggerBot: ");
        TriggerBot.setSize(200, 20);
        TriggerBot.setLocation(150, 40);
        return TriggerBot;
    }
    
    public JTextField getTBBind()
    {
        final JTextField tbBind = new JTextField();
        tbBind.setDocument(new JTextFieldLimit(1));
        tbBind.setText(Character.toString(binds[7]));
        tbBind.addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent ke) 
        { 
           if(!((ke.getKeyCode()== 8) || ke.getKeyCode() == 16 || ke.getKeyCode() == 0) 
                 && tbBind.getText().equals(""))
           {
               bindsList.updateLine(
               "TriggerBot= " + Character.toString(binds[7]),
               "TriggerBot= " + Character.toString(ke.getKeyChar()));
               updateBinds();
           }
        }
        });
        return tbBind;
    }
    
    public JScrollPane getTBScrollPane()
    {
        JScrollPane scrollPane = new JScrollPane(getTBBind());
        scrollPane.setSize(30, 25);
        scrollPane.setLocation(220, 40);
        return scrollPane;
    }
    
    public JLabel getVelocity()
    {
        JLabel Velocity = new JLabel();
        Velocity.setText("Velocity: ");
        Velocity.setSize(200, 20);
        Velocity.setLocation(150, 80);
        return Velocity;
    }
    
    public JTextField getVCBind()
    {
        final JTextField vcBind = new JTextField();
        vcBind.setDocument(new JTextFieldLimit(1));
        vcBind.setText(Character.toString(binds[8]));
        vcBind.addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent ke) 
        { 
           if(!((ke.getKeyCode()== 8) || ke.getKeyCode() == 16 || ke.getKeyCode() == 0) 
                 && vcBind.getText().equals(""))
           {
               bindsList.updateLine(
               "Velocity= " + Character.toString(binds[8]),
               "Velocity= " + Character.toString(ke.getKeyChar()));
               updateBinds();
           }
        }
        });
        return vcBind;
    }
    
    public JScrollPane getVCScrollPane()
    {
        JScrollPane scrollPane = new JScrollPane(getVCBind());
        scrollPane.setSize(30, 25);
        scrollPane.setLocation(220, 80);
        return scrollPane;
    }
    
    public JLabel getWTap() 
    {
        JLabel WTap = new JLabel();
        WTap.setText("W-Tap: ");
        WTap.setSize(200, 20);
        WTap.setLocation(150, 120);
        return WTap;
    }
    
    public JTextField getWTapBind()
    {
        final JTextField WTapBind = new JTextField();
        WTapBind.setDocument(new JTextFieldLimit(1));
        WTapBind.setText(Character.toString(binds[9]));
        WTapBind.addKeyListener(new KeyAdapter() {
        public void keyPressed(KeyEvent ke) 
        { 
           if(!((ke.getKeyCode()== 8) || ke.getKeyCode() == 16 || ke.getKeyCode() == 0) 
                 && WTapBind.getText().equals(""))
           {
               bindsList.updateLine(
               "WTap= " + Character.toString(binds[9]),
               "WTap= " + Character.toString(ke.getKeyChar()));
               updateBinds();
           }
        }
        });
        return WTapBind;
    }
    
    public JScrollPane getWTapScrollPane()
    {
        JScrollPane scrollPane = new JScrollPane(getWTapBind());
        scrollPane.setSize(30, 25);
        scrollPane.setLocation(220, 120);
        return scrollPane;
    }
    
    
}
