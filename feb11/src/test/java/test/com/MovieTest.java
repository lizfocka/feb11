/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import itexps.com.Movie;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author focka
 */
public class MovieTest {
    Movie movie; 
    
    public MovieTest() {
 
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testmovie() {
     movie.setYear(2013);
     movie.setId("00000012");
     movie.setTitle("A beautiful dream");
     
     assertEquals(2013, movie.getYear());
     assertEquals("00000012", movie.getId());
     assertEquals("A beautiful dream", movie.getTitle());
     
     
     }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
        movie = new Movie ();
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
