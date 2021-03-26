package com.hemebiotech.Project02Eclipse.service;


import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CountData {

    public Map<String, Integer> count(List<String> symptomsList) {

        Map<String, Integer> symptomsMap; //k-v
        symptomsMap = new TreeMap<String, Integer>();

        for (String s : symptomsList) {
            if (symptomsMap.containsKey(s)) {
                int i = symptomsMap.get(s) + 1;
                symptomsMap.put(s, i);

            } else {
                symptomsMap.put(s, 1);

            }

        }


        return symptomsMap;
    }

}