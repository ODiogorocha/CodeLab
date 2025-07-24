package test;
import java.util.Scanner;
import test.entities.Triangle;

public class poo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();
        
        System.out.println("Enter the meassurements of the triangle x:");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        System.out.println("Enter the meassurements of the triangle y:");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.println("Area of triangle x: " + areaX);
        System.out.println("Area of triangle y: " + areaY);

        if (areaX > areaY) {
            System.out.println("Triangle x has a larger area.");
        } else if (areaX < areaY) {
            System.out.println("Triangle y has a larger area.");
        } else {
            System.out.println("Both triangles have the same area.");
        }
        
        scanner.close();
    }
}
