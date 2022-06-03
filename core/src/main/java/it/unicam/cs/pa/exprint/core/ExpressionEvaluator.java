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
 * This interface represents objects that are used to evaluate an
 * expression.
 */
public interface ExpressionEvaluator<T> {

    /**
     * Method used to evaluate an expression.
     *
     * @param expr the expression to evaluate.
     * @return the result of expression evaluation.
     */
    T eval(Expression expr);

}
