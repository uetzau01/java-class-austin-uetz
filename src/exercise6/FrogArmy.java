package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class FrogArmy
 * @author Austin Uetz
 */
public class FrogArmy {
    private ArrayList<Frog> army = new ArrayList<>();
    
    public FrogArmy(String fileName) throws FileNotFoundException, IOException {
        BufferedReader inputFile = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = inputFile.readLine()) != null) {
            String[] animals = line.split(",");
            if ("Frog".equals(animals[2])) {
                army.add(new Frog(animals[0],Integer.parseInt(animals[1])));
            }
        }
    }
        
    public int size() {
        return army.size();
    }
    
    public Frog getChief() {
        Frog oldest = new Frog("",0);
        for (int i = 0; i < army.size(); ++i) {
            if (army.get(i).getAge() >= oldest.getAge()) {
                oldest = army.get(i);
            }
        }
        return oldest;
    }
        
}
