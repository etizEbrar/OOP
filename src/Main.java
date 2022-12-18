import java.util.Scanner;

public class Main {
    //static Scanner scan =new Scanner(System.in);

    public static void main(String[] args) {

        Otomobil.Elektrikli otomobil= new Otomobil.Elektrikli();
        Motorsiklet motor1 = new Motorsiklet(54,48350,2009,"HONDA CBF250","BENZİN",1350);
        Motorsiklet motor2 = new Motorsiklet(17,330350,2022,"KAWASAKİ NİNJA1100H","BENZİN",5600);
        Motorsiklet motor3 = new Motorsiklet(128,118350,2010,"HONDA CBR600R","BENZİN",17000);
        Motorsiklet motor4 = new Motorsiklet(35,18350,1996,"JAWA 150H","BENZİN",3500);

        Suv jeep1  = new Suv(130,50240,1996,"MİTSUBİSHİ L200","DİZEL",57650);
        Suv jeep2 = new Suv(160,154540,2010,"BMW X1","DİZEL",83981);
        Suv jeep3 = new Suv(180,368740,2022,"AUDİ Q3","DİZEL",19320);


        Scanner scan =new Scanner(System.in);
        int aracTercih=0;
        int yakitTercihi=0;
        int yilTercihi=0;
        int butce=0;

        int[] IntArr={aracTercih,yakitTercihi,yilTercihi,butce};
        System.out.println("HOŞGELDİNİZ");
        System.out.println("1-Otomobil       2-SUV        3-Motorsiklet");
        System.out.println("Araç türü tercihiniz:");
        aracTercih=scan.nextInt();

        while (aracTercih<=1 && aracTercih>3){
            try{
                aracTercih=scan.nextInt();
                break;
            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println("1.Dizel     2.Elektrikli     3.Benzinli");
        System.out.println("İstediğiniz yakıt türünü seçiniz");
        yakitTercihi= scan.nextInt();
        while (yakitTercihi<=1 && yakitTercihi>3){
            try{
                yakitTercihi=scan.nextInt();
                break;
            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
        }






        System.out.println("1.(1980-2000)   2.(2000-2010)   3.(2011-2022");
        System.out.println("Seçtiğiniz üretim yılı aralığını seçiniz:");
        yilTercihi= scan.nextInt();
        while (yilTercihi<=1 && yilTercihi>3){
            try{
                yilTercihi=scan.nextInt();
                break;
            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
        }



        System.out.println("1.( - 100.000)   2.(100.001-300.000)   3.(300.001- )");
        System.out.println("İstediğiniz fiyat aralığını seçiniz:");
        butce=scan.nextInt();
        while (butce<=1 && butce>3){
            try{
                butce=scan.nextInt();
                break;
            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
        }







    }
/*
    public static void Kontrol(int feature){
        while (feature>=1 || feature<=3){
            try{
                feature=scan.nextInt();
            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
        }
    }
    */

}