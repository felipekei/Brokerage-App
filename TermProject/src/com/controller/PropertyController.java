package com.controller;

import java.util.Scanner;

import com.PropertyDao.DaoConnectivity;
import com.model.PropertyModel;

public class PropertyController {
	
	/** The class named controller will be used to create the connection between the methods and the user for a better experience */
	Scanner sc = new Scanner(System.in);
	
	DaoConnectivity dao = new DaoConnectivity();
	
	public void insert() {
		
		/** Through the use of Scanner we will be requesting the data to be added to the data base */ 
		
		System.out.println("-------------This is the option to Create a new Property, please follow the prompts-------------");
		
		System.out.println("Please enter an ID for the Property: ");
		
		int Propertyid = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Please enter a Agent Name: ");
		
		String AgentName = sc.nextLine();
		
		System.out.print("Please enter the Price for the property: ");
		
		double AskingPrice = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("Please enter the Region for the property: ");
		
		String Region = sc.nextLine();
		
		System.out.print("Please enter the Type of property: ");
		
		String Type = sc.nextLine();
		
		System.out.print("Please enter the Closing Date for the property: ");
		
		String ClosingDate = sc.nextLine();
		
		/** We create the object to use the insertProperty method */ 
		
		PropertyModel pro = new PropertyModel(Propertyid,AgentName,AskingPrice,Region,Type,ClosingDate);
		
		dao.insertProperty(pro);
		
		
	}
	
	public void display() {
		
		/** As explained with the method getAllRecs, we can show all the displays from the table */
		
		System.out.println("-------------This is the option to Read all current properties-------------");
		
		dao.getAllRecs();
	}
	
	public void getRecById() {
		
		/** In the same way we can get just one row by using the ID */
		
		System.out.println("-------------This is the option to Read a Property by ID-------------");
		
		System.out.println("Please enter the ID of the property to show: ");
		
		int e_id = sc.nextInt();
		
		dao.getRecById(e_id);
	}
	
	public void update() {
		
		/** With the method Update we can modify the details of a specific ID*/
		
		System.out.println("-------------This is the option to Update a Property by ID-------------");
		
		System.out.print("Please enter the ID of the Property to update record: ");
		
		int curr_id = sc.nextInt();
		
		System.out.println("Current Record of the property with id" + curr_id);
		
		dao.getRecById(curr_id);
		
		System.out.print("Please enter the new ID of the Property to update: ");
		
		int up_Propertyid = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Please enter the new Agent Name: ");
		
		String up_AgentName = sc.nextLine();
		
		System.out.print("Please enter the new Price for the property: ");
		
		double up_AskingPrice = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("Please enter the new Region for the property: ");
		
		String up_Region = sc.nextLine();
		
		System.out.print("Please enter the new Type of property: ");
		
		String up_Type = sc.nextLine();
		
		System.out.print("Please enter the new Closing Date for the property: ");
		
		String up_ClosingDate = sc.nextLine();
		PropertyModel up_pro = new PropertyModel(up_Propertyid,up_AgentName,up_AskingPrice,up_Region,up_Type,up_ClosingDate);
		
		dao.updateRecById(curr_id, up_pro);
	}
	
	public void delete() {
		
		/** With the method Update we can modify the details of a specific ID*/
		
		System.out.println("-------------This is the option to Delete a Property by ID-------------");
		
		System.out.print("Please enter the ID of the property to delete: ");
		
		int Propertyid = sc.nextInt();
		
		dao.deleteRecById(Propertyid);
		
	}

}
