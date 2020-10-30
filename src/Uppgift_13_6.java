/**
 * Created by Mahmud Al Hakim
 * Date: 2020-10-30
 * Time: 09:13
 * Project: KVALIT20-OOP-Lektion18
 * Copyright: MIT
 */
public class Uppgift_13_6 {
  public static void main(String[] args) {

    System.out.println("--- Kort 1 ---");
    Card c1 = Card.getInstance(Card.SPADES, Card.QUEEN);
    Card.print(c1);

    System.out.println("--- Kort 2 ---");
    Card c2 = Card.getInstance(Card.CLUBS, 7);
    Card.print(c2);

  }




}
