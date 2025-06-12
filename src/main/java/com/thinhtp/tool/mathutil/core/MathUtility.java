package com.thinhtp.tool.mathutil.core;

public class MathUtility {
    //class này chứa các hàm static, là nhưng hàm tiện ích dùng chung cho mọi nơi
    //day la ham mo phong thu vien toan hoc MATH. cua JDK
    //ham nay tinh n!: 1*2*3*...*n, ko co giai thua am, 0! ma 1, 20! vua du kieu long
//    public static long getFactorial(int n){
//       //dem code ra sua dc goi la refactor/refactoring
//        if( n < 0 || n > 20)
//            throw new IllegalArgumentException("n must be between 0 and 20");
//        //ban dua invalid data, to nem ra ngoai le, ham ko dc chay thanh cong, ko value tro ve
//
//        if( n == 0 )
//            return 1;
//        //song sot den day la n = 1...19
//        //for ma tinh
//        long result = 1; //thuat toan don con heo dat
//        for(int i =1; i <= n; i++)
//            result *= i; //nhan don vao tung chau n
//
//        return result;
//    }
//}

    public static long getFactorial(int n){
        //dem code ra sua dc goi la refactor/refactoring
        if( n < 0 || n > 20)
            throw new IllegalArgumentException("n must be between 0 and 20");
        //ban dua invalid data, to nem ra ngoai le, ham ko dc chay thanh cong, ko value tro ve

        if( n == 0 || n == 1)
            return 1;
        // đệ quy - recursion - gọi lại chính mình với quy mô nhỏ hơn

        return n * getFactorial(n-1);
    }
}

//đem lên sever mà ra màu xanh
  //1. code tối ưu ngon vì pass test case
  //2. test lại thứ đã từng test rất mất công, nay có script test tự động, cực khỏe
  //             REGRESSION TESTING, KIỂM THỬ HỒI QUY

//TDD: TEST DRIVEN DEVELOPMENT
//VIET CODE CHINH VA VIET TESTCASE TEST RUN SONG SONG VOI NHAU
//CU VIET DUOC CODE NAO, CO NGAY TEST CASE CHO NO
//TEST CASE DUNG DE TEST CAC HAM (KO NHAM VOI TEST APP - TEST MAN HINH UI VA NHAP LIEU...)
//CHI DANH CHO CHINH DAN DEV (DAN QA/QC KO DINH VAO CODE CUA PROJECT)


///NHO TDD, TDD DONG 1 PHAN GIUP TA TU DONG HOA QUA TRINH BUILD, CHECK ERROR, CHECK BUG, DONG GOI NEU CODE ON,
//DEPLOY LEN STAGING SEVER (SEVER DE TEST APP)
//CODE ---- CHECK VAR CODE (UNIT TEST, TDD)
//                OK THI DONG GOI APP
//                    DUA APP LEN SEVER
// QUY TRINH NAY DUOC GOI LA CI/CD

//CV CO 1 MUC:
//TECHNICAL SKILL ---------
//JUnit
//TDD
//CI/CD
//Maven
