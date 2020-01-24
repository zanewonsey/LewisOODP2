package me.wonsey.ood.concrete.bakery;

import me.wonsey.ood.BakedGood;
import me.wonsey.ood.concrete.homestyle.*;
public class HomestyleBakery extends Bakery
{
   protected BakedGood bake(String type)
   {
      // switch with returns in cases looks a lot cleaner
      // with something this simple vs if else blocks
      switch (type)
      {
      case "Pie":
         return new HomestylePie();
      case "Cake":
         return new HomestyleCake();
      case "Cookie":
         return new HomestyleCookie();
      case "Doughnut":
         return new HomestyleDoughnut();
      default:
         // This should never be reached by gui code but
         // caller assumes responsibility for null checks
         return null;
      }
   }

   public String getDescription()
   {
      // My mom can't bake
      return "Mom's kitchen";
   }
}
