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
 * This interface is used to model a generic expression.
 */
public sealed interface Expression permits LiteralExpression, DiffExpression, DivExpression, MulExpression, SumExpression, VarExpression {


}
