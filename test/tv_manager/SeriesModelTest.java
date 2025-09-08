package tv_manager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SeriesModelTest {
    
    private SeriesModel instance;
    
    public SeriesModelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        // create a sample object before each test
        instance = new SeriesModel(1, "Naruto", 13, 220);
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    @Test
    public void testGetId() {
        System.out.println("getId");
        assertEquals(1, instance.getId());
    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        assertEquals("Naruto", instance.getName());
    }

    @Test
    public void testGetAgeRestriction() {
        System.out.println("getAgeRestriction");
        assertEquals(13, instance.getAgeRestriction());
    }

    @Test
    public void testGetEpisodes() {
        System.out.println("getEpisodes");
        assertEquals(220, instance.getEpisodes());
    }

    @Test
    public void testSetName() {
        System.out.println("setName");
        instance.setName("Naruto Shippuden");
        assertEquals("Naruto Shippuden", instance.getName());
    }

    @Test
    public void testSetAgeRestriction() {
        System.out.println("setAgeRestriction");
        instance.setAgeRestriction(16);
        assertEquals(16, instance.getAgeRestriction());
    }

    @Test
    public void testSetEpisodes() {
        System.out.println("setEpisodes");
        instance.setEpisodes(500);
        assertEquals(500, instance.getEpisodes());
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        String result = instance.toString();
        assertTrue(result.contains("Naruto")); // just check if name is included
        assertTrue(result.contains("13"));     // check age rating
        assertTrue(result.contains("220"));    // check episodes
    }
}
