package bikerental;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.*;

/**
 * This is a main class which contains 3 methods: main, getCustomerOrder() and printReport().
 */

public class BikeRental {
	
	static Scanner keyboard = new Scanner(System.in);
	
	/**
	 * Main method of Bike Rental application, which asks user to choose 1 from 3 options:
	 * Make a new customer order, Print report(s) or Exit the application.
	 */
	
	public static void main(String[] args) {
		
		//creating ArrayList
		
		ArrayList<CustomerOrder> orders = new ArrayList<CustomerOrder>();
		
		//total number of orders
		
		int totalNumberOfOrders = 0;
		
		//while loop which asks user to enter 3 chars: N, R or Q
		
		while (true) {
			System.out.println("(N)ew Customer Order, (R)eport, or (Q)uit:");
			char input = keyboard.nextLine().charAt(0);
			
			switch (input) {
			case 'Q':
			case 'q':
				System.exit(0); //quit program if the user type Q or q
				break;
			case 'N':
			case 'n':
				orders.add(getCustomerOrder(totalNumberOfOrders)); //set entire order in our ArrayList
				totalNumberOfOrders++; //update total number of orders
				break;
			case 'R':
			case 'r':
				printReport(orders, totalNumberOfOrders); //print report
				break;
			default:
				System.out.println("Bad option: " + input); //print line if the input is not Q, q, N, n, or R, r
				break;
			}
		}
	}
	
	/**
	 * This method start asking user about order details, until all the fields will be filled correctly.
	 * @param totalNumberOfOrders Total number of all orders
	 * @return order One filled order
	 */
	
