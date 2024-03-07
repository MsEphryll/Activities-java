import java.util.Scanner;

public class HalfDiamondPattern {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("How many stars do you want?");
    int numStars = input.nextInt();

    for (int i = 1; i <= numStars; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*" + "");
      }
      System.out.println();
    }

    for (int i = numStars - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
