
package tv_manager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Kintaro
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({tv_manager.TV_ManagerTest.class, tv_manager.SeriesTest.class, tv_manager.SeriesModelTest.class})
public class Tv_managerSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
