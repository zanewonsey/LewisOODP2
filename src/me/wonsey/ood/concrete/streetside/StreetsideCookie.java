package me.wonsey.ood.concrete.streetside;

import me.wonsey.ood.BakedGood;

public class StreetsideCookie extends BakedGood
{
   public StreetsideCookie()
   {
      this.description = "StreetsideCookie";
   }

   @Override
   public double cost()
   {
      return 0.25;
   }

}
