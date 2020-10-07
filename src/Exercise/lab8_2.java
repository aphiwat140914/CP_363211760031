package Exercise;

import java.util.Scanner;

public class lab8_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String");
        String s = sc.nextLine();

        int x = 0;
        try {
            x = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Can not transfer String to int.");
        }





        System.out.println(x);


    }

}



