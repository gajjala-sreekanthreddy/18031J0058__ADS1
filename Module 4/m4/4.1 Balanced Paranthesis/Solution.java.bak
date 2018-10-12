import java.util.Scanner;
import java.util.Stack;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Solution for Algorithms 4th Edition 1.3.4
 */
public class ExpressionChecker {
    public static void main(String[] args) {
        ExpressionChecker instance = new ExpressionChecker();

        Scanner scanner = new Scanner(in);

        System.out.println("Enter expression to check :");
        while (scanner.hasNext()) {
            String value = scanner.next();
            out.println("Input: " + value);


            if ("exit".equals(value)) {
                break;
            }
            instance.evaluate(value);
            System.out.println("Enter expression to check :");
        }
    }

    /**
     * This method checks entered string to correctness
     *
     * @param value String to be evaluated
     */
    private void evaluate(String value) {

        if (StringUtils.isEmpty(value)) {
            System.out.println("Input String is invalid");
        } else {
            char[] characters = value.toCharArray();

            // Stack for storing all characters in char array
            Stack<Character> characterStack = new Stack<Character>();
            // Stack for storing all unbalanced characters
            Stack<Character> unBalanceCharacterStack = new Stack<Character>();
            // This variable is used to peek at unbalanced character stack
            Character prevCharacter = null;

            // Add all characters in string to stack
            for (Character c : characters) {
                characterStack.push(c);
            }

            while (!characterStack.isEmpty()) {

                Character element = characterStack.pop();

                // Check if element on top of character stack +
                // element on top of unbalanced stack make a pair
                // like {}, [] or ()
                if (elementsMatch(element, prevCharacter)) {
                    // If a pair is formed then pop the element from
                    // unbalanced stack.
                    unBalanceCharacterStack.pop();

                } else {
                    // If no pair is found then push the element on top
                    // of character stack to unbalanced stack
                    unBalanceCharacterStack.push(element);

                }

                // Set previous character from top of unbalanced stack
                if (!unBalanceCharacterStack.isEmpty())
                    prevCharacter = unBalanceCharacterStack.peek();
            }

            // if there are no elements in unbalanced stack then
            // string is valid
            if (unBalanceCharacterStack.isEmpty())
                System.out.println("Valid");
            else
                System.out.println("Invalid");
        }

    }

    /**
     *
     * @param element element from top of character stack
     * @param prevCharacter Element from top of unbalanced stack
     * @return True if a pair like {}, [] or () is formed.
     */
    private boolean elementsMatch(Character element, Character prevCharacter) {

        String finalString = ObjectUtils.toString(element) + ObjectUtils.toString(prevCharacter);
        return "{}".equals(finalString) || "()".equals(finalString) || "[]".equals(finalString);


    }


}