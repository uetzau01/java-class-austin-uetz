package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

/**
 * Class OwlParliament
 * @author Austin Uetz
 */
public class OwlParliament {
    private HashSet<Owl> parliament= new HashSet<>();
    
    public OwlParliament(String fileName) throws FileNotFoundException, IOException {
        BufferedReader inputFile = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = inputFile.readLine()) != null) {
            String[] animals = line.split(",");
            if ("Owl".equals(animals[2])) {
                parliament.add(new Owl(animals[0], Integer.parseInt(animals[1])));
            }
        }
    }
    
    public int size() {
        return parliament.size();
    }
    
    public Owl getChief() {
        Owl oldest = new Owl("",0);
        for (Owl owl : parliament) {
            if (owl.getAge() >= oldest.getAge()) {
                oldest = owl;
            }
        }
        return oldest;
    }
    
}
