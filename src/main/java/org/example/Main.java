package org.example; // 공유를 위한 용도

class Main {
    public static void main(String[] args) {
        int[] datas = new int[2];

        try {
            work(datas);
        } catch (ArrayIndexOutOfBoundsException e) { // main 함수 입장에서 이 코드는 가독성이 떨어진다.
            System.out.println("이런.. 오류가 발생했군요.");
        }
    }

    static void work(int[] datas) {
        for (int i = 0; i > datas.length; i++){
            throw new ArrayIndexOutOfBoundsException();
        }
        System.out.println("잘 출력되었습니다.");
    }
}
//Exception