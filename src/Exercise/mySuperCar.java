package Exercise;

public class mySuperCar  {

    public static void main(String[] args) {

        SuperCar spc1 = new SuperCar();

        spc1.setCarBrand("ford");
        spc1.setCarColor("red");
        spc1.setCarEngineSize(2500);
        spc1.setMaxSpeed(250);
        spc1.setCountryOfOrigin("japan");

        displayDataObject(spc1);

        SuperCar spc2 = new SuperCar();
        spc2.setCarBrand("nsx");
        spc2.setCarColor("green");
        spc2.setCarEngineSize(2800);
        spc2.setMaxSpeed(250);
        spc2.setCountryOfOrigin("japan");

        displayDataObject(spc2);




    }

    private static void displayDataObject(SuperCar spc) {
        System.out.println(spc.getCarBrand());
        System.out.println(spc.getCarColor());
        System.out.println(spc.getCarEngineSize());
        System.out.println(spc.getMaxSpeed());
        System.out.println(spc.getCountryOfOrigin());
    }


}//class