import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe, yas, yolculukTipi;
        double yasIndirimi = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz : ");
        mesafe = input.nextInt();
        System.out.print("Yasinizi giriniz : ");
        yas = input.nextInt();
        System.out.print("Yolculuk Tipi(1=>Tek Yon, 2=>Gidis-Donus) :");
        yolculukTipi = input.nextInt();

        double normalTutar = mesafe * 0.10;


        if ((yas > 0) && (yas < 12)) {
            yasIndirimi = normalTutar * 0.5;
        } else if ((yas >= 12) && (yas <= 24)) {
            yasIndirimi = normalTutar * 0.1;
        } else if (yas >= 65) {
            yasIndirimi = normalTutar * 0.3;
        }
        double indirimliTutar = normalTutar - yasIndirimi;

        if (mesafe > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            if (yolculukTipi == 2){
            double gidisdonusIndirimi = indirimliTutar * 0.2;
            double toplamTutar = 2 * (indirimliTutar - gidisdonusIndirimi);
            System.out.println("Toplam Tutar :" + toplamTutar);
        } else if (yolculukTipi ==1 ) {
                System.out.println("Toplam Tutar :" + indirimliTutar);
            }

            } else {
                System.out.println("Hatali Veri Girdiniz!");


            }
        }
    }






