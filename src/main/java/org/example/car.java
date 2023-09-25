package org.example;


/* 구현 시작 */
class 전사 {
    무기 a무기;
    void 실행(){
        a무기.공격();
    }
}

class 무기{
    String 이름;
    int 번호;
    void 공격(){
        System.out.println(this.이름 + "(으)로 공격합니다.");
        System.out.println("데미지 :" + this.번호);
    }
}
class 칼 extends 무기{
    칼() {
        this.이름 = "칼";
        this.번호 = 78;
    }
}
class 창 extends 무기{
    창() {
        this.이름 = "창";
        this.번호 = 80;
    }
}
class 지팡이 extends 무기{
    지팡이() {
        this.이름 = "지팡이";
        this.번호 = 12;
    }
}
class 전설의_지팡이 extends 무기{
    전설의_지팡이() {
        this.이름 = "전설의_지팡이";
        this.번호 = 120;
    }
}
/* 구현 끝 */
