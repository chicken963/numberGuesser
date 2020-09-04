import com.github.chicken963.numberguesser.domain.Answer;
import com.github.chicken963.numberguesser.service.NumberEvaluator;
import controller.ComputationController;
import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import static com.github.chicken963.numberguesser.service.NumberGenerator.generateNumber;
import static controller.ComputationController.returnAnswer;

public class TestController {
    HttpHeaders headers = new HttpHeaders();
    TestRestTemplate restTemplate = new TestRestTemplate();
//    public final int rightAnswer = generateNumber();
//    private final int guessedNumber = 3217;
    private final int attemptedNumber = 3419;

    @Test
    public void testRestGuess() throws JSONException {
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/compute?guess=" + attemptedNumber),
                HttpMethod.GET, entity, String.class);
        Answer answer = returnAnswer(Integer.toString(attemptedNumber));
        String expected = "{\"cows\":" + answer.getCows() + ",\"bulls\":" + answer.getBulls() + "}";
        JSONAssert.assertEquals(expected, response.getBody(), false);
    }

    private String createURLWithPort(String uri) {
        return "http://localhost:8080" + uri;
    }
}
