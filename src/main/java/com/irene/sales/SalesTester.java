package com.irene.sales;

public class SalesTester {
    public static void main(String[] args) {
        Customer c1 = new Customer("0001",1200);
        Customer c2 = new Customer("0002",800);
        SilverCustomer c3 = new SilverCustomer("0003",2000);
        GoldenCustomer c4 = new GoldenCustomer("0004",5000);
        DiscountCustomer c5 = new DiscountCustomer("0006",900);
        c1.print();
        c2.print();
        c3.print();
        c4.print();
        c5.print();
    }
}
