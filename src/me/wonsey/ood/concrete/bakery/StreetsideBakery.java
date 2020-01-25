package me.wonsey.ood.concrete.bakery;

import me.wonsey.ood.BakedGood;
import me.wonsey.ood.concrete.streetside.*;

public class StreetsideBakery extends Bakery
{
   protected BakedGood bake(String type)
   {
      switch (type)
      {
      case "Pie":
         return new StreetsidePie();
      case "Cake":
         return new StreetsideCake();
      case "Cookie":
         return new StreetsideCookie();
      case "Doughnut":
         return new StreetsideDoughnut();
      default:
         return null;
      }
   }

   public String getDescription()
   {
      return "Strip mall bakery";
   }
}
