package me.wonsey.ood.concrete.bakery;

import me.wonsey.ood.BakedGood;

public abstract class Bakery
{
   abstract BakedGood bake(String type);
   
   public String getDescription()
   {
      return "Generic run of the mill bakery";
   }
   
   public BakedGood orderBakedGood(String type)
   {
      BakedGood bakedgood = bake(type);
      
      bakedgood.prepare();
      bakedgood.packageGoods();
      
      return bakedgood;
   }
}
