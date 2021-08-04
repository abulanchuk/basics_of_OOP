package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        Payment product = new Payment();
        do {
            System.out.println("1. add new product, 2. delete product BY INDEX: 3. output");
            n = in.nextInt();
            switch (n) {
                case 1: {
                    in.nextLine();
                    System.out.println(" enter the NAME, PRICE, QUANTITY");
                    String name = in.nextLine();
                    float price = in.nextFloat();
                    float quantity = in.nextFloat();
                    product.add(name, price, quantity);
                    break;
                }
                case 2:
                    int index = in.nextInt();
                    product.delete(index);
                    break;
                case 3:
                    System.out.println(product);
                default:
                    break;
            }
        } while (n > 0 && n < 4);
    }
}
