import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar,kdvOran1=0.18,kdvOran2=0.08,kdvOran,kdvTutar,kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz: ");
        tutar =input.nextDouble();


        double str =(1000>=tutar  && tutar>=0) ? (kdvOran=kdvOran1) :(kdvOran=kdvOran2);
        kdvTutar=kdvOran*tutar;
        kdvliTutar=tutar+kdvTutar;
        System.out.println("KDV'siz Tutar :"+ tutar);
        System.out.println("KDV Oranı :"+ kdvOran);
        System.out.println("KDV Tutarı :"+ kdvTutar);
        System.out.println("KDV'li Tutar :"+ kdvliTutar);


    }
}