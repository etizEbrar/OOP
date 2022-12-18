public class Otomobil extends Tasit{

    public Otomobil(int beygirGucu, int fiyat, int uretimYili, String yakitTuru, String model, int km) {
        super(beygirGucu, fiyat, uretimYili, yakitTuru, model, km);
    }

    class Benzinli{

        String yakitTuru="benzin";
    }
    class Dizel{
        String yakitTuru="dizel";

    }
    static class Elektrikli{
        String yakitTuru="elektrik";

    }
}
