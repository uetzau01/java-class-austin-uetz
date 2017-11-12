package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

/**
 * Class LemurConspiracy
 * @author Austin Uetz
 */
public class LemurConspiracy {
    private HashSet<Lemur> conspiracy = new HashSet<>();
    
    public LemurConspiracy(String fileName) throws FileNotFoundException, IOException {
        BufferedReader inputFile = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = inputFile.readLine()) != null) {
            String[] animals = line.split(",");
            if ("Lemur".equals(animals[2])) {
                conspiracy.add(new Lemur(animals[0],Integer.parseInt(animals[1])));
            }
        }
    }
    
    public int size() {
        return conspiracy.size();
    }
    
    public Lemur getChief() {
        Lemur oldest = new Lemur("",0);
        for (Lemur lemur : conspiracy) {
            if (lemur.getAge() >= oldest.getAge()) {
                oldest = lemur;
                }
        }
        return oldest;
    }
}
