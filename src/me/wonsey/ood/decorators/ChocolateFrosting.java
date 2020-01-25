/**
 * 
 */
package me.wonsey.ood.decorators;

import me.wonsey.ood.BakedGood;
import me.wonsey.ood.BakedGoodDecorator;
import me.wonsey.ood.P2UI;

public class ChocolateFrosting extends BakedGoodDecorator
{
	BakedGood bakedItem;
	
	/**
	 * 
	 */
	public ChocolateFrosting(BakedGood bakedItem)
	{
		this.bakedItem = bakedItem;
		P2UI.textArea.append("adding chocolate frosting to: "+bakedItem.getDescription()+"\n");
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
