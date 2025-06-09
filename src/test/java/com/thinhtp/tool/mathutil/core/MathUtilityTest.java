package com.thinhtp.tool.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test //@Test mang y nghia bien ham o duoi nay thanh ham main() thi moi chay lenh test khi run app!!!
    //testcase #2: VERIFY GET FACTORIAL WITH N = 0
    void testFactorialGivenRightArgument0RunWell() {
        int n = 0;
        long expected = 1; //hy vong n = 0, tuc la 0! se co gia tri bang 1;
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected, actual); //so sanh giup tui xem thuc te co nhu ki vong ko??
        //neu ko ra mau do, tick do
        //neu expected == actual, ra tick xanh
    }

    @Test //@Test mang y nghia bien ham o duoi nay thanh ham main() thi moi chay lenh test khi run app!!!
        //testcase #2: VERIFY GET FACTORIAL WITH N = 1
    void testFactorialGivenRightArgument1RunWell() {
        int n = 1;
        long expected = 1; //hy vong n = 0, tuc la 0! se co gia tri bang 1;
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected, actual); //so sanh giup tui xem thuc te co nhu ki vong ko??
        //neu ko ra mau do, tick do
        //neu expected == actual, ra tick xanh
    }

    @Test //@Test mang y nghia bien ham o duoi nay thanh ham main() thi moi chay lenh test khi run app!!!
        //testcase #3: VERIFY GET FACTORIAL WITH N = 1
    void testFactorialGivenRightArgumentRunWell() {
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));
    }

    @Test
    void testFactorialGivenWrongArgumentThrowIllegalArgumentException(){
        //ta phai kiem soat, ta phai do xem, ngoai le da den chua neu la -5
        assertThrows(IllegalArgumentException.class, () -> {
            MathUtility.getFactorial(-5);
        });
    }
}