	public static CustomerOrder getCustomerOrder(int totalNumberOfOrders)
	{		
		//if statement which is checking total number of all orders
		
		if (totalNumberOfOrders > 19) {
			System.out.println("You have entered too many orders already! Please, restart the application.");
			System.exit(0);
		}
		
		//list of variables
		
		String input; //takes user input for the rental start date
		String customerName; //asks for the customer name
		String bikeModel; //asks for the bike model
		String numberOfDays; // number of rental days
		double bikeDailyRate; //takes daily cost of the particular bike
		char bikeLockChoice; //asks user for the bike lock
		char deliveryChoice; //asks user for delivery
		char helmetChoice; //asks user for the helmet
		char repairKitChoice; //asks user for repair kit
		double bikeLock; //cost of the bike lock
		double delivery; //delivery cost
		double helmet; //helmet cost
		double repairKit; //cost of the repair kit
		double allRentalCost; //bike rental cost for all days without options
		double totalCost; //calculate total cost of each order
		
		//asks user for the customer name
		
		System.out.println("Enter customer name:");
		customerName = keyboard.nextLine();
		
		//remind user that customer name cannot be blank and asks to enter proper customer name
		
		while ("".equals(customerName))
		{
			System.out.println("Customer name cannot be blank.");
			
			System.out.println("Enter customer name:");
			customerName = keyboard.nextLine();
		}
		
		//asks user for the rental start date
		
		System.out.println("Enter rental start date (YYYY-MM-DD):");
		input = keyboard.nextLine();
		
		LocalDate startDate = LocalDate.parse(input);		
		
		//asks user for the amount of rental days

		System.out.println("Enter number of rental days:");
		numberOfDays = keyboard.nextLine();
		
		//remind user that number of rental days must be > than 0
		
		while (Integer.parseInt(numberOfDays) <= 0)
		{
			System.out.println("Number of rental days must be > 0");
			
			System.out.println("Enter number of rental days:");
			numberOfDays = keyboard.nextLine();
		}
		
		//asks user for the particular bike model
		
		System.out.println("Enter desired bike model: Road, Mountain, Cruiser, Kids");
		bikeModel = keyboard.nextLine();
		
		//remind user that the input is strictly defined
		//user can only choose between Road, Mountain, Cruiser or Kids models
	
		while (!"Road".equals(bikeModel) && !"Mountain".equals(bikeModel) && !"Cruiser".equals(bikeModel) && !"Kids".equals(bikeModel))
		{
			System.out.println(bikeModel + " not available. Choose another.");
		
			System.out.println("Enter desired bike model: Road, Mountain, Cruiser, Kids");
			bikeModel = keyboard.nextLine();
		}
		
		//takes daily cost of the chosen bike model
		
		switch(bikeModel)
		{
			case "Road":
			bikeDailyRate = 80.00;
			break;
			case "Mountain":
			bikeDailyRate = 51.25;
			break;
			case "Cruiser":
			bikeDailyRate = 35.50;
			break;
			case "Kids":
			bikeDailyRate = 20.00;
			break;
			default:
			bikeDailyRate = 0.00;
			break;
		}
		
		//asks user for the first option: bike lock
		
	    System.out.println("Need Bike Lock? (Y/N)");
	    input = keyboard.nextLine();
	    bikeLockChoice = input.charAt(0);
	    
		//asks user for the second option: delivery
		
	    System.out.println("Need Delivery? (Y/N)");
	    input = keyboard.nextLine();
	    deliveryChoice = input.charAt(0);
	    
		//asks user for the third option: helmet
		
	    System.out.println("Need Helmet? (Y/N)");
	    input = keyboard.nextLine();
	    helmetChoice = input.charAt(0);
	    
		//asks user for the forth option: repair kit
		
	    System.out.println("Need Repair Kit? (Y/N)");
	    input = keyboard.nextLine();
	    repairKitChoice = input.charAt(0);
	    
	    //calculations
		//calculate end date of the rental period
		
		LocalDate endDate = startDate.plusDays(Integer.parseInt(numberOfDays));
	    
		//calculate cost of rental for all days
		
		allRentalCost = bikeDailyRate * Integer.parseInt(numberOfDays);
		
		//output
		//prints output
		
		System.out.println("Customer: " + customerName);
		System.out.println("Rental starts: " + startDate + " ends: " + endDate);
		System.out.printf("%14s Bike Daily Rate: $ %7.2f", bikeModel, bikeDailyRate);
		System.out.printf("\n%22s %s days: $ %7.2f", "Bike Rental for", numberOfDays, allRentalCost);
		
		//if statements that check which options user have chosen
		
	    if (bikeLockChoice == 'Y' || bikeLockChoice == 'y')
	    {
	    	bikeLock = 20.00;
	    	System.out.printf("\n%31s $ %7.2f", "Bike Lock:", bikeLock);
	    }
	    else
	    {
	    	bikeLock = 0.00;
	    }
		
	    if (repairKitChoice == 'Y' || repairKitChoice == 'y')
	    {
	    	repairKit = 5.75;
	    	System.out.printf("\n%31s $ %7.2f", "Repair Kit:", repairKit);
	    }
	    else
	    {
	    	repairKit = 0.00;
	    }
	    
	    if (helmetChoice == 'Y' || helmetChoice == 'y')
	    {
	    	helmet = 11.50;
	    	System.out.printf("\n%31s $ %7.2f", "Helmet:", helmet);
	    }
	    else
	    {
	    	helmet = 0.00;
	    }
	    
	    if (deliveryChoice == 'Y' || deliveryChoice == 'y')
	    {
	    	delivery = 70.00;
	    	System.out.printf("\n%31s $ %7.2f", "Delivery:", delivery);
	    }
	    else
	    {
	    	delivery = 0.00;
	    }
	    
		//calculate total rental cost for all days with options
		
		totalCost = allRentalCost + bikeLock + repairKit + helmet + delivery;

		System.out.printf("\n%31s $ %7.2f\n", "Order Total Cost:", totalCost);
		
		//add the order as an element of the ArrayList
		
		CustomerOrder order = new CustomerOrder();
		order.setCustomerName(customerName);
		order.setBikeModel(bikeModel);
		order.setBikeDailyRate(bikeDailyRate);
		order.setStartDate(startDate);
		order.setEndDate(endDate);
		order.setNumberOfDays(Integer.parseInt(numberOfDays));
		order.setBikeLock(bikeLock);
		order.setDelivery(delivery);
		order.setHelmet(helmet);
		order.setRepairKit(repairKit);
		
		//update counter of orders
		
		totalNumberOfOrders++;
		
		//returns order
		
		return order;
	}
	
