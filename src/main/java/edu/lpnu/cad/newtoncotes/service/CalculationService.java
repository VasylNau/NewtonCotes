package edu.lpnu.cad.newtoncotes.service;

import edu.lpnu.cad.newtoncotes.model.Function;
import edu.lpnu.cad.newtoncotes.model.Result;
import org.apache.commons.math3.analysis.integration.TrapezoidIntegrator;
import org.apache.commons.math3.analysis.integration.UnivariateIntegrator;
import org.springframework.stereotype.Service;

@Service
public class CalculationService {

    public Result calculate(String functionStr, double min, double max) {
        UnivariateIntegrator integrator = new TrapezoidIntegrator();
        Result result = new Result();
        result.setFunction(functionStr);
        result.setStartPoint(min);
        result.setEndPoint(max);

        result.setResult(integrator.integrate(3000, new Function(functionStr), min, max));
        return result;
    }

}
