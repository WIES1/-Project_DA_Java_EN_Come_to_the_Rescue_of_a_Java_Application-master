package com.hemebiotech.Project02Eclipse;

/*

/* 

*/

import com.hemebiotech.Project02Eclipse.service.CountData;
import com.hemebiotech.Project02Eclipse.service.ReadSymptomDataFromFile;
import com.hemebiotech.Project02Eclipse.service.WriteResults;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class Main {

    public static final String SYMPTOMS_TXT = "symptoms.txt";
    public static final String RESULT_OUT = "result.out";

    public static void main(String args[]) {

        List<String> symptomsList = new ArrayList<>();
        Map<String, Integer> symptomsCount = new TreeMap<>();
        ReadSymptomDataFromFile rsd = new ReadSymptomDataFromFile(SYMPTOMS_TXT);
        symptomsList = rsd.getSymptoms();


        CountData cd = new CountData();
        symptomsCount = cd.count(symptomsList);

        WriteResults writeresults = new WriteResults(RESULT_OUT);

        try {
            writeresults.writeResultsToFile(symptomsCount);
        } catch (IOException e1) {

            e1.printStackTrace();
        }

    }
}
