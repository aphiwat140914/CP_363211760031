package lab9;

import javafx.scene.chart.ScatterChart;

import java.io.File;
import java.io.IOException;

public class ExCreataFile {
    public static void main(String[] args) {

        File myFile = new File("exFle.txt");

        try {
            if (myFile.createNewFile()) {
                System.out.println("Created file is successful.");
            } else {
                System.out.println("can not create file.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //canRedd()

            if (myFile.canRead()) {
                System.out.println("can read this file.");
            } else {
                System.out.println("can not read this file.");
            }
            //canWrite()
            if (myFile.canWrite()) {
                System.out.println("can write this file ");
            } else {
                System.out.println("can not write this file.");
            }
            //getname()
            System.out.println("File name is" + myFile.getName());
            //getpath()
            System.out.println("Path file is" + myFile.getName());
            //renameTo()
            File rFile = new File("myNewFile.txt");
            if (myFile.renameTo(rFile)) {
                System.out.println("File name is aleady changed");
            } else {
                System.out.println("Can not change file name");
            }






    }
}

