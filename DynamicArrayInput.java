import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while (true) {
            System.out.println("Enter the number: ");
            int num = sc.nextInt();
            if (num == -1) {
                break;
            } else {
                numbers.add(num);
            }
        }
        System.out.println("\noutput of array is: ");
        for (int number : numbers) {
            System.out.println(number);
        }

        sc.close();
    }
}
