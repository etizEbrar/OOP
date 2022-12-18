public class Tasit {

    private int beygirGucu;
    private int fiyat;
    private int uretimYili;
    public String yakitTuru;
    private String model;
    private int km;




    public Tasit(int beygirGucu, int fiyat, int uretimYili, String model, String yakitTuru , int km){
       this.beygirGucu=beygirGucu;
       this.fiyat=fiyat;
       this.uretimYili=uretimYili;
       this.yakitTuru=yakitTuru;
       this.model=model;
       this.km=km;



    }

    public int getBeygirGucu() {
        return beygirGucu;
    }

    public void setBeygirGucu(int beygirGucu) {
        this.beygirGucu = beygirGucu;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

}

