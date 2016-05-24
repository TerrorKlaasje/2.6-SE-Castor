package org.castor.loinc.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseConnectorTest {

	public static void main(String[] args)
	{	try
		{	
			DatabaseConnector connector = new DatabaseConnector();
			String query = "SELECT loinc_num FROM loinc WHERE loinc_num = 10014-9";
			
			PreparedStatement statement = connector.getConnection().prepareStatement(query);
			ResultSet rs = statement.executeQuery();
			
			while(rs.next())
				{	String code = rs.getString("loinc_num");
					
					System.out.println(code);
				}
			
		}
		catch (Exception e)
		{	System.out.println("***Exception:\n"+e);
	      	e.printStackTrace();
		}
	}
}
