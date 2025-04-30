# Brokerage App

## Overview
The Brokerage App is a real estate management system built in **Java SE**, designed to help users manage property records efficiently. It offers full **CRUD functionality** (Create, Read, Update, Delete) and integrates **MySQL** for data storage.

## Features
- **Create**: Add new property listings with essential details.
- **Read**: Retrieve all property records or search by specific **Property ID**.
- **Update**: Modify existing property details seamlessly.
- **Delete**: Remove properties from the database.
- **User-Friendly Menu**: Console-based interface for easy interaction.

## Technologies Used
- **Java SE** (for core application logic)
- **MySQL** (for database management)
- **JDBC** (for connecting Java to MySQL)
- **GitHub** (for version control)
- **OOP Principles** (for structuring classes and controllers)

## Installation Guide
1. Clone the repository:  
   ```
   git clone https://github.com/felipekei/Brokerage-App.git
- Import the project into your Java IDE.
- Set up a MySQL database and configure the credentials inside DaoConnectivity.java.
- Run the UserMenu class to interact with the app.

## Usage
Once the app is running, use the following menu options:
- **Display all records**
- **Insert a new property**
- **Update a property**
- **Delete a property**
- **Retrieve a property by ID**
- **Exit the application**

## Project Structure
  ```
  BrokerageApp/
  │
  ├── src/                           
  │   └── com/
  │       ├── controller/            # Handles user interaction logic
  │       │   └── PropertyController.java
  │       ├── menu/                 # User-facing menu logic
  │       │   └── UserMenu.java
  │       ├── model/                # POJO (Plain Old Java Object) for property data
  │       │   └── PropertyModel.java
  │       └── PropertyDao/          # Database access logic (DAO pattern)
  │           ├── DaoConnectivity.java
  │           └── DaoTester.java
  ```
## License
This project is licensed under MIT License.

## Acknowledgments
Originally built in August 2024, this project was later uploaded to GitHub to showcase its functionality.
