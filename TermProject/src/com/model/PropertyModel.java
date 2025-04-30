package com.model;

	/**
	 *  This class is created to get all the fields, getters and setters plus the constructor for the model of the application 
	 */

public class PropertyModel {
	

	//  Fields based on the columns of the database
	
	  /**	
	   * Represents the property ID.	
	   */
	private int propertyID;
	  /**
	   * Represents the agent name.
	   */
	private String agentName;
	  /**
	   * Represents the asking price.
	   */
	private double askingPrice;
	  /**
	   * Represents the region.
	   */
	private String region;
	  /**
	   * Represents the type.
	   */
	private String type;
	  /**
	   * Represents the closing date.
	   */
	private String closingDate;
	
	/**
	 * Super Constructor Class
	 */
	public PropertyModel() {
		super();

	}
	
	  /**
	   * Constructor for the Property class.
	   * @param propertyID   the property ID
	   * @param agentName    the agent name
	   * @param askingPrice  the asking price
	   * @param region       the region
	   * @param type         the type
	   * @param closingDate  the closing date
	   */
	
	public PropertyModel(int propertyID, String agentName, double askingPrice, String region, String type,
			String closingDate) {
		super();
		this.propertyID = propertyID;
		this.agentName = agentName;
		this.askingPrice = askingPrice;
		this.region = region;
		this.type = type;
		this.closingDate = closingDate;
	}
	
	// Getters and setters from the fields

	  /**
	   * Gets the property ID.
	   * 
	   * @return the property ID
	   */
	public int getPropertyID() {
		return propertyID;
	}
	  /**
	   * Sets the property ID.
	   * 
	   * @param propertyID  the property ID to set
	   */
	public void setPropertyID(int propertyID) {
		this.propertyID = propertyID;
	}
	  /**
	   * Gets the agent name.
	   * 
	   * @return the agent name
	   */
	public String getAgentName() {
		return agentName;
	}

	  /**
	   * Sets the agent name.
	   * 
	   * @param agentName  the agent name to set
	   */
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	  /**
	   * Gets the asking price.
	   * 
	   * @return the asking price
	   */
	public double getAskingPrice() {
		return askingPrice;
	}
	  /**
	   * Sets the asking price.
	   * 
	   * @param askingPrice  the asking price to set
	   */
	public void setAskingPrice(double askingPrice) {
		this.askingPrice = askingPrice;
	}
	  /**
	   * Gets the region.
	   * 
	   * @return the region
	   */
	public String getRegion() {
		return region;
	}
	  /**
	   * Sets the region.
	   * 
	   * @param region  the region to set
	   */
	public void setRegion(String region) {
		this.region = region;
	}
	  /**
	   * Gets the type.
	   * 
	   * @return the type
	   */
	public String getType() {
		return type;
	}
	  /**
	   * Sets the type.
	   * 
	   * @param type  the type to set
	   */
	public void setType(String type) {
		this.type = type;
	}
	  /**
	   * Gets the closing date.
	   * 
	   * @return the closing date
	   */
	public String getClosingDate() {
		return closingDate;
	}
	  /**
	   * Sets the closing date.
	   * 
	   * @param closingDate  the closing date to set
	   */
	public void setClosingDate(String closingDate) {
		this.closingDate = closingDate;
	}

	@Override /** With the toString options we are able to print the information of our database to the console for the user to see */
	public String toString() {
		return "PropertyModel [propertyID=" + propertyID + ", agentName=" + agentName + ", askingPrice=" + askingPrice
				+ ", region=" + region + ", type=" + type + ", closingDate=" + closingDate + "]\n";
	}
	
}
