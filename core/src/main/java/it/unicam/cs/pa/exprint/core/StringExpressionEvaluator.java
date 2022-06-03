/*
 * ExPrint: A simple Expression Interpreter
 *
 * Copyright 2022 Michele Loreti
 *
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */

package it.unicam.cs.pa.exprint.core;

/**
 * This class provides the default implementation for an {@link ExpressionEvaluator}.
 */
public class StringExpressionEvaluator implements ExpressionEvaluator<String> {

    @Override
    public String eval(Expression expr) {
        return switch (expr) {
            case SumExpression sumExpression -> evalSumExpression(sumExpression);
            case DiffExpression diffExpression -> evalDiffExpression(diffExpression);
            case MulExpression mulExpression -> evalMulExpression(mulExpression);
            case DivExpression divExpression -> evalDivExpression(divExpression);
            case LiteralExpression literalExpression -> evalLiteralExpression(literalExpression);
            case VarExpression varExpression -> evalVarExpression(varExpression);
        };

    }

    private String evalVarExpression(VarExpression varExpression) {
        return varExpression.variable();
    }

    private String evalLiteralExpression(LiteralExpression literalExpression) {
        return literalExpression.value().toString();
    }

    private String evalDivExpression(DivExpression mulExpression) {
        return eval(mulExpression.leftArgument())+eval(mulExpression.rightArgument());
    }

    private String evalMulExpression(MulExpression mulExpression) {
        return eval(mulExpression.leftArgument())+eval(mulExpression.rightArgument());
    }

    private String evalDiffExpression(DiffExpression diffExpression) {
        return eval(diffExpression.leftArgument())+eval(diffExpression.rightArgument());
    }

    private String evalSumExpression(SumExpression sumExpr) {
        return eval(sumExpr.leftArgument())+eval(sumExpr.rightArgument());
    }


}
