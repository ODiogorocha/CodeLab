package test;
import java.util.Scanner;
import test.entities.product;

public class product_poo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        product produto = new product();
        int quantiade;

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        produto.name = sc.nextLine();
        System.out.println("Price: ");
        produto.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        produto.quantity = sc.nextInt();

        System.out.println("product data:" + produto);

        System.out.println("Enter number of products to be added in stock: ");
        quantiade = sc.nextInt();
        produto.add_products(quantiade);

        System.out.println("update data:" + produto);

        System.out.println("Enter number of products to be removed from stock: ");
        quantiade = sc.nextInt();
        produto.remove_products(quantiade);

        System.out.println("update data:" + produto);

        sc.close();
    }
}
