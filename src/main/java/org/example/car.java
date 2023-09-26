package org.example;

class 오리 {
   비행 a비행;
   오리(){
       a비행 = new 날다();
   }
   void 날다(){
       a비행.작동();
   }
}
// 오리 => 부모 클래스
// 흰오리 => 자식 클래스
// 흰오리 extends 오리 => 흰오리가 오리의 능력을 물려 받는다.
// "`흰오리`는 `오리`이다." 라고 자바에게 알려준다.
// `A 는 B 이다.` 테스트에 통과하는 것만 상속이 가능하다.
// 클래스와 객체는 명사이다.
// 메서드는 동사이다.
class 흰오리 extends 오리 {

}
class 청둥오리 extends 오리 {

}
class 고무오리 extends 오리 {
    // 메서드 재정의 라고 합니다.
    // 메서드 오버라이드 라고도 합니다.
    // 메서드 재정의 => 부모가 물려준 능력을 다시 구현한다.
    고무오리() {
        a비행 = new 못날다();
    }
}
class 고무2오리 extends 오리 {
    고무2오리() {
        a비행 = new 못날다();
    }
}
abstract class 비행{
    abstract void 작동();
}
class 날다 extends 비행{
    void 작동(){
        System.out.println("오리가 날개로 날아갑니다.");
    }
}
class 못날다 extends 비행{

    void 작동(){
        System.out.println("저는 날 수 없어요. ㅜㅠ");
    }
}