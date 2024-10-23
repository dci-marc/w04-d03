package org.digitalcareerinstitute;
//hint: You do not need to create a method here
// hint: prepare a few variables with sample text and use replaceAll() directly in the main method
public class Task3 {
    public  static void main(String[] args) {
        String text = "A dogmatic dog buys dogecoin to become rich and buy hotdogs every day.";
        String result = text.replaceAll("\\bdog\\b", "cat");
        System.out.println(result);
    }
}
