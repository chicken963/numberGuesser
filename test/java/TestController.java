package java;

import com.github.chicken963.numberguesser.Application;
import com.github.chicken963.numberguesser.domain.Answer;
import com.github.chicken963.numberguesser.service.NumberEvaluator;
import controller.ComputationController;
import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;

import static com.github.chicken963.numberguesser.service.NumberGenerator.generateNumber;
import static controller.ComputationController.returnAnswer;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest(classes = Application.class)
@AutoConfigureMockMvc
public class TestController {
    @Autowired
    private MockMvc mockMvc;

    @org.junit.jupiter.api.Test
    public void testCompute() throws Exception {
        mockMvc.perform(get("/compute").param("guess","1111"))
                .andDo(print()).andExpect(status().isOk());
//                .andExpect(jsonPath("$.content").value("Hello, World!"));

    }

}
