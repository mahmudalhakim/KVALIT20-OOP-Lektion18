import java.util.Arrays;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-10-30
 * Time: 11:30
 * Project: KVALIT20-OOP-Lektion18
 * Copyright: MIT
 */
public class PointDemo {

  public static void main(String[] args) {

    // Skapa en punkt
    Point p1 = new Point();
    Point.print(p1);

    // Skapa en array som innehåller 5 referensvariabler
    Point[] arr = new Point[5];
    // Vi har fått en array med 5 referensvariabler
    for(Point p : arr)
      System.out.println(p);

    // Skapa 5 punkter
    for (int i = 0; i < arr.length; i++)
      arr[i] = new Point();

    // Skriv ut referenserna
    for(Point p : arr)
      System.out.println(p);
    // Eller
    System.out.println(Arrays.toString(arr));

    // Skriv ut punkterna med foreach-loop
    for(Point p : arr)
      Point.print(p);

    // Eller med en standard for-loop
    for (int i = 0; i < arr.length; i++) {
      Point.print(arr[i]);
    }

    // Manipulera den första punkten i arrayen
    arr[0].x = 5;
    arr[0].y = 5;
    Point.print(arr[0]);

  }


}
