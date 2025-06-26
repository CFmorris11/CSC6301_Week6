import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Author: Charles Morris
 *  A simple command-line program that reads integer values from standard input,
 * stores them in a LinkedList, sorts them in ascending order, and prints them.
 *
 * <p>
 * <strong>Code reuse:</strong>
 * <ul>
 *   <li>Uses {@link java.util.Scanner} to parse input tokens.</li>
 *   <li>Uses {@link java.util.LinkedList} from the Java Collections Framework
 *       instead of hand-rolling a linked-list implementation.</li>
 *   <li>Uses {@link java.util.Collections#sort(java.util.List)} to sort the list
 *       instead of writing a custom sort algorithm.</li>
 * </ul>
 * </p>
 *
 * <p>
 * To compile and run on the command line (requires JDK only, no IDE):
 * <pre>
 *   javac SortedLinkedListProgram.java
 *   java SortedLinkedListProgram
 * </pre>
 * You can also feed it a file of numbers:
 * <pre>
 *   java SortedLinkedListProgram < numbers.txt
 * </pre>
 * </p>
 *
 * @author 
 */
public class SortedLinkedListProgram {

    /**
     * The program entry point. Reads, sorts, and prints integers.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        LinkedList<Integer> numbers = readNumbers();
        sortNumbers(numbers);
        printNumbers(numbers);
    }

    /**
     * Reads all available integer tokens from standard input and returns
     * them in the order read.
     * 
     * <p><strong>Code reuse:</strong> Uses {@link java.util.Scanner} instead of a custom parser.</p>
     *
     * @return a LinkedList of integers read from System.in
     */
    public static LinkedList<Integer> readNumbers() {
        // Code reuse: leveraging java.util.Scanner for input parsing
        Scanner scanner = new Scanner(System.in);
        // Code reuse: using LinkedList from Java Collections Framework
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("Enter integers (non-integers end input):");
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }
        scanner.close();
        return list;
    }

    /**
     * Sorts the given list of integers in ascending order, in-place.
     * 
     * <p><strong>Code reuse:</strong> Delegates to
     * {@link java.util.Collections#sort(java.util.List)} – part of the
     * Java Collections Framework.</p>
     *
     * @param list the LinkedList to sort
     */
    public static void sortNumbers(LinkedList<Integer> list) {
        // Code reuse: using Collections.sort() for efficient sorting
        Collections.sort(list);
    }

    /**
     * Prints each integer in the list on its own line to standard output.
     *
     * @param list the LinkedList of integers to print
     */
    public static void printNumbers(LinkedList<Integer> list) {
        System.out.println("Sorted output:");
        for (Integer n : list) {
            System.out.println(n);
        }
    }
}
