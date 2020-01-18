/**
 * 
 */
package me.wonsey.ood;

public class ChocolateFrosting extends BakedGoodDecorator
{
	BakedGood bakedItem;
	
	/**
	 * 
	 */
	public ChocolateFrosting(BakedGood bakedItem)
	{
		this.bakedItem = bakedItem;
	}

	/**
	 * 
	 */
	@Override
	public String getDescription()
	{
		return bakedItem.getDescription() + ", with chocolate frosting";
	}

	/**
	 * 
	 */
	@Override
	public double cost()
	{
		return 0.5 + this.bakedItem.cost();
	}
}
