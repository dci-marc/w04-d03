package org.digitalcareerinstitute;

// Cipher algorithm
//hint: building out strings can help

public class Task2 {
    public static void main(String[] args) {
        assert cipherSecret("Princess", "InfamousJohn", 1970) instanceof String == true : "Test failed.";
        try {
            cipherSecret("a", "b", 1);
            assert false : "Test failed. Expected IllegalArgumentException.";
        } catch (IllegalArgumentException e) {
            assert true;
        }
    }

    private static String cipherSecret(String loveSecret, String loveName, int yearOfBirth) {
        StringBuilder builder = new StringBuilder();
        String secret = loveSecret+loveName;
        builder
            .append(secret)
            .reverse()
            .append(yearOfBirth);

        if (builder.length() < 8) {
            throw new IllegalArgumentException("The resulting secret is too short.");
        }

        return builder.toString();
    }
}
