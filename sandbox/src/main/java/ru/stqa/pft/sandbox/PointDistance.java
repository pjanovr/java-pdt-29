package ru.stqa.pft.sandbox;

/**
 * Created by Roman.Pianov on 12.04.2016.
 */
public class PointDistance {
  public static void main(String[]args){
    Point p1 = new Point (3,6);
    Point p2 = new Point(2,1);
    // Вычисление расстояния через функцию
    System.out.println("Расстояние межу точкой с координамами " + "(" + p1.x + "," + p1.y + ") и (" + p2.x + "," + p2.y + ") равно " + distanceMethod(p1,p2));
    // Вычисление расстояния через метод класса
    System.out.println("Расстояние межу точкой с координамами " + "(" + p1.x + "," + p1.y + ") и (" + p2.x + "," + p2.y + ") равно " + p1.distance(p2));
  }
  // Функция для вычисления расстояния между 2 точками
  public static double distanceMethod(Point p1, Point p2){
    return Math.sqrt((Math.pow((p2.x - p1.x),2)) + (Math.pow((p2.y - p1.y),2)));
  }
}
