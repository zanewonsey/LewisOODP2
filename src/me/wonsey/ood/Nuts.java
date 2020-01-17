/**
 * 
 */
package me.wonsey.ood;

public class Nuts extends BakedGoodDecorator
{
	BakedGood bakedItem;
	
	/**
	 * 
	 */
	public Nuts(BakedGood bakedItem)
	{
		this.bakedItem = bakedItem;
	}

	/**
	 * 
	 */
	@Override
	public String getDescription()
	{
		return bakedItem.getDescription() + ", with nuts";
	}

	/**
	 * 
	 */
	@Override
	public double cost()
	{
		return 0.3 + this.bakedItem.cost();
	}
}
