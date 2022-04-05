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
 * Instances of this class are used to model an expression consisting of a single litteral.
 */
public class LitteralExpression {

    private final Number value;

    /**
     * Creates a new expression consisting of the given value.
     *
     * @param value value occurring in the expression.
     */
    public LitteralExpression(Number value) {
        this.value = Objects.requireNonNull(value);
    }

    /**
     * Returns the value occurring in the expression.
     *
     * @return the value occurring in the expression.
     */
    public Number getValue() {
        return value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LitteralExpression that = (LitteralExpression) o;
        return getValue().equals(that.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }

    @Override
    public String toString() {
        return "LitteralExpression{" +
                "value=" + value +
                '}';
    }
}
