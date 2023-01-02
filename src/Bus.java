public class Bus extends Transport {

    public boolean speed;

    public void stopMoving(){
        if(speed==true){
            this.speed=false;
        }
        else {
            System.out.println("Машина итак стоит");
        }
    }

    public void startMoving(){
        if(speed==false){
            this.speed=true;
        }
        else {
            System.out.println("Машина итак едет");
        }
    }


    public Bus(String BRAND, String MODEL, float engineVolume, boolean speed) {
        super(BRAND, MODEL, engineVolume);
        this.speed=speed;
    }
    @Override
    public String toString() {
        return  "Марка машины " + BRAND + "\n"
                + "Модель " + MODEL + "\n"
                + "Объём двигателя " + engineVolume + "\n"
                + "Скорость " + speed + "\n";
    }
}
