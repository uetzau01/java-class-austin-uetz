package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

/**
 * Class KangarooMob
 * @author Austin Uetz
 */
public class KangarooMob {
    private HashSet<Kangaroo> mob = new HashSet<>();

    public KangarooMob(String fileName) throws FileNotFoundException, IOException {
        BufferedReader inputFile = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = inputFile.readLine()) != null) {
            String[] animals = line.split(",");
            if ("Kangaroo".equals(animals[2])) {
                mob.add(new Kangaroo(animals[0],Integer.parseInt(animals[1])));
            }
        }
    }
    
    public int size() {
        return mob.size();
    }
    
    public Kangaroo getChief() {
        Kangaroo oldest = new Kangaroo("",0);
        for (Kangaroo roo : mob) {
            if (roo.getAge() >= oldest.getAge()) {
                oldest = roo;
                }
        }
        return oldest;
    }
    
}
