package me.wonsey.ood.concrete;

import me.wonsey.ood.BakedGood;

public class Cake extends BakedGood
{

	public Cake()
	{
		this.description = "Cake";
	}
	
	@Override
	public double cost()
	{
		return 11.99;
	}

}
