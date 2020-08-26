package lad4;

import java.time.Year;

public class Example_OverlooadMethod {
    public static int findmax(int x,int y){
        return (x>y)?x:y;
        //if(x>g)
        //      return x;
        // else
        //      return y;
    }
    public static double  findmax(double x, double y){
        return (x>y)? x:y;
    }
    public static void main(String[] args){
        int max = findmax(5,10);
        System.out.println("maximum is "+max);
        double max2 = findmax(5.0,10.0);
        System.out.println("maximum(2) is "+max2);

    }//moin
}
