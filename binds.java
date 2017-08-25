package com.Pokeeee;

/**

 * Name: Pokeeee
 * Date: 7 / 19 / 2017
 * Program: binds.java
 * Purpose: Reads binds file
 */

import java.io.*;
import java.util.Scanner;

public class binds
{ 
   private char[] binds;

   public void getBindVals()
   {
       try
       {
        @SuppressWarnings("resource")
		Scanner keyBinds = new Scanner(new File("keyBinds.txt"));
           binds = new char[10];
           for(int i = 0; keyBinds.hasNextLine(); i++)
           {
               keyBinds.next();
               binds[i] = keyBinds.next().charAt(0); 
           }
       }
       catch(Exception e)
       {
           //System.out.println("Error! Missing binds file!");
       }
   }
   
   public void updateLine(String toUpdate, String updated)
   {
       try
       {
           BufferedReader file = new BufferedReader(new FileReader("keyBinds.txt"));
           String line;
           String input = "";
    
           while ((line = file.readLine()) != null)
           {
               input += line + "\r\n";
           }
    
           input = input.replace(toUpdate, updated);
    
           FileOutputStream os = new FileOutputStream("keyBinds.txt");
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
            RandomAccessFile raf = new RandomAccessFile("keyBinds.txt", "rw");
            long length = raf.length(); 
            raf.setLength(length - 1);
            raf.close();
       }
       catch(Exception ex)
       {
           //System.out.println("Error! Missing binds file!");
       }
   }
   
   public char[] getBinds() 
   {
       getBindVals();
       return binds;
   }
}
