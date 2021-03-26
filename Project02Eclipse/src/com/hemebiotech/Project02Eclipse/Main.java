package com.hemebiotech.Project02Eclipse;

/**
 * @author WIESELTHIER
 * Analytics Counter is main class of application
 * this method reads symptomdata file grouping data by name and count
 * creates a file with out of results
 */
import com.hemebiotech.Project02Eclipse.service.CountData;
import com.hemebiotech.Project02Eclipse.service.ReadSymptomDataFromFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {

    public static final String SYMPTOMS_TXT = "symptoms.txt";
    public static final String RESULT_OUT = "result.out";
    /**
     *
     * @param args
     */
    public static void main(String args[]) {

        List<String> symptomsList = new ArrayList<>();
        Map<String, Integer> symptomsCount = new TreeMap<>();
        ReadSymptomDataFromFile rsd = new ReadSymptomDataFromFile(SYMPTOMS_TXT);
        symptomsList = rsd.getSymptoms();

        CountData cd = new CountData();
        symptomsCount = cd.count(symptomsList);

        WriteResults writeresults = new com.hemebiotech.Project02Eclipse.WriteResults(RESULT_OUT);

        try {
            ((com.hemebiotech.Project02Eclipse.WriteResults) writeresults).writeResultsToFile(symptomsCount);
        }
        catch (IOException e1)
        {

            e1.printStackTrace();
        }

    }
}
