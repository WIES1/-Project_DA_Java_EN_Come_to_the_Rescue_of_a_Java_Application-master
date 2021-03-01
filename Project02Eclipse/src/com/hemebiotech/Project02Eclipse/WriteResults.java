package com.hemebiotech.Project02Eclipse;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;



public class WriteResults implements IWriteResults {
	// methode qui renvoie et creer l'interface 
	String ro;
	public WriteResults(String resultOut) {
		ro = resultOut;// TODO Auto-generated constructor stub PREND LES PARAMETRES POUR LUI PASSER L'ADRESSE EN QUESTION
	}

	public void writeResultsToFile( Map <String,Integer>symptomsCount) throws IOException {
		 FileWriter writer = new FileWriter(ro);// 
		 for(Map.Entry<String,Integer> symptom : symptomsCount.entrySet()) {
				writer.write(symptom.getKey() + " : " + symptom.getValue() +"\n");
			}
		writer.close();
	}
	

}

