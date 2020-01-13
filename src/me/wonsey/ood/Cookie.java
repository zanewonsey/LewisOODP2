package me.wonsey.ood;

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
