package com.xpanxion.myapp.student0;

import java.beans.beancontext.BeanContextMembershipEvent;
import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
//        ex1();
//        ex2();
//        ex4();
        ex5();
//        ex6();


        //junk();
    }

    private static void junk() {



    }

    private void printMessage(int numTimes) {
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
    }

    private void printMessage2(int numTimes) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello");
        }
    }

    private static void ex1() {
        var p1 = new Person();
        var p2 = new Person("Jon", "Smith");
        var p3 = new Person("Mary", "Jane", (byte) 12, 123456789);

        System.out.println(p1.speak());
        System.out.println(p2.speak());
        System.out.println(p3.speak());

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("Person count: " + Person.getPersonCount());
    }

    private static void ex2() { }

    private static void ex4() {
        var calculator =  new Calculator();
        var result1 = calculator.add(1, 2);
        var result2 = calculator.subtract(4, 2);
        var result3 = calculator.divide(10, 5);
        var result4 = calculator.multiply(2, 2);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(calculator.getHistory());
    }

    private static void ex5()  {
        //var shoppingCart = new ShoppingCart();
        var shoppingCart = new ShoppingCart(5.00F);
        shoppingCart.addItem(new Item(2.00F, 4, "Socks"));
        shoppingCart.addItem(new Item(10.00F, 2, "Shirts"));
        shoppingCart.calculateTotal();
        //System.out.println(shoppingCart.getTotal());
        var invoice = shoppingCart.shipOrder("Jon Smith", "123 Green Street", "Austin", "TX", 78737);
        System.out.println(invoice);
    }

    private static void ex6() {
        var shapes = new ArrayList<Shape>();
        shapes.add(new Square(5));
        shapes.add(new Rectangle(10,5));
        for (Shape s : shapes) {
            System.out.println(s.draw());
        }
    }
}
