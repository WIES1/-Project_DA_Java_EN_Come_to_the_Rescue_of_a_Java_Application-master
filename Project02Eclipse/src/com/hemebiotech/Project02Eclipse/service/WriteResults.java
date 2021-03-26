package com.hemebiotech.Project02Eclipse;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/**
 *
 * @author WIESELTHIER
 * this method writes in resultOut
 */
public class WriteResults extends IWriteResults {

    String ro;

    public WriteResults(String resultOut) {
        ro = resultOut;
    }

    public void writeResultsToFile(Map<String, Integer> symptomsCount) throws IOException {
        FileWriter writer = new FileWriter(ro);//
        for (Map.Entry<String, Integer> symptom : symptomsCount.entrySet()) {
            writer.write(symptom.getKey() + " : " + symptom.getValue() + "\n");
        }
        writer.close();
    }

}

package com.hemebiotech.Project02Eclipse;

        import java.io.IOException;
        import java.util.Map;
/**
 *
 * @author WIESELTHIER
 *
 */
abstract class IWriteResults {
    /**
     *
     * @param symptoms
     * @throws IOException
     * Invalid Argument Exception describe when this exception is thrown by the method
     */
    public abstract void writeResultsToFile(Map<String, Integer> symptoms) throws IOException;

}