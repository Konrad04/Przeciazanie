package com.company;

public class Main {

    public static void main(String[] args) {
        PrzykladPrzeciazanie przyk = new PrzykladPrzeciazanie();
        System.out.println("int = " + przyk.wypisz(10));
        System.out.println("double = " + przyk.wypisz(19.2));
        System.out.println("string = " + przyk.wypisz("Przeciazenie"));

    }
}

class PrzykladPrzeciazanie {
    public int wypisz(int a) {
        return a;
    }

    public double wypisz(double a) {
        return a;
    }

    public String wypisz(String a) {
        return a;
    }


}