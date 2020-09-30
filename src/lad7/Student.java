package lad7;

public class Student {

    private String name;
    private String person_id;
    private int age;
    //constructor
    //default constructor
    public Student(){}
    //design constructor
    public Student(String n,String p,int a){
        name = n;
        person_id = p;
        age = a;

    }

    //getter and setter
    //get คือ อ่านค่าข้อมูล attributes ของ object
    //set คือ เปลี่ยนแปลงหรือปรับปรุง attributes ของ object

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }


    public String getPerson_id(){
        return person_id;
    }
    public void setPerson_id(String p){
        person_id = p;
    }


    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", person_id='" + person_id + '\'' +
                ", age=" + age +
                '}';
    }

}//class



