package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int n1,selection;
        double n2;
        

        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz :");
        n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz :");
        n2 = input.nextDouble();

        System.out.println("1 - Toplama\n2 - Çıkarma\n3 - Çarpma\n4 - Bölme");
        System.out.print("Seçiniz :");
        selection = input.nextInt();

        switch(selection){
            case 1:
            System.out.println("Toplam :" + (n1 + n2));
            break;
            case 2:
            System.out.println("Çıkarma :" + (n1 - n2));
            break;
            case 3:
            System.out.println("Çarpma :" + (n1 * n2));
            break;
            case 4:
            if(n2 != 0){
                System.out.println("Bölme :" + (n1 / n2));
            }else{
                System.out.println("Bir Sayı 0'a Bölünemez!");

            }
            break;
            default:
            System.out.println("Yanlış Seçim Yaptınız! Tekrar Deneyiniz!");

        }System.out.println("İşlem Tamamlandı!");


    }
    
}
