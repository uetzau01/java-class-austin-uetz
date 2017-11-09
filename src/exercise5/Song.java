package exercise5;

import java.util.Objects;

/**
 * Class Song
 * Task 7: Create a class Song with the following private data members: String title, String artist.
 * Implement method equals. Two objects of type Song are equal if their titles and artists are equal.
 * Implement method hashCode. Hash code of an object is calculated as follows: numeric value of each letter in the title of a song is multiplied by that letter's position in the title and added to the accumulator (integer). Numeric value of each letter in the artist of a song is multiplied by that letter's position in the artist and added to the accumulator.
 * @author Austin Uetz
 */
public class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getArtist() {
        return artist;
    }
    
    public String toString() {
        return String.format("%s by %s", title, artist);
    }
    
    @Override
    public int hashCode() {
        int accum = 0;
        int temp = 0;
        for (int i=0; i<title.length(); ++i) {
            temp = (int) title.charAt(i);
            accum = accum + (temp * i);
        }
        for (int i=0; i<artist.length(); ++i) {
            temp = (int) artist.charAt(i);
            accum = accum + (temp * i);
        }
        
        return accum;
    }
    
    @Override
    public boolean equals(Object obj) {
        final Song other = (Song) obj;
        if (this.artist.equals(other.artist)) {
            if (this.title.equals(other.title)) {
                return true;
            }
        } return false;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Song other = (Song) obj;
//        if (!Objects.equals(this.title, other.title)) {
//            return false;
//        }
//        if (!Objects.equals(this.artist, other.artist)) {
//            return false;
//        }
//        return true;
//    }
    
    
    
}
