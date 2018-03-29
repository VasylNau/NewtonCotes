package edu.lpnu.cad.newtoncotes.service;

import edu.lpnu.cad.newtoncotes.model.Result;
import org.apache.commons.math3.analysis.integration.TrapezoidIntegrator;
import org.apache.commons.math3.analysis.integration.UnivariateIntegrator;
import org.assertj.core.api.Assertions;
import org.hamcrest.number.IsCloseTo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

@RunWith(MockitoJUnitRunner.class)
public class CalculationServiceTest {

    @Mock
    private CalculationService calculationService;

    @Test
    public void testCalculateAndExpectZero() {
        String functionStr = "sin(x)";
        double min = -Math.PI;
        double max = Math.PI;

        Result result = calculationService.calculate(functionStr, min, max);
        assertThat(result.getResult()).isCloseTo(0, within(10e-17));
        assertThat(result.getFunction()).isEqualTo(functionStr);
        assertThat(result.getStartPoint()).isEqualTo(min);
        assertThat(result.getEndPoint()).isEqualTo(max);
    }

}
