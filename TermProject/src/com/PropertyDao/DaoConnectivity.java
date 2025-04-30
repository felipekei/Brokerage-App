package com.PropertyDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.PropertyModel;

public class DaoConnectivity {
	
	public Connection setupConnection() {
		
		/** On this class we will create the connection. First we are creating the connection to mysql with the corresponding credentials */
		Connection conn = null;
		
		String user = "root";

		String pwd = "password";

		String url = "jdbc:mysql://localhost:3307/brokerage?useSSL=false";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			// We use the getConnection() method of the DriverManager Class
			// Then we save this connection object in variable conn
			
			conn = DriverManager.getConnection(url,user,pwd);
			System.out.println("Connection successful");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	 /**
	 * As for the other CRUD operations we can insert (create) a new property
	 * @param PropertyModel property_to_add
	 */
	public void insertProperty(PropertyModel property_to_add) {
		Connection conn=setupConnection();
		String sql = "insert into properties (Propertyid,AgentName,AskingPrice,Region,Type,ClosingDate) values(?,?,?,?,?,?)";
		try{
			java.sql.PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, property_to_add.getPropertyID());
			pstmt.setString(2, property_to_add.getAgentName());
			pstmt.setDouble(3,property_to_add.getAskingPrice());
			pstmt.setString(4,property_to_add.getRegion());
			pstmt.setString(5,property_to_add.getType());
			pstmt.setString(6,property_to_add.getClosingDate());
			int status = pstmt.executeUpdate();
			
			if(status>0) {
				System.out.println("New property inserted sucessfully!");
				
				getAllRecs();
			}
			else {
				System.out.println("Error encountered, please try Again");
			}
			
		}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/** The next method is one of the most basic and common which is the one to display (Read) all info*/
	  /**
	   * Retrieves all properties from the database.
	   * @return List of properties
	   */
	public List<PropertyModel> getAllRecs(){
		List<PropertyModel> proper = new ArrayList<>();
		
		// Make connection to database
		Connection conn = setupConnection();
		
		// Write the sql query as a string
		String sql= "select * from properties";
		// For select query we use Statement
		try {
			Statement stmt = conn.createStatement();
			//stmt.executeQuery() method takes the sql query as the argument
			//and returns it as a ResultSet
			//ResultSet is a table like structure
			ResultSet rs = stmt.executeQuery(sql);
			
			//get the property objects out of ResultSet one by one and
			//add them to the List
            while (rs.next()) {
            	PropertyModel prop_from_top = new PropertyModel(rs.getInt("Propertyid"), rs.getString("AgentName"), rs.getDouble("AskingPrice"), rs.getString("Region"), rs.getString("Type"), rs.getString("ClosingDate"));
            	proper.add(prop_from_top);
			}
			System.out.println(proper);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return proper;
	}
	
	
	/** We can add the method to show (Read) the row by propertyID*/
	public PropertyModel getRecById(int p_id) {
		
		PropertyModel pro = null;
		
		Connection con = setupConnection();
		
		String sql = "select * from properties where propertyid = ?";
		
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, p_id);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				pro = new PropertyModel(rs.getInt("Propertyid"), rs.getString("AgentName"), rs.getDouble("AskingPrice"), rs.getString("Region"), rs.getString("Type"), rs.getString("ClosingDate"));
			}
			
			System.out.println(pro);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pro;
	}
	
	
	/** With this method we can update the properties based on their ID*/
	public void updateRecById(int current_id, PropertyModel updated_pro) {
		
		Connection con = setupConnection();
		
		String sql = "update properties set Propertyid = ?, AgentName = ?, AskingPrice = ?, Region = ?, Type = ?, ClosingDate = ? where Propertyid = ?";
		
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, updated_pro.getPropertyID());
			
			pstmt.setString(2, updated_pro.getAgentName());
			
			pstmt.setDouble(3, updated_pro.getAskingPrice());
			
			pstmt.setString(4, updated_pro.getRegion());
			
			pstmt.setString(5, updated_pro.getType());
			
			pstmt.setString(6, updated_pro.getClosingDate());
			
			pstmt.setInt(7, current_id);
			
			int status = pstmt.executeUpdate();
			
			if(status>0) {
				
				System.out.println("Record updated successfully!!");
				
				getAllRecs();
			}
			else {
				System.out.println("Error encountered, please try Again");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	
	
	/** The lasts method is to delete a designated property record by using an ID*/
	public void deleteRecById(int id_to_delete) {
		
		Connection con = setupConnection();
		
		String sql = "delete from properties where Propertyid = ?";
		
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, id_to_delete);
			
			int status = pstmt.executeUpdate();
			
			if(status>0) {
				
				System.out.println("Record deleted successfully!!");
				
				getAllRecs();
			}
			else {
				System.out.println("Something went wrong with the deletion, please try Again");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
