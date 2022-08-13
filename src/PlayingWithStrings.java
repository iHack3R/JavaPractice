import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class PlayingWithStrings {
    public static void main(String[] args) {
        //Checking the presence of a character in string
        String sentence1 = "The quick brown fox jumped over the lazy dog.";
        Boolean presence = sentence1.contains("jum");
        System.out.println("'jum' is present in the String: " + presence);

        //Counting the characters in a sentence
        String sentence2 = "The quick brown fox jumped over the lazy dog.";
        System.out.println(sentence2.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(Objects::toString, Collectors.counting())));

        //Reverse a string using for loop (Recommended method)
        String name1 = "Udit";
        for (int z = name1.length() - 1; z >= 0; z--) {
            System.out.print(name1.charAt(z));
        }

        //Reverse a string using while loop
        String name2 = "Udit";
        int i = name2.length();
        while (i > 0) {
            System.out.print(name2.charAt(i - 1));
            i--;
        }

        //OR
        //Using reverse method of StringBuilder or StringBuffer
        String input = "Udit";
        StringBuilder input1 = new StringBuilder();
        // append a string into StringBuilder input1
        input1.append(input);
        // reverse StringBuilder input1
        input1.reverse();
        // print reversed String
        System.out.println("Reverse of string using reverse method of StringBuilder: " + input1);

        //Find a missing number in an array
        int[] array = { 1, 2, 4, 5, 6 };
        int n = array.length;
        int sum = ((n+1)*(n+2))/2;
        for(int p = 0; p<n; p++)
            sum -= array[p];
        System.out.println("The missing number of this array is: " + sum);

        //Sorting a String using sort method
        String sentence = "the quick brown fox jumped over the lazy dog.";
        char[] stringToArray = sentence.toCharArray();
        Arrays.sort(stringToArray);
        String sortedSentence = new String(stringToArray);
        System.out.println("Sorting a String using sort method of Array: " + sortedSentence);
    }
}