import java.util.*;

public class Program_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt for list input directly
        System.out.println("Enter numbers separated by space or comma:");
        String inputLine = sc.nextLine();

        // Handle comma or space separation
        String[] tokens = inputLine.split("[,\\s]+");

        // Convert to integer list
        List<Integer> numbers = new ArrayList<>();
        for (String token : tokens) {
            numbers.add(Integer.parseInt(token.trim()));
        }

        // Initialize map for counts of multiples
        Map<Integer, Integer> countMap = new LinkedHashMap<>();
        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }

        // Count multiples
        for (int num : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    countMap.put(i, countMap.get(i) + 1);
                }
            }
        }

        // Output result
        System.out.println("Output:");
        System.out.println(countMap);

        sc.close();
    }
}
