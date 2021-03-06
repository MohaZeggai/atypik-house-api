package fr.atypikhouse.api.ControllersTest;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class LocationControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void whenGetLocations_thenStatus200() throws Exception{
        mvc.perform(get ("api/locations")
                .contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
    }

    @Test
    public void whenGetLocationsId_thenStatus200() throws Exception{
        mvc.perform(get ("api/locations/2")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}
