import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = scan.nextInt();

        for (int i = 0; i < a; i++) {
            System.out.print(2 * i + 1);
            if (i != a - 1) System.out.print(", ");
        }
        
    }
}
