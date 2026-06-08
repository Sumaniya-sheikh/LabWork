package week_7;

import java.io.*;

public class DataReporting {

    public void write(String fileName, double avg) throws IOException {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(String.valueOf(avg));
            bw.close();
        } 
        catch (IOException e) {
            throw new IOException("Could not write to the file " + fileName + ".");
        }
    }
}