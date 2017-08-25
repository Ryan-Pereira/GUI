package com.Pokeeee;

/**

 * Name: Pokeeee
 * Date: 7 / 19 / 2017
 * Program: autoClickerTab.java
 * Purpose: AutoClicker panel; code for all the options
 */

import java.io.*;
import java.util.Scanner;

public class settings
{ 
   private String[] settings;

   public void getSettingsVals()
   {
       try
       {
        @SuppressWarnings("resource")
		Scanner settingsFile = new Scanner(new File("settings.txt"));
           settings = new String[21];
           for(int i = 0; settingsFile.hasNextLine(); i++)
           {
               settingsFile.next();
               settings[i] = settingsFile.next(); 
           }
       }
       catch(Exception e)
       {
       }
   }
   
   public void updateLine(String toUpdate, String updated)
   {
       try
       {
           BufferedReader file = new BufferedReader(new FileReader("settings.txt"));
           String line;
           String input = "";
    
           while ((line = file.readLine()) != null)
           {
               input += line + "\r\n";
           }
    
           input = input.replace(toUpdate, updated);
    
           FileOutputStream os = new FileOutputStream("settings.txt");
           os.write(input.getBytes());
    
           file.close();
           os.close();
           eraseLast();
        }
       catch(Exception e)
       {
           //System.out.println("Error! Missing binds file!");
       }
   }
   
   public void eraseLast() 
   {
       try
       {
            RandomAccessFile raf = new RandomAccessFile("settings.txt", "rw");
            long length = raf.length(); 
            raf.setLength(length - 1);
            raf.close();
       }
       catch(Exception ex)
       {
           //System.out.println("Error! Missing binds file!");
       }
   }
   
   public String[] getSettings() 
   {
       getSettingsVals();
       return settings;
   }
}
