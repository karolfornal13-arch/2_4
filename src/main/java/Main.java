// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    System.out.println("1 – dla sumy, 2 – dla różnicy, 3 – dla iloczynu, 4 – dla ilorazu");
    Scanner scanner = new Scanner(System.in);
    double liczba2 = 0;
    double liczba1 = 0;
    int a = scanner.nextInt();
    scanner.nextLine();
    switch (a) {
      case 1:
          System.out.println("Dodawanie");
          liczba1 = scanner.nextDouble();
          liczba2 = scanner.nextDouble();
          double suma = liczba1 + liczba2;
          System.out.println("wynik:" + suma);
          break;

      case 2:
          System.out.println("Odejmowanie");
          liczba1 = scanner.nextDouble();
          liczba2 = scanner.nextDouble();
          double roznica = liczba1 - liczba2;
          System.out.println("wynik:" + roznica);
        break;

      case 3:
          System.out.println("Mnożenie");
          liczba1 = scanner.nextDouble();
          liczba2 = scanner.nextDouble();
          double iloczyn = liczba1 * liczba2;
          System.out.println("wynik:" + iloczyn);
          break;
        case 4:
        System.out.println("Dzielenie");
        liczba1 = scanner.nextDouble();
        liczba2 = scanner.nextDouble();
        if(liczba2 !=0){
        double iloraz = liczba1 / liczba2;
        System.out.println("wynik:" + iloraz);
        break;
        }
        else{
          System.out.println("Niemożna dzielić przez zero");
          break;
        }
      
      default:
          System.out.println("Nieprawidłowy wybór");
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}
}