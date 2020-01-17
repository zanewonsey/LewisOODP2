/**
 * 
 */
package me.wonsey.ood;

public class WhippedCream extends BakedGoodDecorator
{
	BakedGood bakedItem;
	
	/**
	 * 
	 */
	public WhippedCream(BakedGood bakedItem)
	{
		this.bakedItem = bakedItem;
	}

	/**
	 * 
	 */
	@Override
	public String getDescription()
	{
		return bakedItem.getDescription() + ", with whipped cream";
	}

	/**
	 * 
	 */
	@Override
	public double cost()
	{
		return 0.2 + this.bakedItem.cost();
	}
}
