package com.whitecodepaladin.project2023.projections;

import java.util.Date;

public interface UserBalanceProjection {
	
	Long getID();
	String getUser();
	String getBank();
	String getDescription();
	Date getDate();
	Double getValue();
	String getObservation();

}
