package test;
import java.util.Scanner;

public class poo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double xa, xb, xc, ya, yb, yc;
        System.out.println("Enter the meassurements of the triangle x:");
        xa = scanner.nextDouble();
        xb = scanner.nextDouble();
        xc = scanner.nextDouble();

        System.out.println("Enter the meassurements of the triangle y:");
        ya = scanner.nextDouble();
        yb = scanner.nextDouble();
        yc = scanner.nextDouble();

        double p = (xa + xb + xc) / 2;
        double areaX = Math.sqrt(p * (p - xa) * (p - xb) * (p - xc));

        p = (ya + yb + yc) / 2;
        double areaY = Math.sqrt(p * (p - ya) * (p - yb) * (p - yc));

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
