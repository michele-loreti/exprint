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
 * Instances of this class are used to model the difference between two expressions.
 */
public class DiffExpression implements Expression {

    private final Expression leftArgument;
    private final Expression rightArgument;

    /**
     * Creates a new expression that subtracts the two given arguments.
     * A {@link NullPointerException} is thrown if one of the two parameters is <code>null</code>.
     *
     * @param leftArgument first argument in the sum.
     * @param rightArgument second argument in the sum.
     */
    public DiffExpression(Expression leftArgument, Expression rightArgument) {
        this.leftArgument = Objects.requireNonNull(leftArgument);
        this.rightArgument = Objects.requireNonNull(rightArgument);
    }

    /**
     * Returns the first argument in the difference.
     * @return the first argument in the difference.
     */
    public Expression getLeftArgument() {
        return leftArgument;
    }

    /**
     * Returns the second argument in the difference.
     * @return the second argument in the difference.
     */
    public Expression getRightArgument() {
        return rightArgument;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiffExpression that = (DiffExpression) o;
        return getLeftArgument().equals(that.getLeftArgument()) && getRightArgument().equals(that.getRightArgument());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLeftArgument(), getRightArgument());
    }
}
