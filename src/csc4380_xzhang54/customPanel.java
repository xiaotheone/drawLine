/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc4380_xzhang54;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Xiao
 */
public class customPanel extends JPanel{
     int x1,x2,y1,y2;
     
      public void drawLine(Graphics g)
      {
        g.setColor(Color.BLACK);
       g.drawLine(x1,x2,y1,y2);
      }
      
       public void drawRect(Graphics g)
      {
        g.setColor(Color.BLACK);
       g.drawRect(x1,x2,y1,y2);
      }
       public void clear()
       {
       repaint();
       }
     
      public void paintComponent(Graphics g)
     {
      super.paintComponent(g);
     }
     
      
  

}
