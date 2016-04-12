package ru.stqa.pft.sandbox;

/**
 * Created by Roman.Pianov on 12.04.2016.
 */
public class Point {
  public double x;
  public double y;
  public Point(double x, double y){
    this.x = x;
    this.y = y;
  }
  double distance(Point a) {
    return Math.sqrt( Math.pow(this.x-a.x, 2) + Math.pow(this.y-a.y, 2));
  }
}
