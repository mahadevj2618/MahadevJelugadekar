import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        int limit = (a % 2 == 0) ? a - 1 : a;
        for (int i = 0; i < limit; i++) {
            System.out.print(2 * i + 1);
            if (i != limit - 1) System.out.print(", ");
        }
      
    }
}
