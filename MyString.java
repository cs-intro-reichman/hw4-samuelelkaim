public class MyString {

    // Vérifie si str2 est une sous-chaîne de str1
    public static boolean contains(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new IllegalArgumentException("Strings cannot be null");
        }
        if (str2.isEmpty()) {
            return true; // Une chaîne vide est toujours contenue
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

    // Vérifie si str2 est un préfixe de str1
    public static boolean isPrefix(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new IllegalArgumentException("Strings cannot be null");
        }
        if (str2.length() > str1.length()) {
            return false;
        }
        for (int i = 0; i < str2.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Méthode principale pour les tests
    public static void main(String[] args) {
        try {
            // Tests de base
            System.out.println("Test contains:");
            System.out.println(contains("hello world", "world")); // true
            System.out.println(contains("hello world", "planet")); // false
            System.out.println(contains("hello", "")); // true

            System.out.println("\nTest isPrefix:");
            System.out.println(isPrefix("hello", "he")); // true
            System.out.println(isPrefix("hello", "hello world")); // false

            // Cas limites
            System.out.println("\nEdge Cases:");
            System.out.println(contains("", "")); // true
            System.out.println(contains("abc", "")); // true
            System.out.println(contains("", "abc")); // false
            System.out.println(isPrefix("", "")); // true
            System.out.println(isPrefix("abc", "")); // true
            System.out.println(isPrefix("", "abc")); // false
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
