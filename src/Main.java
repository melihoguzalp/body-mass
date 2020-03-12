import java.util.Scanner;

public class Main {

    public static void main (String[] args)
    {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a length : ");
        double length = scanner.nextDouble();


        System.out.println("Enter a weight : ");
        int weight = scanner.nextInt();

        double average = (weight / length * length);

        if (average < 20)
            System.out.println("Weak");

        else if (average >= 20 && average < 30)
            System.out.println("Normal");

        else if (average >= 30 && average < 40)
            System.out.println("A little bit heavy");
        else
            System.out.println("Obese");


    }
}
