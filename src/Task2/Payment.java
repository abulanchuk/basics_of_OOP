package Task2;

import java.util.ArrayList;

public class Payment {
    float currentCost = 0;
    ArrayList<Product> products = new ArrayList<>();

    class Product {
        String name;
        float price;
        float quantity;

        public Product(String name, float price, float quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public float getCost() {
            return price * quantity;
        }

        public String getName() {
            return name;
        }

        public float getPrice() {
            return price;
        }

        public float getQuantity() {
            return quantity;
        }

        public String toString() {
            return "product: " + getName() + " price:" + getPrice() + " quantity: " + getQuantity();
        }
    }


    public void add(String name, float price, float quantity) {
        Product p = new Product(name, price, quantity);
        products.add(p);
        currentCost += p.getCost();
    }

    public void delete(int index) {
        if (index < products.size() && index >= 0) {
            currentCost -= products.get(index).getCost();
            products.remove(index);
        }

    }

    public String toString() {
        String s = "";
        for (Product p : products) {
            s += "-----------------------------\n";
            s += p.toString()+"\n";
        }
        s += "===============================\n";
        s+= "TOTAL: "+ currentCost;
        return s;
    }
}
