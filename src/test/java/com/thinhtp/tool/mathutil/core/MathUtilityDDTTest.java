package com.thinhtp.tool.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
    //tach data ra khỏi câu lệnh test
    //dựng 1 mảng 2 chiều, input, expected
    //sau đó nhòi vào, fill vào câu lệnh để so sánh!!!
    //mảng này sẽ là nguồn dữ liệu để hàm so sánh, nhiều lần như thế, do nhiều bộ data -> nguồn này là static
    //để tìm kiếm nhanh chóng
    public static  Object[][] initTestData() {
        return new Object[][]{ {0, 1},
                               {1, 1},
                               {2, 2},
                               {3, 6},
                               {4, 24},
                               {5, 120},
                               {6, 7200}
                             };
    }
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgumentRunWell(int n, long expected)
    {
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}