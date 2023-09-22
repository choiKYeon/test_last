package org.example;

class 전사 {
    무기 a왼손무기;
    무기 a오른손무기;


    void 공격() {
        if (a왼손무기 != null) {
            a왼손무기.실행();
        }else if(a오른손무기 != null){
            a오른손무기.실행();
        }
    }
}

class 무기 {
    void 실행() {
    }
}
class 칼 extends 무기 {
    void 실행() {
        System.out.println("전사가 왼손으로 칼(을)를 사용합니다.");
    }
}

class 창 extends 무기 {
    void 실행() {
        System.out.println("전사가 왼손으로 창(을)를 사용합니다.");
    }
}

class 도끼 extends 무기 {
    void 실행() {
        System.out.println("전사가 오른손으로 도끼(을)를 사용합니다.");
    }
}