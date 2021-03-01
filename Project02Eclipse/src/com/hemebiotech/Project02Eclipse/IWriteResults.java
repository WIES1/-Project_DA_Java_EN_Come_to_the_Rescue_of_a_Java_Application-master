package com.hemebiotech.Project02Eclipse;

import java.io.IOException;
import java.util.Map;

public interface IWriteResults {
	
	
		void writeResultsToFile(Map<String, Integer> symptoms) throws IOException;  // le comportement est impose 
	


}
