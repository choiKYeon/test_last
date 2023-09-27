package org.example; // 공유를 위한 용도

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;
        age = 20;
        while(true){

           try{ System.out.printf("나이를 입력하세요.");
            age = scan.nextInt();
            scan.nextLine();

               if (age < 1){
                   System.out.println("음수는 안됩니다.");
               continue;
               }
           }catch(Exception e) {
               scan.nextLine();
               System.out.println("문자열은 안됩니다.");
               continue;
           }
            break;
        }


        System.out.printf("키 를 입력하세요.");
        int 키 = scan.nextInt();
        scan.nextLine();

        System.out.printf("이름 를 입력하세요.");
        String name = scan.next();
        scan.nextLine();

        System.out.printf("나이는" + age + "살 입니다.");
        System.out.printf(" " + 키 + "cm 이고요,");
        System.out.printf(" " + name + "입니다.");
    }
}