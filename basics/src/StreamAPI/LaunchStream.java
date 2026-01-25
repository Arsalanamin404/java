package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class LaunchStream {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= 20; i++)
            nums.add(i);

        System.out.println(nums);

        System.out.println("-".repeat(60));

        // once stream is consumed, it cant be reused
        Stream<Integer> sortedData = nums.stream().sorted(Comparator.reverseOrder());
        sortedData.forEach((n) -> System.out.print(n + " "));

        System.out.println();
        System.out.println("-".repeat(60));

        System.out.println(nums);

        System.out.println("-".repeat(60));

        Stream<Integer> evenNums = nums.stream().filter((n) -> n % 2 == 0);
        evenNums.forEach((n) -> System.out.print(n + " "));

        System.out.println();
        System.out.println("-".repeat(60));

        Stream<Integer> oddNums = nums.stream().filter((n) -> n % 2 != 0);
        oddNums.forEach((n) -> System.out.print(n + " "));

        System.out.println();
        System.out.println("-".repeat(60));
    }
}
