import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main (String[] args) {
        Integer[] numbers = {4, 9, 3, 6, 8, 3};
        List<Integer> listNumbers = Arrays.asList(numbers);
        List<Integer> sortedNumbers = listNumbers.stream().sorted().distinct().toList();
        System.out.print(sortedNumbers);
    }
}