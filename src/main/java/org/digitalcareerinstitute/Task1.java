package org.digitalcareerinstitute;

//hint: create a function (method) that returns a boolean
// hint: call the function's examples in the main method.
// hint: use regular expressions

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        assert isMath("5 + 2") == true : "Test failed.";
        assert isMath("9 * 1") == true : "Test failed.";
        assert isMath("hello world") == false: "Test failed.";
        assert isMath("123") == false : "Test failed.";
        assert isMath("5 + foo") == false : "Test failed.";
    }

    /**
     * This method checks if the input is a math expression
     * @param input - the input to check
     * @return boolean
     */
    private static boolean isMath(String input) {
        Pattern pattern = Pattern.compile("[\\+\\-\\*\\/0-9]");
        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }
}
