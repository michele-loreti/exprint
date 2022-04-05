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
public class VarExpression implements Expression {

    private final String variable;

    /**
     * Creates an expression consisting of a single variable.
     *
     * @param variable the name of the variable occurring in the expression.
     */
    public VarExpression(String variable) {
        this.variable = Objects.requireNonNull(variable);
    }

    /**
     * Returns the name of the variable in the expression.
     * @return the name of the variable in the expression.
     */
    public String getVariable() {
        return variable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VarExpression that = (VarExpression) o;
        return getVariable().equals(that.getVariable());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVariable());
    }

    @Override
    public String toString() {
        return "VarExpression{" +
                "variable='" + variable + '\'' +
                '}';
    }
}
