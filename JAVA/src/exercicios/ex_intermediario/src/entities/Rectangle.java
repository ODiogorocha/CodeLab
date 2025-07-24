package exercicios.ex_intermediario.src.entities;
import java.lang.Math;

public class Rectangle {
    public double width;
    public double height;

    public double area(){
        return width * height;
    }

    public double perimeter(){
        return (width + height) * 2;
    }

    public double diagonal(){
        return Math.sqrt((Math.pow(width,2) + Math.pow(height, 2)));
    }
}
