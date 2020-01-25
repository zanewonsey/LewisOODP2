package me.wonsey.ood.concrete.streetside;

import me.wonsey.ood.BakedGood;

public class StreetsideCake extends BakedGood
{
   public StreetsideCake()
   {
      this.description = "StreetsideCake";
   }

   @Override
   public double cost()
   {
      return 99.0;
   }

}
