public class MyString {

    // Converts a string to lowercase
    public static String lowerCase(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            result.append(Character.toLowerCase(str.charAt(i)));
        }
        return result.toString();
    }

    // Vérifie si str2 est une sous-chaîne de str1
    public static boolean contains(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new IllegalArgumentException("Strings cannot be null");
        }
        if (str2.isEmpty()) {
            return true;
        }
        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            boolean found = true;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Tests
        System.out.println(lowerCase("Hello World")); // Output: hello world
        System.out.println(lowerCase("EaSy PeAsY LeMoN SqUeEzy")); // Output: easy peasy lemon squeezy
    }
}

