package ru.stqa.pft.sandbox;

public class MyFirstProgramm {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        double l = 8;
        double a = 34;
        double b = 11;
        System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " +  b + " = " + area(a, b));
    }
    public static double area (double len){
        return len * len;
    }
    public static double area(double a, double b ){
        return a * b;
    }
}