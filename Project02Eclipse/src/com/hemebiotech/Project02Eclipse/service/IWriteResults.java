package com.hemebiotech.Project02Eclipse.service;

import java.io.IOException;
import java.util.Map;

/**
 *
 */
public interface IWriteResults {
    void writeResultsToFile(Map<String, Integer> symptoms) throws IOException;
}
