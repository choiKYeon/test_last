package org.example;

class 계산기 {
    static int 곱셈(int a, int b) throws ArithmeticException {
        try{
            if( a* b == 0)
                throw new ArithmeticException();
        }catch (ArithmeticException e){
            System.out.println("곱셈은 답이될 수 없습니다.");

        }
        return 0;
    }
}
