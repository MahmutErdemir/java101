import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b;
        double c,u,Alan;


        Scanner girdi = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz: ");
        a= girdi.nextInt();

        System.out.print("2. Kenarı Giriniz: ");
        b= girdi.nextInt();
        c= Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs : "+ c);

        //Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

        u = (a+b+c) / 2;
        Alan= Math.sqrt( u * (u-a)* (u-b) * (u-c));
        System.out.println("Alan : "+ Alan);




    }
}