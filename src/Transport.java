
public class Transport {


    public String BRAND;
    public String MODEL;

    public float engineVolume;


    public void setBRAND(String BRAND) {
        this.BRAND = BRAND;
    }

    public void setMODEL(String MODEL) {
        this.MODEL = MODEL;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getBRAND() {
        return BRAND;
    }

    public String getMODEL() {
        return MODEL;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public Transport(String BRAND, String MODEL, float engineVolume) {

        if (BRAND.isEmpty() || BRAND.equals(null)) {
            this.BRAND = "BMW";
        } else {
            this.BRAND = BRAND;
        }

        if (MODEL.isEmpty() || MODEL.equals(null)) {
            this.MODEL = "z3";
        } else {
            this.MODEL = MODEL;
        }

        if (engineVolume >= 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.6F;
        }
    }
}
