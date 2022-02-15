package JAVA101;

import java.util.Scanner;

public class KdvCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your product's price: ");
        double price = scanner.nextDouble();

        double kdv = (price*18)/100;

        double priceWoutKdv = price - kdv;

        System.out.println(" KDV'siz fiyat: " + priceWoutKdv);

        System.out.println("KDV tutarı: " + kdv);

        System.out.println("KDV'li tutar: " + price);
    }
}
