/**
 * 
 */
package me.wonsey.ood.decorators;

import me.wonsey.ood.BakedGood;
import me.wonsey.ood.BakedGoodDecorator;

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
