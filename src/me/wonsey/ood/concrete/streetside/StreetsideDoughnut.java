package me.wonsey.ood.concrete.streetside;

import me.wonsey.ood.BakedGood;

public class StreetsideDoughnut extends BakedGood
{
   public StreetsideDoughnut()
   {
      this.description = "StreetsideDoughnut";
   }

   @Override
   public double cost()
   {
      return 0.99;
   }

}
