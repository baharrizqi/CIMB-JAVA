import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Function {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input min: ");
        // byte inputMin = scanner.nextByte();
        // System.out.print("Input max: ");
        // byte inputMax = scanner.nextByte();

        // int range = (inputMax- inputMin) + 1;
        // int numbers[] = new int[range];
        // for (int i = 0; i < numbers.length;i++) {
        // numbers[i] = i + inputMin;
        // }
        // for (int i = 0; i < range;i++) {
        // numbers[i] = i + inputMin;
        // }
        // System.out.println(Arrays.toString(numbers));

        // generateArrayFromRange(inputMin, inputMax);
        // System.out.println(generateArrayFromRange(inputMin, inputMax));
        System.out.println(includesArray(-2));
    }

    public static ArrayList<Integer> generateArrayFromRange(int inputMin, int inputMax) {
        if (inputMin < inputMax) {
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            for (int i = inputMin; i <= inputMax; i++) {
                numbers.add(i);
            }

            // System.out.println(numbers);
            return numbers;
        }
        return new ArrayList<Integer>();
    }

    public static boolean includesArray(int item) {
        int numbers[] = {1,2,3,4,5};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==item) {
                return true;
            }
        }
        return false;
    }
}