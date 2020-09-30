package Exercise;

public class SuperCar {

    private String CarBrand;
    private String CarColor;
    private int CarEngineSize;
    private int MaxSpeed;
    private String CountryOfOrigin;

    public SuperCar(){}

    public SuperCar (String b,String c,int s,int m,String o){
        CarBrand = b;
        CarColor = c;
        CarEngineSize = s;
        MaxSpeed = m;
        CountryOfOrigin = o;

    }




    public String getCarBrand(){ return CarBrand; }
    public void setCarBrand(String b){ CarBrand = b; }


    public String getCarColor(){ return CarColor; }
    public void setCarColor(String c){ CarColor = c; }


    public int getCarEngineSize(){ return CarEngineSize; }
    public void setCarEngineSize(int s){ CarEngineSize = s; }


    public int getMaxSpeed(){ return MaxSpeed; }
    public void setMaxSpeed(int m){ MaxSpeed = m; }


    public String getCountryOfOrigin(){ return CountryOfOrigin; }
    public void setCountryOfOrigin(String o){ CountryOfOrigin = o; }










}//class


