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

public interface EvaluationDomain<T> {

    T evalLiteral(Number n);

    T evalSum(T arg1, T arg2);

    T evalDiff(T arg1, T arg2);

    T evalMul(T arg1, T arg2);

    T evalDiv(T arg1, T arg2);

    T valueForUndefinedVariables();
}
