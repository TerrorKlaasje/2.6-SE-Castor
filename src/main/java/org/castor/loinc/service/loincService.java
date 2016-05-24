package org.castor.loinc.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.castor.loinc.database.*;
import org.castor.loinc.model.Concept;

public class loincService {
	DatabaseConnector connector;
	
	public loincService() throws ClassNotFoundException, SQLException {
	
	connector = new DatabaseConnector();
}
	public List<Concept> getConcepts(){
		List<Concept> list = new ArrayList<Concept>();
		
		return list;
	}
}
