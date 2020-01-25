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
   
   JPanel panel;
   
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
      
      panel = new JPanel();
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
      
      buttonSprinkles = new JButton("Sprinkles");
      buttonSprinkles.addActionListener(new ActionListener()
      {
         
         @Override
         public void actionPerformed(ActionEvent e)
         {
            System.out.println("Sprinkles stuff");
         }
      });
      buttonNuts = new JButton("Nuts");
      buttonNuts.addActionListener(new ActionListener()
      {
         
         @Override
         public void actionPerformed(ActionEvent e)
         {
            System.out.println("Nuts stuff");
         }
      });
      buttonWhippedCream = new JButton("Whipped Cream");
      buttonWhippedCream.addActionListener(new ActionListener()
      {
         
         @Override
         public void actionPerformed(ActionEvent e)
         {
            System.out.println("Whipped Cream stuff");
         }
      });
      buttonIceCream = new JButton("Ice Cream");
      buttonIceCream.addActionListener(new ActionListener()
      {
         
         @Override
         public void actionPerformed(ActionEvent e)
         {
            System.out.println("Ice Cream stuff");
         }
      });
      buttonChocolateFrosting = new JButton("Chocolate Frosting");
      buttonChocolateFrosting.addActionListener(new ActionListener()
      {
         
         @Override
         public void actionPerformed(ActionEvent e)
         {
            System.out.println("Chocolate Frosting stuff");
         }
      });
      
      panelConcrete.add(buttonPie);
      panelConcrete.add(buttonCake);
      panelConcrete.add(buttonDoughnut);
      panelConcrete.add(buttonCookie);
      
      panelDecorators.add(buttonSprinkles);
      panelDecorators.add(buttonNuts);
      panelDecorators.add(buttonWhippedCream);
      panelDecorators.add(buttonIceCream);
      panelDecorators.add(buttonChocolateFrosting);
      
      panel.add(panelConcrete);
      panel.add(panelDecorators);
      
      frame.getContentPane().add(BorderLayout.NORTH,menuBar);
      frame.getContentPane().add(BorderLayout.CENTER, panel);
      //frame.getContentPane().add(BorderLayout.CENTER, panelConcrete);
      //frame.getContentPane().add(BorderLayout.SOUTH, panelDecorators);
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
