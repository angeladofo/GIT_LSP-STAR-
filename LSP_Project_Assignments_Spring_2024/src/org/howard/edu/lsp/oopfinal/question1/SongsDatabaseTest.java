package org.howard.edu.lsp.oopfinal.question1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class SongsDatabaseTest {
    private SongDatabase db;

    @Before
    public void setUp() {
        db = new SongDatabase();
    }

    @Test
    public void testAddSong() {
        db.addSong("Rap", "Savage");
        Set<String> rapSongs = db.getSongs("Rap");
        assertNotNull(rapSongs); 
        assertTrue(rapSongs.contains("Savage")); 
    }

    @Test
    public void testGetGenreOfSong() {
        db.addSong("Country", "Sweet Alabama");
        String genre = db.getGenreOfSong("Sweet Alabama");
        assertEquals("Country", genre); // Check if the correct genre is returned

        genre = db.getGenreOfSong("Unknown Song");
        assertNull(genre); // Should return null for a non-existent song
    }

    @Test
    public void testGetSongs() {
        db.addSong("Jazz", "Always There");
        db.addSong("Jazz", "Take Five");
        Set<String> jazzSongs = db.getSongs("Jazz");
        assertNotNull(jazzSongs); // The set should not be null
        assertEquals(2, jazzSongs.size()); // The set should contain two songs
        assertTrue(jazzSongs.contains("Always There")); // Check if "Always There" is in the set
        assertTrue(jazzSongs.contains("Take Five")); // Check if "Take Five" is in the set
    }
}