import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double tutar,kdvOran = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.print("tutari giriniz : ");
        tutar = input.nextDouble();
        System.out.println("KDV'SIZ FIYAT : "+tutar);

        double kdvli_fiyat = tutar + (tutar * kdvOran);
        System.out.println("KDV'LI FIYAT : "+kdvli_fiyat);

        double fark = kdvli_fiyat - tutar;
        System.out.println("KDV TUTARI"+fark);
    }

}