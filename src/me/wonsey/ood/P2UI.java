package me.wonsey.ood;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

import me.wonsey.ood.concrete.bakery.Bakery;
import me.wonsey.ood.concrete.bakery.HomestyleBakery;
import me.wonsey.ood.concrete.bakery.StreetsideBakery;
import me.wonsey.ood.decorators.*;

import javax.swing.JLabel;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

public class P2UI
{
   
   private BakedGood bakedgood = null;
   private Bakery bakery = null;
   
   // UpdateGUI is just to easily lump it all together
   private void updateUI()
   {
      lblNewLabel.setText((bakedgood == null) ? "$0.00" : "$"+Double.toString(bakedgood.cost()));
      lblNewLabel_1.setText((bakedgood == null) ? "No item selected" : bakedgood.getDescription());
      lblNewLabel_2.setText((bakery == null) ? "this shouldn't happen but just in case" : bakery.getDescription());
   }

   private JFrame frame;
   JLabel lblNewLabel_2;
   JLabel lblNewLabel_1;
   JLabel lblNewLabel;
   public static JTextArea textArea;

   /**
    * Launch the application.
    */
   public static void main(String[] args)
   {
      EventQueue.invokeLater(new Runnable()
      {
         public void run()
         {
            try
            {
               P2UI window = new P2UI();
               window.frame.setVisible(true);
            } catch (Exception e)
            {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the application.
    */
   public P2UI()
   {
      // So we don't have to litter null checks everywhere
      // we will just default it to this.
      bakery = new HomestyleBakery();
      initialize();
      updateUI();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize()
   {
      frame = new JFrame();
      frame.setBounds(100, 100, 1024, 377);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      JMenuBar menuBar = new JMenuBar();
      frame.setJMenuBar(menuBar);
      
      JMenu mnNewMenu = new JMenu("File");
      menuBar.add(mnNewMenu);
      
      JMenuItem mntmNewMenuItem = new JMenuItem("Exit");
      mntmNewMenuItem.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            System.exit(0);
         }
      });
      mnNewMenu.add(mntmNewMenuItem);
      frame.getContentPane().setLayout(null);
      
      JPanel panel = new JPanel();
      panel.setBounds(10, 11, 338, 115);
      frame.getContentPane().add(panel);
      panel.setLayout(null);
      
      JSplitPane splitPane = new JSplitPane();
      splitPane.setBounds(10, 10, 179, 25);
      panel.add(splitPane);
      
      JButton btnNewButton_10 = new JButton("Homestyle");
      btnNewButton_10.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent arg0)
         {
            bakery = new HomestyleBakery();
            updateUI();
         }
      });
      splitPane.setLeftComponent(btnNewButton_10);
      
      JButton btnNewButton_11 = new JButton("Streetside");
      btnNewButton_11.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            bakery = new StreetsideBakery();
            updateUI();
         }
      });
      splitPane.setRightComponent(btnNewButton_11);
      
      lblNewLabel_2 = new JLabel("Bakery type");
      lblNewLabel_2.setBounds(10, 46, 179, 14);
      panel.add(lblNewLabel_2);
      
      lblNewLabel = new JLabel("$0.00");
      lblNewLabel.setBounds(10, 68, 179, 14);
      panel.add(lblNewLabel);
      
      lblNewLabel_1 = new JLabel("Item description");
      lblNewLabel_1.setBounds(10, 93, 318, 14);
      panel.add(lblNewLabel_1);
      
      JPanel panel_1 = new JPanel();
      panel_1.setBounds(10, 137, 338, 69);
      frame.getContentPane().add(panel_1);
      
      textArea = new JTextArea();
      textArea.setBounds(358, 11, 640, 297);
      frame.getContentPane().add(textArea);
      
      JButton btnNewButton = new JButton("Clear");
      btnNewButton.setBounds(222, 23, 79, 23);
      btnNewButton.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent arg0)
         {
            bakedgood = null;
            textArea.append("Cleared baked good selection\n");
            updateUI();
         }
      });
      panel_1.setLayout(null);
      panel_1.add(btnNewButton);
      
      JButton btnNewButton_1 = new JButton("Pie");
      btnNewButton_1.setBounds(10, 39, 79, 23);
      btnNewButton_1.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            bakedgood = bakery.orderBakedGood(btnNewButton_1.getText());
            updateUI();
         }
      });
      panel_1.add(btnNewButton_1);
      
      JButton btnNewButton_7 = new JButton("Cake");
      btnNewButton_7.setBounds(10, 5, 79, 23);
      btnNewButton_7.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent arg0)
         {
            bakedgood = bakery.orderBakedGood(btnNewButton_7.getText());
            updateUI();
         }
      });
      panel_1.add(btnNewButton_7);
      
      JButton btnNewButton_8 = new JButton("Cookie");
      btnNewButton_8.setBounds(101, 5, 82, 23);
      btnNewButton_8.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            bakedgood = bakery.orderBakedGood(btnNewButton_8.getText());
            updateUI();
         }
      });
      panel_1.add(btnNewButton_8);
      
      JButton btnNewButton_9 = new JButton("Doughnut");
      btnNewButton_9.setBounds(104, 39, 108, 23);
      btnNewButton_9.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            bakedgood = bakery.orderBakedGood(btnNewButton_9.getText());
            updateUI();
         }
      });
      panel_1.add(btnNewButton_9);
      
      JPanel panel_2 = new JPanel();
      panel_2.setBounds(10, 217, 338, 91);
      frame.getContentPane().add(panel_2);
      
      JButton btnNewButton_2 = new JButton("Sprinkles");
      btnNewButton_2.setBounds(10, 5, 107, 23);
      btnNewButton_2.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            bakedgood = new Sprinkles(bakedgood);
            updateUI();
         }
      });
      panel_2.setLayout(null);
      panel_2.add(btnNewButton_2);
      
      JButton btnNewButton_3 = new JButton("Nuts");
      btnNewButton_3.setBounds(127, 33, 63, 23);
      btnNewButton_3.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            bakedgood = new Nuts(bakedgood);
            updateUI();
         }
      });
      panel_2.add(btnNewButton_3);
      
      JButton btnNewButton_4 = new JButton("Whipped Cream");
      btnNewButton_4.setBounds(127, 5, 150, 23);
      btnNewButton_4.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            bakedgood = new WhippedCream(bakedgood);
            updateUI();
         }
      });
      panel_2.add(btnNewButton_4);
      
      JButton btnNewButton_5 = new JButton("Ice Cream");
      btnNewButton_5.setBounds(10, 33, 107, 23);
      btnNewButton_5.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            bakedgood = new IceCream(bakedgood);
            updateUI();
         }
      });
      panel_2.add(btnNewButton_5);
      
      JButton btnNewButton_6 = new JButton("Chocolate Frosting");
      btnNewButton_6.setBounds(10, 61, 174, 23);
      btnNewButton_6.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            bakedgood = new ChocolateFrosting(bakedgood);
            updateUI();
         }
      });
      panel_2.add(btnNewButton_6);
      
   }
}
