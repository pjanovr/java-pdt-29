package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by roman.pianov on 18.04.2016.
 */
public class PointDistanceTests {

  @Test
  //Расстояние межуд 2 точками с одинаковыми координатами должно быть = 0
  public void testZeroDistance(){
    Point p1 = new Point(5,6);
    Point p2 = new Point(5,6);
    Assert.assertEquals(p1.distance(p2), 0.0);
  }

  @Test
  //Проверка вычисления расстояния межуд 2 точками с разными координатами
  public void testDistance(){
    Point p1 = new Point(1,0);
    Point p2 = new Point(1, 10);
    Assert.assertEquals(p1.distance(p2), 10.0);
  }

  @Test
  //Проверка вычисления расстояния между точками с отрицательными координатами
  public void testNegativeDistance(){
    Point p1 = new Point(-8,-20);
    Point p2 = new Point(-17, -20);
    Assert.assertEquals(p1.distance(p2), 9.0);
  }
}