	/**
	 * This method prints report which contains all orders, their details and summary of all orders.
	 * @param orders ArrayList which can contain from 1 to 20 reports
	 * @param totalNumberOfOrders Total number of all orders
	 */
	
	public static void printReport(ArrayList<CustomerOrder> orders, int totalNumberOfOrders) 
	{
		//prints summary of orders
		
		System.out.println("\nSales Report - Number of Orders: " + totalNumberOfOrders);
		
		double totalRentalSales = 0.00; //revenue of all rental sales 
		double totalOptionsSales = 0.00; //revenue of all options sales
		
		//for loop which helps to make an output and set specific order in a right place into ArrayList
		
		for (int index = 0; index < orders.size(); index++)
		{
			System.out.println("\nOrder #" + (index + 1));
			System.out.println("Customer: " + orders.get(index).getCustomerName());
			System.out.println("Rental starts: " + orders.get(index).getStartDate() + " ends: " + orders.get(index).getEndDate());
			System.out.printf("%14s Bike Daily Rate: $ %7.2f", orders.get(index).getBikeModel(), orders.get(index).getBikeDailyRate());
			System.out.printf("\n%22s %s days: $ %7.2f", "Bike Rental for", orders.get(index).getNumberOfDays(), 
					orders.get(index).getBikeDailyRate() * orders.get(index).getNumberOfDays());
		    
			if (orders.get(index).getBikeLock() > 0)
		    {
		    	System.out.printf("\n%31s $ %7.2f", "Bike Lock:", orders.get(index).getBikeLock());
		    	totalOptionsSales += orders.get(index).getBikeLock();
		    }
			
			if (orders.get(index).getRepairKit() > 0)
		    {
		    	System.out.printf("\n%31s $ %7.2f", "Repair Kit:", orders.get(index).getRepairKit());
		    	totalOptionsSales += orders.get(index).getRepairKit();
		    }
			
			if (orders.get(index).getHelmet() > 0)
		    {
		    	System.out.printf("\n%31s $ %7.2f", "Helmet:", orders.get(index).getHelmet());
		    	totalOptionsSales += orders.get(index).getHelmet();
		    }
			
			if (orders.get(index).getDelivery() > 0)
		    {
		    	System.out.printf("\n%31s $ %7.2f", "Delivery:", orders.get(index).getDelivery());
		    	totalOptionsSales += orders.get(index).getDelivery();
		    }
			
			System.out.printf("\n%31s $ %7.2f", "Order Total Cost:", orders.get(index).getBikeDailyRate() * 
					orders.get(index).getNumberOfDays() + orders.get(index).getBikeLock() + 
					orders.get(index).getDelivery() + orders.get(index).getHelmet() + 
					orders.get(index).getRepairKit());
		}
		
		//for loop which helps to calculate total rental sales
		
		for (int index = 0; index < orders.size(); index++)
		{
			totalRentalSales += orders.get(index).getBikeDailyRate() * orders.get(index).getNumberOfDays();
		}
		
		//prints rental, options and total sales

		System.out.println("\n\nSales Summary");
		System.out.printf("\n%31s $ %7.2f", "Total Rental Sales:", totalRentalSales);
		System.out.printf("\n%31s $ %7.2f", "Total Option Sales:", totalOptionsSales);
		System.out.printf("\n%31s $ %7.2f\n", "Total Sales:", totalRentalSales + totalOptionsSales);
		}
}