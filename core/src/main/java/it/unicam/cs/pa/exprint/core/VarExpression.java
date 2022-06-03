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

import java.util.Objects;

/**
 * Instances of this class are used to model an expression containing a variable.
 */
public record VarExpression(String variable) implements Expression {

    /**
     * Creates an expression consisting of a single variable.
     *
     * @param variable the name of the variable occurring in the expression.
     */
    public VarExpression(String variable) {
        this.variable = Objects.requireNonNull(variable);
    }



}
