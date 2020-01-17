package me.wonsey.ood;

import java.util.Scanner;

public class Driver
{

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
            user_choice = Integer.parseInt(user_in.next());
            switch (user_choice)
            {
            case 1:
               break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
               System.out.println("Invalid input: enter a number");
               break;
            }
         }
         catch (Exception e)
         {
            System.out.println("Invalid input: enter a number");
         }
      }
      
      user_in.close();
      
   }
   
   static void printMenu()
   {
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
   }
   
   
   
   
   
   
   

}
