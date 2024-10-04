package com.PropertyDao;

import com.controller.PropertyController;
import com.model.PropertyModel;

public class DaoTester {

	public static void main(String[] args) {
		/** This class is meant to be used to test all the DAO actions along with the controller methods*/
		
		/** We create this object to */
		DaoConnectivity dao = new DaoConnectivity();
		
		/** This method shows if connection was successful or not*/
		//dao.setupConnection();
		
		/** As for the CREATE operation we can do the following adding the data to the object */
		//PropertyModel property_to_add = new PropertyModel (17,"Chuck Norris",769000.00,"North York","Penthouse","2024-01-12");
		//dao.insertProperty(property_to_add);
		
		/** With READ All records we can see all the data from the table */
		// dao.getAllRecs();
		
		/** Besides all records we can also Read one record at the time */
		//dao.getRecById(13);
		
		/** For UPDATE we can do a similar process as with create by creating an object and select an ID to change*/
		//PropertyModel property_to_update = new PropertyModel (18,"Jackie Chan",869000.00,"Midtown","Condo","2023-12-12");
		//dao.updateRecById(17, property_to_update);
		
		/** In the case of the DELETE operation we simply indicate the ID to be removed */
		//dao.deleteRecById(18);
		
		/** The following tester are related to the controllers that will be used for the Menu */
		 
		PropertyController ctlr = new PropertyController();
		 
		//ctlr.insert();
		
		//ctlr.display();
		
		//ctlr.getRecById();
		
		//ctlr.update();
		
		//ctlr.delete();

	}

}
