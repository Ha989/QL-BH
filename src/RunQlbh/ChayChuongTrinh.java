package RunQlbh;

import QuanLyBanHang.Customer;
import QuanLyBanHang.Product;


import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class ChayChuongTrinh {
    public static void main(String[] args) {
        LinkedList<Product> listProduct = new LinkedList<>() ;
        listProduct.add(new Product( 1L, "Mango", new Date("2022/8/3"), 300));
        listProduct.add(new Product(2L, "Banana", new Date("2022/8/3"), 200));
        listProduct.add(new Product(3L, "Guava", new Date("2022/8/3"), 250));
        listProduct.add(new Product(4L, "Watermelon", new Date("2022/8/3"), 150));

        Scanner scanner = new Scanner(System.in);
        System.out.println(" How many do you want to buy?");
        int quantity = scanner.nextInt();scanner.nextLine();
        System.out.println("Product Name ");
        String productName = scanner.nextLine();
        System.out.println("Input Id");
        Long id = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Input Customer Name ");
        String name = scanner.nextLine();
        System.out.println(" Input Customer Phone Number");
        String phoneNumber = scanner.nextLine();
        Date printDate = new Date();
        Customer customer = new Customer(id, name,printDate, phoneNumber);
        customer.Infor();
        if (productName.equals("Mango")) {
            customer.money(quantity, listProduct.get(0).getProductPrice());
        } else if (productName.equals("Banana")) {
            customer.money(quantity,listProduct.get(1).getProductPrice());
        } else if (productName.equals("Guava")){
            customer.money(quantity,listProduct.get(2).getProductPrice());
        } else if (productName.equals("Watermelon")) {
            customer.money(quantity,listProduct.get(3).getProductPrice());
        } else {
            System.out.println("delete");
        }

    }
}
