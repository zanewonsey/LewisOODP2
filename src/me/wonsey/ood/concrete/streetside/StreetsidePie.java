package me.wonsey.ood.concrete.streetside;

import me.wonsey.ood.BakedGood;

public class StreetsidePie extends BakedGood
{
   public StreetsidePie()
   {
      this.description = "StreetsidePie";
   }

   @Override
   public double cost()
   {
      return 13.95;
   }

}
