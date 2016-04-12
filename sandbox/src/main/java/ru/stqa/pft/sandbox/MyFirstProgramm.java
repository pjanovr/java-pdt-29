package ru.stqa.pft.sandbox;

public class MyFirstProgramm {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Square s = new Square(10);
        Rectangle r = new Rectangle(5,7);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " +  r.b + " = " + area(r));
    }
    public static double area (Square s){
        return s.l * s.l;
    }
    public static double area(Rectangle r){
        return r.a * r.b;
    }
}