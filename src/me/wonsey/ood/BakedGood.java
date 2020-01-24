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
   
   public void prepare()
   {
      P2UI.textArea.append("Preparing: "+getDescription()+"\n");
   }
   public void packageGoods()
   {
      P2UI.textArea.append("Packaging: "+getDescription()+"\n");
   }
   
   public String toString()
   {
      String retVal = "";
      
      return retVal;
   }
}
