package me.wonsey.ood;

import java.util.Scanner;

enum InputOptions
{
   INVALID,
   CAKE,
   PIE,
   DOUGHNUT,
   COOKIE,
   RESET,
   EXIT
}

public class Driver
{
    static InputOptions options;

    /**
     * The main driving function of the program. Session ends
     */
   public static void main(String[] args)
   {
      Scanner user_in = new Scanner(System.in);
      boolean bRunning = true;
      int user_choice = 0;
      
      while (bRunning)
      {
          printMenu();
         try
         {
            //user_choice = Integer.parseInt(user_in.next());
            options = InputOptions.valueOf(user_in.next().toUpperCase());
            switch (options)
            {
            case CAKE:
               break;
            case PIE:
                break;
            case DOUGHNUT:
                break;
            case COOKIE:
                break;
            case RESET:
                System.out.println("Tossed the baked good in the bin");
                break;
            case EXIT:
                bRunning = false;
                break;
            default:
               throw new Exception();
            }
         }
         catch (Exception e)
         {
            System.out.println("Invalid input: enter an item on sale, or exit to end the sale.");
         }
         System.out.println("end of while");
      }
      
      // Need to make sure resource is closed off
      user_in.close();
      
   }
   
   /**
    * 
    */
   static void printMenu()
   {
       System.out.println("Please type one of the following to get started:");
       System.out.print  (InputOptions.CAKE.toString().toLowerCase()+", ");
       System.out.print  (InputOptions.COOKIE.toString().toLowerCase()+", ");
       System.out.print  (InputOptions.DOUGHNUT.toString().toLowerCase()+", ");
       System.out.println(InputOptions.PIE.toString().toLowerCase());
       
       System.out.print  ("You can also enter reset to toss out your current selection, ");
       System.out.println("or exit to walk away.");
   }
   
   
   
   
   
   
   

}
