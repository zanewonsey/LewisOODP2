/**
 * 
 */
package me.wonsey.ood;

/**
 * @author wonseyzd
 *
 */
public abstract class BakedGood
{
   protected String description = "Unknown Baked Good";
   
   public String getDescription()
   {
	   return this.description;
   }
   
   public abstract double cost();
}
