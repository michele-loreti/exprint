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
public class IntegerExpressionEvaluator implements ExpressionEvaluator<Integer> {

    @Override
    public Integer eval(Expression expr) {
        return switch (expr) {
            case SumExpression sumExpression -> evalSumExpression(sumExpression);
            case DiffExpression diffExpression -> evalDiffExpression(diffExpression);
            case MulExpression mulExpression -> evalMulExpression(mulExpression);
            case DivExpression divExpression -> evalDivExpression(divExpression);
            case LiteralExpression literalExpression -> evalLiteralExpression(literalExpression);
            case VarExpression varExpression -> evalVarExpression(varExpression);
        };

    }

    private int evalVarExpression(VarExpression varExpression) {
        return 0;
    }

    private int evalLiteralExpression(LiteralExpression literalExpression) {
        return literalExpression.value().intValue();
    }

    private int evalDivExpression(DivExpression mulExpression) {
        return eval(mulExpression.leftArgument())/eval(mulExpression.rightArgument());
    }

    private int evalMulExpression(MulExpression mulExpression) {
        return eval(mulExpression.leftArgument())*eval(mulExpression.rightArgument());
    }

    private int evalDiffExpression(DiffExpression diffExpression) {
        return eval(diffExpression.leftArgument())-eval(diffExpression.rightArgument());
    }

    private int evalSumExpression(SumExpression sumExpr) {
        return eval(sumExpr.leftArgument())+eval(sumExpr.rightArgument());
    }


}
