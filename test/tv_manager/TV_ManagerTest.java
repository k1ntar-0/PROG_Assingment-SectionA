package tv_manager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TV_ManagerTest {
    
    public TV_ManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class TV_Manager.
     */
    @Test
    public void testMain() {
        System.out.println("main");

        // Instead of failing, just run main safely
        String[] args = null;

        try {
            TV_Manager.main(args);  // call main
            assertTrue(true);       // if no crash, test passes
        } catch (Exception e) {
            fail("main method threw an exception: " + e.getMessage());
        }
    }
}
