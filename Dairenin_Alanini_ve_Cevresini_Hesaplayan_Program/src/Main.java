import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r;
        double pi=3.14,alan,cevre,angle,alan2;
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz: ");
        r=input.nextInt();
        System.out.print("Dairenin Diliminin Açısını Giriniz: ");
        angle=input.nextInt();
        alan =pi*r*r;
        cevre=2*pi*r;
        alan2=(pi * (r*r) * angle) / 360;
        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);
        System.out.println("Dairenin Diliminin Alanı: " + alan2);



    }
}