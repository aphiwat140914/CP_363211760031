package Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Chaptar0_0{


    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please Enter Your Height Is m");

        System.out.println("Please Enter Your Weight Is kg");

        double height;
        String H ="";

        double weight;
        String w ="";
        double b =0.0d;

        try{
            System.out.println("enter Height");
            H = br.readLine ();
            System.out.println("enter weight");

     }

        catch (IOException e){
            System.out.println("Error!"); }


        height= Double.parseDouble(H);
        weight = Double.parseDouble(w);
        b= weight/(height*height);

        System.out.println("BMI"+ b );


        if(18.5<b){
            if(b<22.5)
                System.out.println("narmal");

        }
        if(23.0<b){
            if(b<29.9)
                System.out.println("plump");
        }

        if(b>30){
            System.out.println("fat");
        }

        if(b<18.5){
            System.out.println("thin");
        }

    }
}