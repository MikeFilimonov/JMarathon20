package day6;

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

}
