package org.howard.edu.lsp.oopfinal.question1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SongDatabase {
    // The map that links genres to a set of song titles
    private Map<String, Set<String>> map = new HashMap<>();

    /* Add a song title to a genre */
    public void addSong(String genre, String songTitle) {
        // If the genre doesn't exist in the map, create a new HashSet
        map.putIfAbsent(genre, new HashSet<>());
        // Add the song to the set for the given genre
        map.get(genre).add(songTitle);
    }

    /* Return genre, i.e., Jazz, given a song title */
    public String getGenreOfSong(String songTitle) {
        // Iterate over the map to find the genre containing the song title
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            if (entry.getValue().contains(songTitle)) {
                return entry.getKey();
            }
        }
        return null; // Return null if the song title is not found in any genre
    }

    /* Return the Set that contains all songs for a genre */
    public Set<String> getSongs(String genre) {
        return map.get(genre); // Return the set for the given genre
    }
}