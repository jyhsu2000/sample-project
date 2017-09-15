import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SampleTest {
    @Test
    public void testConcatenate() {
        Sample sample = new Sample();

        String result = sample.concatenate("Hello, ", "world.");

        assertEquals("Hello, world.", result);
    }
}
