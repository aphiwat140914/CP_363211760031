package lab3;

import java.util.Scanner;

//รับค่าจำนวนเต็ม 10 ครั่งจากผู้ใช้ แสดง ผรรวม และคำสั่ง ทางจอภาพ (for)
public class Example_For2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 10; i++){System.out.println("Enter integers:");
            int num = sc.nextInt();
            total += num;
        }
        System.out.println("Total:"+total);
        System.out.println("Average:"+ total/10);










    }
}






