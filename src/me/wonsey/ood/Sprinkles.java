/**
 * 
 */
package me.wonsey.ood;

public class Sprinkles extends BakedGoodDecorator
{
	BakedGood bakedItem;
	
	/**
	 * 
	 */
	public Sprinkles(BakedGood bakedItem)
	{
		this.bakedItem = bakedItem;
	}

	/**
	 * 
	 */
	@Override
	public String getDescription()
	{
		return bakedItem.getDescription() + ", with spinkles";
	}

	/**
	 * 
	 */
	@Override
	public double cost()
	{
		return 0.1 + this.bakedItem.cost();
	}

}
