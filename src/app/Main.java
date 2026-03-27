package app;

public class Main {
    public static void main(String[] args) {
        int orderNo;
        double price;
        String clientName;
        String productType;
        String address;
        String currency;

        orderNo = 1;
        clientName = "Alice";
        productType = "smartphone";
        price = 305.99;
        address = "Moon Street, 10";
        currency = "EUR";
        System.out.println("Order No:  " + orderNo + " Client: " + clientName + ".");
        System.out.println("Product:  " + productType + ",");
        System.out.println("price:  " + currency + " " + price + ".");
        System.out.println("Address:  " + address + ".");
        orderNo = 2;
        clientName = "Tom";
        productType = "laptop";
        currency = "EUR";
        price = 570.95;
        address = "Terra Street, 17";
        System.out.println("Order No:  " + orderNo + " Client: " + clientName + ".");
        System.out.println("Product:  " + productType + ",");
        System.out.println("price:  " + currency + " " + price + ".");
        System.out.println("Address:  " + address + ".");
    }
}
