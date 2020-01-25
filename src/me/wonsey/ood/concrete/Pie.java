package me.wonsey.ood.concrete;

import me.wonsey.ood.BakedGood;

public class Pie extends BakedGood
{

	public Pie()
	{
		this.description = "Pie";
	}
	
	@Override
	public double cost() {
		return 5.99;
	}

}
