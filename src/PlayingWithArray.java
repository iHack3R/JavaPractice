import java.util.*;

public class PlayingWithArray {
    public static void main(String [] args) {

        //Array to list conversion and printing sorted and distinct integers
        Integer[] numbers = {1, 1, 3, 4, 5};

        //Integer array to list
        List<Integer> numbersToList = Arrays.asList(numbers);

        //Integer array to string
        String num = Arrays.toString(numbers);

        List<Integer> sortedDistinctNumbers = numbersToList.stream().sorted().distinct().toList();
        System.out.println("Integer arrays to list: " + numbersToList);
        System.out.println("Sorted and Distinct numbers from ArrayList: " + sortedDistinctNumbers);
        System.out.println("Integer arrays to String: " + num);

        //Distinct and sorted arrays
        Integer[] arrayNumbers = {4,7,2,8,4,6,5};
        TreeSet<Integer> sortedNumbers = new TreeSet<>();
        Collections.addAll(sortedNumbers, arrayNumbers);
        System.out.println("Sorted and Distinct numbers from Array: " + sortedNumbers);

        //Output of an operator
        int i=0;
        i = i++ - --i + ++i - i--;
        System.out.println(i);
    }
}