import java.util.Stack;
import java.util.Collections;
import java.util.Scanner;

/**
 * Maintenance update of SortedLinkedListProgram:
 * now reads integers into a Stack rather than a LinkedList,
 * sorts them in ascending order, and prints them.
 *
 * <p><strong>Code reuse:</strong>
 * <ul>
 *   <li>Uses {@link java.util.Scanner} for input parsing—no custom parser.</li>
 *   <li>Uses {@link java.util.Stack} from the Collections Framework
 *       instead of hand-rolling a stack implementation.</li>
 *   <li>Uses {@link java.util.Collections#sort(java.util.List)}
 *       to sort the stack rather than writing a new sort algorithm.</li>
 * </ul>
 * </p>
 *
 * <p><strong>Compile &amp; Run</strong> (JDK only, no IDE):
 * <pre>
 *   javac SortedStackProgram.java
 *   java  SortedStackProgram
 * </pre>
 * You can also pipe in a file of integers:
 * <pre>
 *   java SortedStackProgram &lt; numbers.txt
 * </pre>
 * </p>
 *
 * <p><strong>Generate Javadoc</strong>:
 * <pre>
 *   javadoc -d doc SortedStackProgram.java
 * </pre>
 * </p>
 *
 * @author Charles Morris
 */
public class SortedStackProgram {

    /**
     * Entry point. Reads into a Stack, sorts it, then prints.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        Stack<Integer> numbers = readNumbers();
        sortNumbers(numbers);
        printNumbers(numbers);
    }

    /**
     * Reads all integer tokens from stdin into a Stack.
     *
     * <p><strong>Code reuse:</strong> Using {@link Scanner} for parsing
     * instead of a custom solution.</p>
     *
     * @return a Stack of the integers read
     */
    public static Stack<Integer> readNumbers() {
        Scanner scanner = new Scanner(System.in);
        // Code reuse: using java.util.Stack rather than rolling own
        Stack<Integer> stack = new Stack<>();

        System.out.println("Enter integers (non-integer to end):");
        while (scanner.hasNextInt()) {
            stack.push(scanner.nextInt());
        }
        scanner.close();
        return stack;
    }

    /**
     * Sorts the Stack in ascending order in-place.
     *
     * <p><strong>Code reuse:</strong> Delegates to
     * {@link Collections#sort(java.util.List)} from the
     * Collections Framework.</p>
     *
     * @param stack the Stack to sort
     */
    public static void sortNumbers(Stack<Integer> stack) {
        Collections.sort(stack);
    }

    /**
     * Prints each element of the Stack (now sorted) one per line.
     *
     * @param stack the sorted Stack to print
     */
    public static void printNumbers(Stack<Integer> stack) {
        System.out.println("Sorted output:");
        for (Integer n : stack) {
            System.out.println(n);
        }
    }
}
