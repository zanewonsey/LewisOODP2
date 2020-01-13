package me.wonsey.ood;

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
