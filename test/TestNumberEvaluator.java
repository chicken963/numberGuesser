import computation.NumberEvaluator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestNumberEvaluator {

    @Test
    public void testNumberEvaluator() {
        String result = new NumberEvaluator(33, 30).giveAnswer();
        assertEquals("3Б4К", result);
    }
}
