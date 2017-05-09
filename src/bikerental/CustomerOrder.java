package bikerental;

import java.time.LocalDate;

/**
 * This class contains methods which get and set customer name, start and end rental date, number of days and options.
 */

public class CustomerOrder {
	private String customerName; // takes name of the customer
	private Bike selectedBike = new Bike(); // reference to selected bike
	private LocalDate startDate, endDate; //takes rental start and end dates
	private int numberOfDays; // number of rental days
	private double bikeLock, delivery, helmet, repairKit; //asks for the options, such as: bike lock, delivery, helmet and repair kit

	/**
	 * This method get bike model from class Bike
	 * @return selectedBike.getBikeModel() Specific bike model from class Bike
	 */
	
	public String getBikeModel()
	{
		return selectedBike.getBikeModel();
	}
	
	/**
	 * This method get daily rate of specific bike model from class Bike
	 * @return selectedBike.getBikeDailyRate() Daily rate of specific bike model from class Bike
	 */
	
	public double getBikeDailyRate()
	{
		return selectedBike.getBikeDailyRate();
	}
	
	/**
	 * This method set bike model
	 * @param bikeModelToSet Specific bike model
	 */
	
	public void setBikeModel(String bikeModelToSet)
	{
		selectedBike.setBikeModel(bikeModelToSet);
	}
	
	/**
	 * This method set daily rate of specific bike model
	 * @param bikeDailyRateToSet Daily rate of specific bike model
	 */
	
	public void setBikeDailyRate(double bikeDailyRateToSet)
	{
		selectedBike.setBikeDailyRate(bikeDailyRateToSet);
	}
	
	/**
	 * This method get customer name
	 * @return customerName Customer name
	 */
	
	public String getCustomerName()
	{
		return customerName;
	}
	
	/**
	 * This method get rental start date
	 * @return startDate Rental start date
	 */
	
	public LocalDate getStartDate()
	{
		return startDate;
	}
	
	/**
	 * This method get rental end date
	 * @return endDate Rental end date
	 */
	
	public LocalDate getEndDate()
	{
		return endDate;
	}
	
	/**
	 * This method get number of all rental days
	 * @return numberOfDays Number of days
	 */
	
	public int getNumberOfDays()
	{
		return numberOfDays;
	}
	
	/**
	 * This method get bike lock
	 * @return bikeLock Bike lock option
	 */
	
	public double getBikeLock()
	{
		return bikeLock;
	}
	
	/**
	 * This method get delivery
	 * @return delivery Delivery option
	 */

	public double getDelivery()
	{
		return delivery;
	}
	
	/**
	 * This method get helmet
	 * @return helmet Helmet option
	 */
	
	public double getHelmet()
	{
		return helmet;
	}
	
	/**
	 * This method get repair kit
	 * @return repairKit Repair Kit option
	 */
	
	public double getRepairKit()
	{
		return repairKit;
	}
	
	/**
	 * This method set customer name
	 * @param customerNameToSet Customer name
	 */
	
	public void setCustomerName(String customerNameToSet)
	{
		customerName = customerNameToSet;
	}
	
	/**
	 * This method set rental start date
	 * @param startDateToSet Rental start date
	 */
	
	public void setStartDate(LocalDate startDateToSet)
	{
		startDate = startDateToSet;
	}
	
	/**
	 * This method set rental end date
	 * @param endDateToSet Rental end date
	 */
	
	public void setEndDate(LocalDate endDateToSet)
	{
		endDate = endDateToSet;
	}
	
	/**
	 * This method set number of all rental days
	 * @param numberOfDaysToSet Number of rental days
	 */
	
	public void setNumberOfDays(int numberOfDaysToSet)
	{
		numberOfDays = numberOfDaysToSet;
	}
	
	/**
	 * This method set bike lock
	 * @param bikeLockToSet Bike lock option
	 */
	
	public void setBikeLock(double bikeLockToSet)
	{
		bikeLock = bikeLockToSet;
	}
	
	/**
	 * This method set delivery
	 * @param deliveryToSet Delivery option
	 */

	public void setDelivery(double deliveryToSet)
	{
		delivery = deliveryToSet;
	}
	
	/**
	 * This method set helmet
	 * @param helmetToSet Helmet option
	 */
	
	public void setHelmet(double helmetToSet)
	{
		helmet = helmetToSet;
	}
	
	/**
	 * This method set repair kit
	 * @param repairKitToSet Repair kit option
	 */
	
	public void setRepairKit(double repairKitToSet)
	{
		repairKit = repairKitToSet;
	}
}