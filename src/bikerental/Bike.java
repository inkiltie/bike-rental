package bikerental;

/**
 * This class contains 2 get and set methods for bike models and their daily rates.
 */

public class Bike {
	private String bikeModel; //asks for the bike model
	private double bikeDailyRate; //takes daily cost of the particular bike
	
	/**
	 * This method get bike model
	 * @return bikeModel Specific bike model
	 */
	
	public String getBikeModel()
	{
		return bikeModel;
	}
	
	/**
	 * This method get daily rate of specific bike model
	 * @return bikeDailyRate Daily rate of specific bike model
	 */
	
	public double getBikeDailyRate()
	{
		return bikeDailyRate;
	}
	
	/**
	 * This method set bike model
	 * @param bikeModelToSet Specific bike model
	 */
	
	public void setBikeModel(String bikeModelToSet)
	{
		bikeModel = bikeModelToSet;
	}
	
	/**
	 * This method set daily rate of specific bike model
	 * @param bikeDailyRateToSet Daily rate of specific bike model
	 */
	
	public void setBikeDailyRate(double bikeDailyRateToSet)
	{
		bikeDailyRate = bikeDailyRateToSet;
	}
}