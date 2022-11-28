package day8;

public class Plane {

    private String manufacturer;
    private int year;
    private float lengthInMeters;
    private float weightInTonns;
    private float keroseneLevel;

    public Plane(
            String manufacturer, int year,
            float lengthInMeters, float weightInTonns
    ){
        this.manufacturer = manufacturer;
        this.year = year;
        this.lengthInMeters = lengthInMeters;
        this.weightInTonns = weightInTonns;
        this.keroseneLevel = 0;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLengthInMeters(float lengthInMeters) {
        this.lengthInMeters = lengthInMeters;
    }

    public void info(){
        System.out.printf("Изготовитель: %s, год выпуска: %d, длина: %f(м), вес: %f(т), объем топлива в баке: %f.",
                manufacturer, year, lengthInMeters, weightInTonns, keroseneLevel);
    }

    public void fillUp(float chargeAmount){

        if (keroseneLevel - chargeAmount < 0)
            keroseneLevel = 0;

        keroseneLevel +=chargeAmount;
    }

    public static void comparePlaneLength(Plane aircraft0, Plane aircraft1){

         if (aircraft0.lengthInMeters > aircraft1.lengthInMeters) {
             System.out.printf("Plane %s(%d) is longer.", aircraft0.manufacturer, aircraft0.year);
         }else if (aircraft0.lengthInMeters < aircraft1.lengthInMeters){
             System.out.printf("Plane %s(%d) is longer.", aircraft1.manufacturer, aircraft1.year);
         }
         else{
             System.out.println("Both planes are of equal length");
         }

    }

    @Override
    public String toString(){
        return String.format("Изготовитель: %s, год выпуска: %d, длина: %f(м), вес: %f(т), объем топлива в баке: %f.",
                manufacturer, year, lengthInMeters, weightInTonns, keroseneLevel);
    }

}
