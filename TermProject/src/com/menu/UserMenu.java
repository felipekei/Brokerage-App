package com.menu;

import java.util.Scanner;

import com.controller.PropertyController;

public class UserMenu {
	
	public static void main(String[] args) {
	
	/** This is the class for the the user interface that will allow the agent to get prompts to manipulate the application */
	
	Scanner sc = new Scanner(System.in);
	
	PropertyController ctlr = new PropertyController();
	
	int entry = 0;
	
	while (entry != 6) {
		
		System.out.println("-----------BROKERAGE APP-----------");
		
		System.out.println("---------------MENU---------------\n");
		
		System.out.println("Please Enter one of the following options:\n");
		
		System.out.println("1 - To display all records");
		
		System.out.println("2 - To insert a new records");
		
		System.out.println("3 - To update a record");
		
		System.out.println("4 - To delete a record");
		
		System.out.println("5 - To get a single record by ID");
		
		System.out.println("6 - To exit the application");
		
		entry = sc.nextInt();
		
			switch(entry) {
			
			case 1: {
				ctlr.display();
				break;
			}
			case 2: {
				ctlr.insert();
				break;
			}
			case 3: {
				ctlr.update();
				break;
			}
			case 4: {
				ctlr.delete();
				break;
			}
			case 5: {
				ctlr.getRecById();
				break;
			}
			case 6: {
				System.out.println("Thanks for using our Brokerage Application!!");
				System.exit(0);
				break;
			}
			default: {
				
				System.out.println("Please enter only numbers from 1 to 6.\n");
			}
		}
	}
	sc.close();
	}
}

