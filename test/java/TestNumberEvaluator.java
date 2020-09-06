package java;

import com.github.chicken963.numberguesser.domain.Answer;
import com.github.chicken963.numberguesser.service.NumberEvaluator;
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
