package club.kid7.sample;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SampleTest {
    private Sample sample;

    @Before
    public void setup() {
        sample = new Sample();
    }

    @Test
    public void testConcatenate() {
        assertEquals("Hello, world.", sample.concatenate("Hello, ", "world."));
    }
}
