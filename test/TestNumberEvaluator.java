import computation.Answer;
import computation.NumberEvaluator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestNumberEvaluator {

    @Test
    public void testNumberEvaluator() {
        Answer result = new NumberEvaluator(3204, 3014).giveAnswer();
        assertEquals(result.getCows(), 1);
        assertEquals(result.getBulls(), 2);
    }
}
