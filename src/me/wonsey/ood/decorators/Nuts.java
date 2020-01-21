/**
 * 
 */
package me.wonsey.ood.decorators;

import me.wonsey.ood.BakedGood;
import me.wonsey.ood.BakedGoodDecorator;

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
