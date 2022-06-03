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

import java.util.Map;

/**
 * This class provides the default implementation for an {@link ExpressionEvaluator}.
 */
public class SimpleExpressionEvaluator<T> implements ExpressionEvaluator<T> {

    private final EvaluationDomain<T> domain;
    private final Map<String, T> store;

    public SimpleExpressionEvaluator(EvaluationDomain<T> domain, Map<String, T> store) {
        this.domain = domain;
        this.store = store;
    }

    @Override
    public T eval(Expression expr) {
        return switch (expr) {
            case SumExpression sumExpression -> evalSumExpression(sumExpression);
            case DiffExpression diffExpression -> evalDiffExpression(diffExpression);
            case MulExpression mulExpression -> evalMulExpression(mulExpression);
            case DivExpression divExpression -> evalDivExpression(divExpression);
            case LiteralExpression literalExpression -> evalLiteralExpression(literalExpression);
            case VarExpression varExpression -> evalVarExpression(varExpression);
        };

    }

    private T evalVarExpression(VarExpression varExpression) {
        return store.getOrDefault(varExpression.variable(), domain.valueForUndefinedVariables());
    }

    private T evalLiteralExpression(LiteralExpression literalExpression) {
        return domain.evalLiteral(literalExpression.value());
    }

    private T evalSumExpression(SumExpression sumExpression) {
        return domain.evalSum(eval(sumExpression.leftArgument()), eval(sumExpression.rightArgument()));
    }

    private T evalDiffExpression(DiffExpression diffExpression) {
        return domain.evalDiff(eval(diffExpression.leftArgument()), eval(diffExpression.rightArgument()));
    }

    private T evalMulExpression(MulExpression mulExpression) {
        return domain.evalMul(eval(mulExpression.leftArgument()), eval(mulExpression.rightArgument()));
    }

    private T evalDivExpression(DivExpression divExpression) {
        return domain.evalDiv(eval(divExpression.leftArgument()), eval(divExpression.rightArgument()));
    }

}
