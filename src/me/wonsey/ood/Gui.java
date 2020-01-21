package me.wonsey.ood;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class Gui
{
   static Gui gui = null;
   
   JFrame frame;
   
   JPanel panelConcrete;
   JButton buttonPie;
   JButton buttonCake;
   JButton buttonDoughnut;
   JButton buttonCookie;
   
   JPanel panelDecorators;
   JButton buttonSprinkles;
   JButton buttonNuts;
   JButton buttonWhippedCream;
   JButton buttonIceCream;
   JButton buttonChocolateFrosting;
   
   JMenuBar menuBar;
   JMenu menuFile;
   JMenu menuHelp;
   
   private Gui(String title, int height, int width)
   {
      frame = new JFrame(title);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(height,width);
      
      menuBar = new JMenuBar();
      menuFile = new JMenu("FILE");
      menuHelp = new JMenu("Help");
      menuBar.add(menuFile);
      menuBar.add(menuHelp);
      
      panelConcrete = new JPanel();
      panelDecorators = new JPanel();
      
      buttonPie = new JButton("Pie");
      buttonPie.addActionListener(new ActionListener()
      {
         
         @Override
         public void actionPerformed(ActionEvent e)
         {
            System.out.println("Pie stuff");
         }
      });
      buttonCake = new JButton("Cake");
      buttonCake.addActionListener(new ActionListener()
      {
         
         @Override
         public void actionPerformed(ActionEvent e)
         {
            System.out.println("Cake stuff");
         }
      });
      buttonDoughnut = new JButton("Doughnut");
      buttonDoughnut.addActionListener(new ActionListener()
      {
         
         @Override
         public void actionPerformed(ActionEvent e)
         {
            System.out.println("Doughnut stuff");
         }
      });
      buttonCookie = new JButton("Cookie");
      buttonCookie.addActionListener(new ActionListener()
      {
         
         @Override
         public void actionPerformed(ActionEvent e)
         {
            System.out.println("Cookie stuff");
         }
      });
      
      panelConcrete.add(buttonPie);
      panelConcrete.add(buttonCake);
      panelConcrete.add(buttonDoughnut);
      panelConcrete.add(buttonCookie);
      
      frame.getContentPane().add(BorderLayout.NORTH,menuBar);
      frame.getContentPane().add(panelConcrete);
      frame.setVisible(true);
   }
   
   public static void buildGui(String title, int height, int width)
   {
      if (gui == null)
      {
         gui = new Gui(title, height, width);
      }
   }
}
