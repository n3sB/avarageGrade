import java.util.Scanner;

public class averageGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your Physics grade: ");
        double physics = scanner.nextDouble();
        System.out.println(" ");

        System.out.print("Please enter your Chemistry grade: ");
        double chemistry = scanner.nextDouble();
        System.out.println(" ");

        System.out.print("Please enter your Turkish grade: ");
        double turkish = scanner.nextDouble();
        System.out.println(" ");

        System.out.print("Please enter your History grade: ");
        double history = scanner.nextDouble();
        System.out.println(" ");

        System.out.print("Please enter your Music grade: ");
        double music = scanner.nextDouble();
        System.out.println(" ");

        double averageGrade = (physics + chemistry + turkish + history + music) / 5;
        scanner.close();

        boolean condition = averageGrade > 60;

        String passedOrFailed = (condition) ? "Sınıfı " + averageGrade + " İle Geçti" : "Sınıfta Kaldı";

        System.out.println(passedOrFailed);
    }
}
