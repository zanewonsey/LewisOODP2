/**
 * 
 */
package me.wonsey.ood.decorators;

import me.wonsey.ood.BakedGood;
import me.wonsey.ood.BakedGoodDecorator;

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
