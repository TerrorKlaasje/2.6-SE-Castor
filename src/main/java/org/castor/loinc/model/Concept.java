package org.castor.loinc.model;

public class Concept {

	private int loincNum;
	private String commonName;
	
	public Concept()
	{
			
	}
	
	public Concept(int loincNum, String commonName) 
	{
		this.loincNum = loincNum;
		this.commonName = commonName;
	}
	
	
	public int getLoincNum() {
		return loincNum;
	}
	public void setLoincNum(int loincNum) {
		this.loincNum = loincNum;
	}
	public String getCommonName() {
		return commonName;
	}
	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}
	
		
}

