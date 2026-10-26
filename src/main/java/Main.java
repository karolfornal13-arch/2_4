// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    System.out.println("Podaj dwie liczby do sumowania:");
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    scanner.nextLine();
    System.out.println(a);
    int b = scanner.nextInt();
    scanner.nextLine();
    System.out.println(b);
    int suma = a + b;
    System.out.println("Wynik:");
    System.out.println(suma);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}