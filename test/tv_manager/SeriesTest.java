package tv_manager;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SeriesTest {

    private Series series;

    @Before
    public void setUp() {
        series = new Series();
    }

    @Test
    public void testCaptureSeriesAddsNewSeries() {
        // Given
        SeriesModel sm = new SeriesModel(1, "Naruto", 13, 220);
        series.addSeries(sm); // Instead of prompting input, add directly for test

        // When
        SeriesModel found = series.getSeriesById(1);

        // Then
        assertNotNull(found);
        assertEquals("Naruto", found.getName());
        assertEquals(13, found.getAgeRestriction());
        assertEquals(220, found.getEpisodes());
    }

    @Test
    public void testSearchSeriesFindsCorrectSeries() {
        series.addSeries(new SeriesModel(2, "One Piece", 13, 1000));

        SeriesModel found = series.getSeriesById(2);

        assertNotNull(found);
        assertEquals("One Piece", found.getName());
    }

    @Test
    public void testUpdateSeriesChangesName() {
        series.addSeries(new SeriesModel(3, "Bleach", 16, 366));
        series.updateSeriesName(3, "Bleach: TYBW");

        SeriesModel updated = series.getSeriesById(3);

        assertEquals("Bleach: TYBW", updated.getName());
    }

    @Test
    public void testDeleteSeriesRemovesIt() {
        series.addSeries(new SeriesModel(4, "Dragon Ball Z", 13, 291));

        boolean removed = series.deleteSeriesById(4);

        assertTrue(removed);
        assertNull(series.getSeriesById(4));
    }

    @Test
    public void testSeriesReportPrintsCorrectly() {
        series.addSeries(new SeriesModel(5, "Attack on Titan", 17, 75));
        String report = series.seriesReport();

        assertTrue(report.contains("Attack on Titan"));
        assertTrue(report.contains("75"));
    }
}
