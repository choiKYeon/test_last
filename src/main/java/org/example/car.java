package org.example;

abstract class 오리 {
    비행아이템 a비행아이템;

    오리() {
        a비행아이템 = new 날개비행아이템();
    }

    void 날다() {
        a비행아이템.작동();
    }
}

class 흰오리 extends 오리 {

}

class 청둥오리 extends 오리 {

}

class 고무오리 extends 오리 {
    고무오리() {
        a비행아이템 = new 못나는비행아이템();
    }
    void 더날다(){
        a비행아이템 = new 로켓비행아이템();
    }
}

class 고무2오리 extends 오리 {
    고무2오리() {
        a비행아이템 = new 못나는비행아이템();
    }
}

abstract class 비행아이템 {
    abstract void 작동();
}

class 날개비행아이템 extends 비행아이템 {
    void 작동() {
        System.out.println("날개로 날아갑니다.");
    }
}

class 못나는비행아이템 extends 비행아이템 {
    void 작동() {
        System.out.println("저는 날 수 없어요. ㅠㅠ");
    }
}
class 로켓비행아이템 extends 비행아이템{
    void 작동(){
        System.out.println("로켓파워로 날아갑니다.");
    }
}
