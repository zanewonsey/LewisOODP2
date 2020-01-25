package me.wonsey.ood.concrete;

import me.wonsey.ood.BakedGood;

public class Cookie extends BakedGood
{
	
	public Cookie()
	{
		this.description = "Cookie";
	}

	@Override
	public double cost()
	{
		return 0.99;
	}

}
