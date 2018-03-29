package edu.lpnu.cad.newtoncotes;

import edu.lpnu.cad.newtoncotes.controller.BaseController;
import edu.lpnu.cad.newtoncotes.service.CalculationService;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewtonCotesWebAppContextTest {

    @Autowired
    private CalculationService calculationService;

    @Autowired
    private BaseController baseController;

    @Test
    public void contextLoads() throws Exception {
        assertThat(calculationService).isNotNull();
        assertThat(baseController).isNotNull();
    }

}