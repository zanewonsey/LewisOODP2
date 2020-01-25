package me.wonsey.ood;

import java.util.Scanner;

import me.wonsey.ood.decorators.ChocolateFrosting;
import me.wonsey.ood.decorators.IceCream;
import me.wonsey.ood.decorators.Nuts;
import me.wonsey.ood.decorators.Sprinkles;
import me.wonsey.ood.decorators.WhippedCream;

// This enum is here to avoid obscure 'option 1, 2, 3, etc'
//  in the dialog. It also makes the switch statements more
//  readable
enum InputOptions
{
   INVALID,
   CAKE,
   PIE,
   DOUGHNUT,
   COOKIE,
   TOPPINGS,
   SPRINKLES,
   ICECREAM,
   NUTS,
   WHIPPEDCREAM,
   CHOCOLATEFROSTING,
   BASICEXAMPLE,
   BACK,
   RESET,
   EXIT
}

public class Driver
{
    static InputOptions options;
    static boolean bRunning = true;
    static BakedGood food = null;
    static Scanner user_in = new Scanner(System.in);

    /**
     * The main driving function of the program.
     */
   /*public static void main(String[] args)
   {
       Gui.buildGui("Mr. Baked's Bakery", 600, 800);
      while (bRunning)
      {
         printMenu();
         try
         {
            // The toUpper is actually needed,
            // java.lang.IllegalArgumentException otherwise
            options = InputOptions.valueOf(user_in.next().toUpperCase());
            switch (options)
            {
            case CAKE:
                food = new Cake();
                manageDecoratorMenu();
               break;
            case PIE:
                food = new Pie();
                manageDecoratorMenu();
                break;
            case DOUGHNUT:
                food = new Doughnut();
                manageDecoratorMenu();
                break;
            case COOKIE:
                food = new Cookie();
                manageDecoratorMenu();
                break;
            case TOPPINGS:
                manageDecoratorMenu();
                break;
            case RESET:
                food = null;
                System.out.println("Tossed the baked good in the bin\n");
                break;
            case EXIT:
                bRunning = false;
                break;
            default:
               throw new Exception();
            }
         }
         // The only exception should be the one thrown is by the valueOf
         //  call or the default case. Thinking now, the default case
         //  probably doesn't get ran but either way this is fine.
         catch (Exception e)
         {
            System.out.println("Invalid input: enter an item on sale,"
                               + "or exit to end the sale.\n");
         }
         
         // Added this check to remove last print when exiting
         if (bRunning)
         {
             // The ternary checks are there to remove need for the extra
             //  unneeded if statements
            System.out.println("Your current selection: "
                               +((food != null) ? food.getDescription() : "none"));
            System.out.println("Current total: $"+((food != null) ? food.cost() : "$0.00"));
         }
         
      }
      
      // Need to make sure resource is closed off
      user_in.close();
      
   }*/
   
   static void manageDecoratorMenu()
   {
      while (bRunning)
      {
         printDecoratorMenu();
         try
         {
            // The toUpper is actually needed,
            // java.lang.IllegalArgumentException otherwise
            options = InputOptions.valueOf(user_in.next().toUpperCase());
            switch (options)
            {
            case SPRINKLES:
               food = new Sprinkles(food);
               break;
            case ICECREAM:
               food = new IceCream(food);
              break;
            case NUTS:
               food = new Nuts(food);
               break;
            case WHIPPEDCREAM:
               food = new WhippedCream(food);
               break;
            case CHOCOLATEFROSTING:
               food = new ChocolateFrosting(food);
               break;
            case BACK:
               return;
             default:
               throw new Exception();
             }
         }
         // The only exception should be the one thrown is by the valueOf
         //  call or the default case. Thinking now, the default case
         //  probably doesn't get ran but either way this is fine.
         catch (Exception e)
         {
            System.out.println("Invalid input: enter a topping that is available,"
                               + "or back to return to the main menu.\n");
         }
         
         // This isn't reached if 'back' was selected
         System.out.println("Your current selection: "+food.getDescription());
         System.out.println("Current total: $"+food.cost());
      }
   }
   
   static void printDecoratorMenu()
   {
       System.out.println("Please type one of the following to add a topping:");
       System.out.print  (InputOptions.SPRINKLES.toString().toLowerCase()+", ");
       System.out.print  (InputOptions.ICECREAM.toString().toLowerCase()+", ");
       System.out.print  (InputOptions.NUTS.toString().toLowerCase()+", ");
       System.out.print  (InputOptions.WHIPPEDCREAM.toString().toLowerCase()+", ");
       System.out.println(InputOptions.CHOCOLATEFROSTING.toString().toLowerCase());
       
       System.out.println("You can also enter back to return to the main menu.");
       
   }
   
   static void printMenu()
   {
       System.out.println("Please type one of the following to get started:");
       System.out.print  (InputOptions.CAKE.toString().toLowerCase()+", ");
       System.out.print  (InputOptions.COOKIE.toString().toLowerCase()+", ");
       System.out.print  (InputOptions.DOUGHNUT.toString().toLowerCase()+", ");
       System.out.println(InputOptions.PIE.toString().toLowerCase()+"\n");
       
       System.out.print  ("You can also enter reset to toss out your current selection,\n"
                          +" toppings to continue with your current selection,\n"
                          +" or exit to walk away.");
   }
   
}

