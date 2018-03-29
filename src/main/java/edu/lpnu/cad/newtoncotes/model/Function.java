package edu.lpnu.cad.newtoncotes.model;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.mariuszgromada.math.mxparser.Argument;
import org.mariuszgromada.math.mxparser.Expression;

public class Function implements UnivariateFunction {

    private String expressionStr;

    public Function(String expressionStr) {
        this.expressionStr = expressionStr;
    }

    @Override
    public double value(double x) {
        Argument argX = new Argument("x = " + x);
        Expression expression = new Expression(expressionStr, argX);
        return expression.calculate();
    }
}