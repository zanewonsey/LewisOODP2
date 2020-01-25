package me.wonsey.ood.concrete;

import me.wonsey.ood.BakedGood;

public class Doughnut extends BakedGood
{

	public Doughnut()
	{
		this.description = "Doughtnut";
	}
	
	@Override
	public double cost()
	{
		return 1.19;
	}

}
