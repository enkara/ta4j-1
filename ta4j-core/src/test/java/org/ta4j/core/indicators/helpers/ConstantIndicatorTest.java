/*
  The MIT License (MIT)

  Copyright (c) 2014-2017 Marc de Verdelhan & respective authors (see AUTHORS)

  Permission is hereby granted, free of charge, to any person obtaining a copy of
  this software and associated documentation files (the "Software"), to deal in
  the Software without restriction, including without limitation the rights to
  use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
  the Software, and to permit persons to whom the Software is furnished to do so,
  subject to the following conditions:

  The above copyright notice and this permission notice shall be included in all
  copies or substantial portions of the Software.

  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
  FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
  COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
  IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
  CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package org.ta4j.core.indicators.helpers;

import org.junit.Before;
import org.junit.Test;
import org.ta4j.core.Decimal;

import static org.ta4j.core.TATestsUtils.assertDecimalEquals;

public class ConstantIndicatorTest {
    private ConstantIndicator<Decimal> constantIndicator;

    @Before
    public void setUp() {

        constantIndicator = new ConstantIndicator<Decimal>(Decimal.valueOf("30.33"));
    }

    @Test
    public void constantIndicator() {
        assertDecimalEquals(constantIndicator.getValue(0), "30.33");
        assertDecimalEquals(constantIndicator.getValue(1), "30.33");
        assertDecimalEquals(constantIndicator.getValue(10), "30.33");
        assertDecimalEquals(constantIndicator.getValue(30), "30.33");
    }
}