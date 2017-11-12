package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class CrowMurder
 * @author Austin Uetz
 */
public class CrowMurder {
    private ArrayList<Crow> murder = new ArrayList<>();
    
    public CrowMurder(String fileName) throws FileNotFoundException, IOException {
        BufferedReader inputFile = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = inputFile.readLine()) != null) {
            String[] animals = line.split(",");
            if ("Crow".equals(animals[2])) {
                murder.add(new Crow(animals[0],Integer.parseInt(animals[1])));
            }
        }
    }
        
    public int size() {
        return murder.size();
    }
    
    public Crow getChief() {
        Crow oldest = new Crow("",0);
        for (int i = 0; i < murder.size(); ++i) {
            if (murder.get(i).getAge() >= oldest.getAge()) {
                oldest = murder.get(i);
            }
        }
        return oldest;
    }
        
}
