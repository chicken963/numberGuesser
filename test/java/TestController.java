package java;

import com.github.chicken963.numberguesser.Application;
import com.github.chicken963.numberguesser.controller.ComputationController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static com.github.chicken963.numberguesser.service.NumberGenerator.generateNumber;
import static com.github.chicken963.numberguesser.controller.ComputationController.returnAnswer;
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
