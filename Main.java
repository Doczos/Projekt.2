import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    System.out.println(
        "Podaj liczby do zsumowania lub 0, aby zakonczyc."
    );

    int suma = 0;
    int liczba;

    while (true) {
      System.out.print("Podaj liczbe: ");
      liczba = getInt();

      if (liczba == 0) {
        break;
      }

      suma += liczba;
    }

    System.out.println("Suma liczb to " + suma);
  }

  public static int getInt() {
    return new Scanner(System.in).nextInt();
  }
}