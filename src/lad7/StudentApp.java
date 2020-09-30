package lad7;

public class StudentApp {
    public static void main(String[] args ){

        //create object of Student class
        Student std1=new Student();

        std1.setName("Aphiwat");
        std1.setPerson_id("1111111111");
        std1.setAge(20);

        displayDataObject(std1);

        Student std2 = new Student();

        std2.setName("Aphiwat");
        std2.setPerson_id("1111111111");
        std2.setAge(20);

        displayDataObject(std2);



    }//main

    private static void displayDataObject(Student std) {
        System.out.println(std.getName());
        System.out.println(std.getPerson_id());
        System.out.println(std.getAge());

    }
}//class
